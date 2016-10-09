package comp1110.ass2.gui;

import comp1110.ass2.Pegs;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.*;

import static comp1110.ass2.LinkGame.isPlacementValid;

public class Board extends Application {
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
    private static final int SQUARE_SIZE = 80;
    private static final int CIRCLE_SIZE = (int) (SQUARE_SIZE * 0.3);
    private static final int PIECE_IMAGE_SIZE = 3*SQUARE_SIZE;
    private static final double ROW_HEIGHT = SQUARE_SIZE * 0.8660254; // 60 degrees
    private static final int X_BORDER = 230 - PIECE_IMAGE_SIZE / 2;
    private static final int Y_BORDER = 250 - PIECE_IMAGE_SIZE / 2;

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group pieces = new Group();
    private final Group pegs = new Group();
    private final Group controls = new Group();
    private final Group hints = new Group();
    private final Group warnings = new Group();
    private final Group instructions = new Group();

    private final Pegs[] board = new Pegs[24];
    private final ArrayList<Circle> pegList = new ArrayList<>();
    private boolean hovering;
    private String placement="";
    private String startPlacement="";

    private static Stage primaryStage;
    private Scene startScene;
    private Scene mainScene;

    private class BGM extends MediaView {
        BGM(int a) {
        }
    }

//    private final ArrayList<String> easy= new ArrayList(Arrays.asList("BAA","BAAHBA","BAAHBAWEB",""));

    // FIXME Task 8: Implement a basic playable Link Game in JavaFX that only allows pieces to be placed in valid places
    // FIXME Task 11: Implement hints
    // FIXME Task 12: Generate interesting starting placements

    /**
     * The driving class behind the game. Contains anything to do with manipulating or querying a piece.
     * Written by Alex, except where noted.
     * Initial inspiration for event methods taken from Steve Blackburn.
     */
    private class FXPiece extends ImageView {
        char id;
        int initX, initY;
        double mouseX, mouseY;
        int position;

        /**
         * Instantiates a piece.
         * @param id A character ID between A and L inclusive, corresponding to the piece.
         * @throws IllegalArgumentException Given an ID greater than L.
         */
        FXPiece(char id) {
            if (id > 'L') throw new IllegalArgumentException("Invalid piece id: " + id);
            this.id = id;
            setImage(new Image(Viewer.class.getResource(URI_BASE + id + ".png").toString()));
            setFitHeight(PIECE_IMAGE_SIZE);
            setFitWidth(PIECE_IMAGE_SIZE);
            findInitialPlacement();

            setLayoutX(initX);
            setLayoutY(initY);

            setOnMousePressed(e -> {
                mouseX = e.getSceneX() - PIECE_IMAGE_SIZE / 2;  // we want to manipulate from the centre of the piece,
                mouseY = e.getSceneY() - PIECE_IMAGE_SIZE / 2;  // not the corner (which is transparent)
            });

            setOnMouseDragged(e -> {
                setLayoutX(mouseX);
                setLayoutY(mouseY);
                mouseX = e.getSceneX() - PIECE_IMAGE_SIZE / 2;
                mouseY = e.getSceneY() - PIECE_IMAGE_SIZE / 2;
                warnings.getChildren().clear();                 // no point warning someone about something that doesn't matter
                requestFocus();
            });

            setOnMouseReleased(e -> {
//                grabLocation();                                 // testing
                snapPeg();
            });

            setOnKeyPressed(e -> {                              // due to limitations in the engine, pieces must first be dragged
                if (e.getCode() == KeyCode.E)                   // before they can be rotated or flipped
                    rotatePiece(-1);
                if (e.getCode() == KeyCode.R)
                    rotatePiece(1);
                if (e.getCode() == KeyCode.F)
                    flipPiece();

                //System.out.println(hovering);
            });

            setOnScroll(e -> rotatePiece(1) );                  // alternate control to rotate piece
        }

        /**
         * Querying methods.
         */
        int getPosition() { return this.position; }
        boolean isFlipped() { return getScaleY() == -1; }
        String getPieceString() { return this.toString(); }

        /**
         * Sets the position component of the piece's data. Numbered 1 to 24, starting from the top left and working
         *  left to right, top to bottom. -1 is off the board.
         * @param pos The position integer.
         */
        void setPosition(int pos) {
            if (pos > 24) throw new IndexOutOfBoundsException("Invalid position coordinate.");
            else
                this.position = pos;
        }

        /**
         * Fetch method for the initial placement of a piece. Four pieces along the top and bottom, and two
         *  on either side.
         * TODO: Make location dynamic?
         */
        private void findInitialPlacement() {
            int mod = id - 'A';
            if (mod < 4) {
                initX = mod * 2 * SQUARE_SIZE + SQUARE_SIZE * 3 / 2;
                if (mod % 2 != 0) initY = 40;
                else initY = -40;
            } else if (mod < 6) {
                initX = 0;
                initY = PIECE_IMAGE_SIZE * 2 / 3 * (mod - 3);
            } else if (mod < 8) {
                initX = BOARD_WIDTH - PIECE_IMAGE_SIZE + SQUARE_SIZE / 3;
                initY = PIECE_IMAGE_SIZE * 2 / 3 * (mod - 5);
            } else {
                initX = (mod - 8) * 2 * SQUARE_SIZE + SQUARE_SIZE * 3 / 2;
                initY = BOARD_HEIGHT - SQUARE_SIZE * 5 / 2;
            }
        }

        /**
         * Visually rotates a piece and adds its info to the placement string. Visualises a warning on an incorrect
         *  placement.
         * @param modifier Index to rotate piece by. Will rotate the piece clockwise by 60 degrees multiplied by the
         *                 modifier. Can be negative.
         */
        private void rotatePiece(int modifier) {
            warnings.getChildren().clear();
            setRotate((getRotate() + 60 * modifier) % 360);
            if (pieceOverlaps())
                setWarning();
        }

        /**
         * Visually flips a piece and clears any warnings.
         */
        private void flipPiece() {
            warnings.getChildren().clear();
            setScaleY(getScaleY() * -1);
            if (pieceOverlaps())
                setWarning();
        }

        /**
         * Method to find the distance from a piece to a circle/peg.
         * @param c The circle to find the distance to.
         * @return Geometric distance.
         */
        private double getDistanceTo(Circle c) {
            double x = c.getLayoutY();
            double y = c.getCenterY();
            return Math.sqrt( (x - getLayoutX())*(x - getLayoutX()) + (y - getLayoutY())*(y - getLayoutY()));
        }

        /**
         * Alternate method to find distance from a piece to a point.
         * @param x X coordinate of the location to be measured to.
         * @param y Matching Y coordinate.
         * @return Geometric distance to the point.
         */
        private double getDistanceTo(double x, double y) {
            x -= PIECE_IMAGE_SIZE / 2;
            y -= PIECE_IMAGE_SIZE / 2;
            return Math.sqrt( (x - getLayoutX())*(x - getLayoutX()) + (y - getLayoutY())*(y - getLayoutY()));
        }

        /**
         * Finds the nearest peg to use with snapping a piece.
         * @return The closest circle.
         */
        private Circle getNearestPeg() {
            Circle n = null;
            double d = 1000;
            int i=0;
            for (Circle c : pegList) {
                double distance = getDistanceTo(c.getLayoutX(), c.getLayoutY());
//                System.out.println(distance);
                if ( distance < d) {
                    d = distance;
                    n = c;
                    this.position=i;
                }
                i=i+1;
            }
//            System.out.println("x: " + n.getLayoutX() + ", y: " + n.getLayoutY()); // debugging
            return n;
        }

        // TODO: Remember what this was for and use it
        private void checkLocation() {
            for (Circle c : pegList ) {
                double d = getDistanceTo(c);
            }
        }

        /**
         * Places a piece centred on a peg rather than where the player lets go of the piece.
         * TODO: Implement bounce home.
         */
        private void snapPeg() {
            Circle n = getNearestPeg();

            setLayoutX(n.getLayoutX() - PIECE_IMAGE_SIZE / 2);
            setLayoutY(n.getLayoutY() - PIECE_IMAGE_SIZE / 2);

            if (pieceOverlaps())
               //setWarning();
                snapHome();
            else
                placement += getPieceString();
        }

        /**
         * Draw a warning image if the player places an incorrect piece.
         * Written by Yicong.
         */
        private void setWarning()
        {
            ImageView warning=new ImageView(new Image(Board.class.getResource(URI_BASE+"warning.jpg").toString()));
            warning.setLayoutX(380);
            warning.setLayoutY(0);
            warnings.getChildren().add(warning);

        }

        /**
         * Checks whether or not a placed piece overlaps a piece that is already placed.
         * @return True if the piece is invalid, false otherwise.
         */
        private boolean pieceOverlaps() {
            String currPlacement = "";
            for (Node p : pieces.getChildren()) {
                if (!p.toString().equals(""))
                    currPlacement += p.toString();
            }
            System.out.println(currPlacement);
            if (isPlacementValid(currPlacement)) {
                placement = currPlacement;
                return false;
            }
            else{return true;}

        }

        /**
         * Deprecated debugging method for snapGrid.
         */
        private void grabLocation() {
            int nearestYIndex = (int) ((getLayoutY() + SQUARE_SIZE / 2 - Y_BORDER) / ROW_HEIGHT);
            int xOffset = 0;
            if (nearestYIndex % 2 == 1) xOffset += SQUARE_SIZE / 2;
            int nearestXIndex = (int) ((getLayoutX() + SQUARE_SIZE / 2 - X_BORDER - xOffset) / SQUARE_SIZE);

            double nearestY = nearestYIndex * ROW_HEIGHT + Y_BORDER;
            double nearestX = nearestXIndex * SQUARE_SIZE + X_BORDER + xOffset;

           /* System.out.println("Raw location: " + getLayoutX() + ", " + getLayoutY());
            System.out.println("Nearest points: " + nearestX + ", " + nearestY);
            System.out.println("Nearest indexes: " + nearestXIndex + ", " + nearestYIndex);
            System.out.println(this);*/

        }

        /**
         * Snapping method made deprecated by the introduction of using the pegs' locations in snapPeg.
         */
        private void snapGrid() {
            boolean onGrid = true;
            int nearestYIndex = (int) ((getLayoutY() + SQUARE_SIZE / 2 - Y_BORDER) / ROW_HEIGHT);
            if (nearestYIndex < 0) {    // bounce if placing outside the grid
                nearestYIndex = 0;
                onGrid = false;
            }
            if (nearestYIndex > 3) {
                nearestYIndex = 3;
                onGrid = false;
            }
            int xOffset = 0;            // account for hexagonal placement
            if (nearestYIndex % 2 != 0) xOffset += SQUARE_SIZE / 2;
            int nearestXIndex = (int) ((getLayoutX() + SQUARE_SIZE / 2 - X_BORDER - xOffset) / SQUARE_SIZE);
            if (nearestXIndex < 0) {    // bounce again
                nearestXIndex = 0;
                onGrid = false;
            }
            if (nearestXIndex > 5) {
                nearestXIndex = 5;
                onGrid = false;
            }

            double nearestY = nearestYIndex * ROW_HEIGHT + Y_BORDER;
            double nearestX = nearestXIndex * SQUARE_SIZE + X_BORDER + xOffset;
            setPosition(nearestXIndex + nearestYIndex * 6);

            if (onGrid && isPlacementValid(getPieceString())) {
                 if (!pieceOverlaps()) {
                      setLayoutX(nearestX);
                      setLayoutY(nearestY);
                 } else
                     snapHome();
            } else
                snapHome();
        }

        /**
         * Modularising the returning home mechanic used in snapGrid and snapPeg.
         */
        private void snapHome() {
            setPosition(-1);
            setLayoutX(initX);
            setLayoutY(initY);
        }

        /**
         * Return a positive angle
         * Written by Yicong.
         * @return if angle<0, then make it a positive angle for mode calculation.
         */
        private double positiveOrientation(double angle)
        {
            while(angle<0)
                angle+=360;
            return angle;
        }
        /**
         * Converts a piece to a string.
         * Written by Yicong.
         * @return The three-character string that a piece is referred to by in LinkGame's arguments.
         */
        public String toString() {
            char orientation = (char) ('A' + (int)( (positiveOrientation(getRotate())/ 60)%6));
            if (isFlipped())
                orientation = (char) (orientation + 6);
            return (getPosition() == -1) ? "" : "" + (char) ('A' + getPosition()) + id + orientation;
        }
    }

    /**
     * A subclass of FXPiece that disables any movement commands on the piece. Used for initial placements.
     * Written by Alex.
     */
    private class LockedPiece extends FXPiece {
        LockedPiece(char id, int xPeg, int yPeg, int rotate, int flip) throws IllegalArgumentException {
            super(id);
            int xOffset = 0;
            if (yPeg % 2 != 0) xOffset += SQUARE_SIZE / 2;
            initY = (int) (yPeg * ROW_HEIGHT + Y_BORDER);
            initX = xPeg * SQUARE_SIZE + X_BORDER + xOffset;

            setLayoutX(initX);
            setLayoutY(initY);
            setRotate(rotate * 60);
            setScaleY(flip);

            setOnMousePressed(e -> {});
            setOnMouseDragged(e -> {});
            setOnMouseReleased(e -> {});
            setOnScroll(e -> {});
        }
    }

    /**
     * Creates the board for playing on. Draws 24 circles and initialises the board container.
     * Written by Yicong, optimised by Alex for readability and dynamicity.
     */
    private void createBoard()
    {
        int[] blank = {0,0,0,0,0,0};
        for (int i = 0; i < 24; i++) {
            board[i]=new Pegs(blank);
            board[i].updateStates(blank);
        }

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 6; col++) {
                double y = (row * ROW_HEIGHT ) + PIECE_IMAGE_SIZE / 2 + Y_BORDER;
                int xOffset = 0;
                if (row % 2 != 0) xOffset += SQUARE_SIZE / 2;
                double x = (col * SQUARE_SIZE) + PIECE_IMAGE_SIZE / 2 + X_BORDER + xOffset;

                Circle a = new Circle(0, 0, CIRCLE_SIZE, Color.LIGHTGRAY);
                a.setLayoutX(x);
                a.setLayoutY(y);
                pegs.getChildren().add(a);
                pegList.add(a);
            }
        }
    }

    /**
     * Creates a set of pieces on the board given a placement string. Any pieces not contained in the
     *  placement string are created in their initial locations.
     * Written by Yicong.
     * @param placement
     * TODO: Merge this and makeInitialPlacement
     * TODO: Split this into another sub-method (createPiece?) to use with the hints
     */
    private void makePieces(String placement) {
        pieces.getChildren().clear();
        Map<Character,String> prePieces= new HashMap<>();  // the piece as key, piecePlacement as value
        for (int i = 0; i < placement.length() / 3; i++)
            prePieces.put(placement.charAt(3*i+1),placement.substring(3*i,3*i+3));

        for (char p = 'A'; p <= 'L'; p++) {
            if (prePieces.containsKey(p))               //if it is in the starting placement
            {
                String piecePlacement=prePieces.get(p);
                int location = piecePlacement.charAt(0)-'A';                           // pulls the location char
                int rotation = piecePlacement.charAt(2)-'A';
                int flip = rotation > 5 ? - 1 : 1;
                int xPeg = location % 6;
                int yPeg = location / 6;

                LockedPiece piece= new LockedPiece(p,xPeg,yPeg,rotation%6,flip);
                piece.setPosition(location);
                pieces.getChildren().add(piece);
            } else {
                FXPiece piece = new FXPiece(p);
                piece.setPosition(-1);
                pieces.getChildren().add(piece);
            }
           // pieces.getChildren().clear();
        }
    }

    /**
     * Creates the button controls (restart and new game) present in the bottom right corner of the game screen.
     * TODO: Make the placement location dynamic
     */
    private void makeControls() {
        Button button1 = new Button("New Game");
        button1.setLayoutX(850);
        button1.setLayoutY(640);
        button1.setOnAction(e -> {
            Scene startScene= SetWelcomePage();
             primaryStage.setScene(startScene);   // if the restart button is clicked, goes to the main
        });
        controls.getChildren().add(button1);
        Button button2 = new Button("Restart");
        button2.setLayoutX(850);
        button2.setLayoutY(600);
        button2.setOnAction(e -> {
            placement=startPlacement;
            makePieces(startPlacement);
        });
        controls.getChildren().add(button2);
    }

    /**
     * Creates the instruction image.
     */
    private void loadInstruction() {
        ImageView instruction=new ImageView(new Image(Board.class.getResource(URI_BASE+"instruction.jpg").toString()));
        instructions.getChildren().add(instruction);
    }

    /**
     * Creates a text box containing the solution string.
     */
    private void loadHints() {
//    private void loadHints(String solution) {
        String solution = "BAAHBATCJRDKWEBEFDNGLPHEDIFMJJQKIKLJ";
        Map<Character,String> solutionMap = new HashMap<>();
        for (int i = 0; i < solution.length() / 3; i++)
            solutionMap.put(solution.charAt(3*i+1), solution.substring(3*i,3*i+3));

        for (char p = 'A'; p <= 'L'; p++) {
            if (solutionMap.containsKey(p)) {
                String pieces = solutionMap.get(p);
                int location = pieces.charAt(0) - 'A';
                int rotation = pieces.charAt(2) - 'A';
                int flip = rotation > 5 ? -1 : 1;
                int yPeg = location / 6;
                int xPeg = location % 6;

                LockedPiece piece = new LockedPiece(p, xPeg, yPeg, rotation % 6, flip);
                piece.setPosition(location);
                piece.setOpacity(0.2);
                hints.getChildren().add(piece);
            }
        }
//        int boxW = 470;
//        int boxH = 27;
//
//        Rectangle box = new Rectangle(10, BOARD_HEIGHT - boxH - 8, boxW, boxH);
//        box.setFill(Color.LIGHTGREY);
//
//        Text sol = new Text(15, BOARD_HEIGHT - 15, "BAAHBATCJRDKWEBEFDNGLPHEDIFMJJQKIKLJ");
//        sol.setFill(Color.DARKRED);
//        sol.setFont(new Font(20));
//
//        hints.getChildren().addAll(box, sol);
    }

    // if the placement is not well formed, return the warning
    // TODO: Implement or remove this if unneeded
    public void invalidPlacement(String placement) {

    }

    /**
     * Using a solution string, it breaks it down into each piece's data and returns a given number of them
     *  for an initial placement.
     * Written by Yicong.
     * @param num Number of pieces to return.
     * @return Partially complete solution string of multiple pieces.
     * FIXME Task 9: Implement starting placements
     */
    private String getInitPlacement(int num) {
        String solution1="BAAHBATCJRDKWEBEFDNGLPHEDIFMJJQKIKLJ";
        String InitPlacement="";
        List<String> so1=new ArrayList<>();   //so1 contains 12 different piece placement in order
        List<Boolean> state=new ArrayList<>();  //if it used,then it is true;
        Random r=new Random();
        int order;
        for (int i=0;i<solution1.length()/3;i++)
        {
            so1.add(solution1.substring(3*i,3*i+3));
            state.add(false);
        }
        for (int j=0;j<num;j++)
        {
            do{
                order=r.nextInt(12);                //pick 6 pieces randomly
            }while(state.get(order));
            state.set(order,true);
            InitPlacement+=so1.get(order);      //get the placement
        }
        startPlacement=InitPlacement;
        return InitPlacement;
    }


    /**
     * Creates the welcoming scene.
     * Created by Yicong, modularised and tidied by Alex.
     * @return The opening splash screen.
     * TODO: make placement location dynamic
     */
    private Scene SetWelcomePage() {
        Group start= new Group();
        Scene startScene = new Scene(start, BOARD_WIDTH, BOARD_HEIGHT);

        //add background Image
        Image background=new Image(Board.class.getResource("background.jpg").toString());

        //add button easy , when click, there are 9 pieces already on board
        ActionButton easyMode = new ActionButton(1, 100);
        easyMode.setOnMouseReleased(e -> makeInitialPlacement(9));

        //add button hard , when click, there are 6 pieces already on board
        ActionButton hardMode = new ActionButton(2, 300);
        hardMode.setOnMouseReleased(e -> makeInitialPlacement(6));

        //add button hard , when click, there are 9 pieces already on board
        ActionButton expertMode = new ActionButton(3, 500);
        expertMode.setOnMouseReleased(e -> makeInitialPlacement(3));

        //this button represents brand new game
        ActionButton normalMode = new ActionButton(4, 700);
        normalMode.setOnMousePressed(e -> makeInitialPlacement(0));

        // some hints for the player to click on the button to enter the game
        ImageView title=new ImageView(new Image(Board.class.getResource(URI_BASE+"title.jpg").toString()));
        title.setLayoutX(0);
        title.setLayoutY(550);

        start.getChildren().add(new ImageView(background));
        start.getChildren().add(easyMode);
        start.getChildren().add(hardMode);
        start.getChildren().add(expertMode);
        start.getChildren().add(normalMode);
        start.getChildren().add(title);

        this.startScene=startScene;
        return startScene;
    }

    /**
     * Modular class to create a button in SetWelcomePage.
     * Written by Alex.
     */
    private class ActionButton extends ImageView {
        ActionButton(int imageIndex, double x, double y) {
            setImage(new Image(Board.class.getResource(URI_BASE+imageIndex+".png").toString()));
            setStyle("-fx-background-color: transparent;");
            setLayoutX(x);
            setLayoutY(y);
        }

        // Alternate constructor, given the pieces are created on the same y coordinate.
        ActionButton(int imageIndex, double x) {
            setImage(new Image(Board.class.getResource(URI_BASE+imageIndex+".png").toString()));
            setStyle("-fx-background-color: transparent;");
            setLayoutX(x);
            setLayoutY(450);
        }
    }

    /**
     * Helper method for SetWelcomePage.
     * Written by Alex.
     * @param n Number of pieces to place.
     */
    private void makeInitialPlacement(int n) {
        primaryStage.setScene(mainScene);
        if (n == 0)
            placement = "";
        else
            placement = getInitPlacement(n);
        makePieces(placement);
    }

    ///this method is to create the main game scene
    private void SetMainPage() {
        Scene scene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
        root.getChildren().add(pegs);
        root.getChildren().add(pieces);
        root.getChildren().add(controls);
        root.getChildren().add(warnings);

        createBoard();
        loadHints();
        loadInstruction();
        makeControls();

        Text ins = new Text(20, 30, "Press 'I' for Instructions");
        ins.setFill(Color.DARKBLUE);
        ins.setFont(new Font(20));
        root.getChildren().add(ins);
        //placement="BAAHBATCJRDKWEBEFDNGLPHEDIFMJJQKIKLJ";
        //makePieces(placement);

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.SLASH && !root.getChildren().contains(hints))
                root.getChildren().add(hints);
            if (e.getCode() == KeyCode.I && !root.getChildren().contains(instructions))
                root.getChildren().add(instructions);
        });

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.SLASH) root.getChildren().remove(hints);
            if (e.getCode() == KeyCode.I) root.getChildren().remove(instructions);
        });

       this.mainScene=scene;
    }

    private void loadMusic() {
        MediaPlayer music = new MediaPlayer(new Media(Board.class.getResource(URI_BASE + "music.mp3").toString()));
        music.setAutoPlay(true);
        music.setOnEndOfMedia(() -> music.seek(Duration.ZERO));

        music.play();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Board.primaryStage =primaryStage;
        primaryStage.setTitle("IQ Link");
        SetWelcomePage();
        SetMainPage();
        loadMusic();
        primaryStage.setScene(startScene);
        primaryStage.show();
    }
}
