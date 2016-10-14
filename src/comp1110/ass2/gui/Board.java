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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

import static comp1110.ass2.LinkGame.getSolutions;
import static comp1110.ass2.LinkGame.isPlacementValid;

public class Board extends Application {
    // Game board size variables
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
    private static final int SQUARE_SIZE = 80;
    private static final int CIRCLE_SIZE = (int) (SQUARE_SIZE * 0.3);
    private static final int PIECE_IMAGE_SIZE = 3*SQUARE_SIZE;
    private static final double ROW_HEIGHT = SQUARE_SIZE * 0.8660254; // 60 degrees
    private static final int X_BORDER = 230 - PIECE_IMAGE_SIZE / 2;
    private static final int Y_BORDER = 250 - PIECE_IMAGE_SIZE / 2;

    private static final String URI_BASE = "assets/";

    // Group declarations
    private final Group root = new Group();
    private final Group pieces = new Group();
    private final Group pegs = new Group();
    private final Group controls = new Group();
    private final Group hints = new Group();
    private final Group warnings = new Group();
    private final Group instructions = new Group();

    private final Pegs[] board = new Pegs[24];
    private final ArrayList<Circle> pegList = new ArrayList<>();
    private String placement = "";
    private ArrayList<String> solutions = new ArrayList<>();
    private String startPlacement = "";
    private boolean dynamicHints = false;

    private static Stage primaryStage;
    private Scene startScene, mainScene;

    /*
      Solutions array is set up as solution, easy, hard, expert [placements].
      Easy placements have 9 pieces, hard placements have 6 pieces, and expert placements have 4 pieces.
      Placements have been made by hand, but given time and processing power, could be generated using findUniqueSolution
        in LinkGame.
      Any solutions not starting with BAA are taken from Steve Blackburn.
     */
    private final String[][] solutionSet = {
        //  SOLUTION                                    EASY                            HARD                    EXPERT
            {"GAEWBABCDJDALEFMFCCGLUHBTIAQJCKKBILF",    "WBABCDMFCCGLUHBTIAQJCKKBILF",  "WBACGLTIAQJCKKBILF",   "WBACGLQJCKKB"},
            {"BAAEBDVCJKDGSEBLFFWGBGHLNIKIJAPKFQLA",    "BAAEBDVCJKDGSEBLFFWGBGHLIJA",  "BAAEBDVCJKDGSEBLFF",   "BAAEBDVCJKDG"},
            {"BAAEBDVCJODDHEAMFKPGLLHHIICKJGWKCNLE",    "BAAEBDVCJODDHEAMFKPGLLHHIIC",  "BAAEBDVCJODDHEAMFK",   "BAAEBDVCJODD"},
            {"BAAEBGWCAGDFJEJRFEVGISHBLIHIJAUKHOLA",    "BAAEBGWCAGDFJEJRFEVGISHBLIH",  "BAAEBGWCAGDFJEJSHB",   "BAAJEJWCASHB"},
            {"BAAEBGUCAGDFLEHWFBPGGSHBNICKJEIKKHLJ",    "BAAEBGUCAGDFLEHWFBPGGSHBHLJ",  "BAAUCALEHPGGSHBHLJ",   "BAAEBGPGGHLJ"},
            {"BAAEBGWCAGDFJEJRFEVGIHHDLIHSJIUKHPLH",    "BAAEBGWCAJEJRFEVGIHHDLIHSJI",  "BAAWCARFEHHDLIHSJI",   "BAAJEJHHDRFE"}
    };
    // Another to format: [BAAEBGWCAGDFJEJRFEHHDLIHSJIUKHPLH, BAAEBGWCAGDFJEJRFELIHSJIUKHPLH, BAAEBGGDFJEJRFELIHSJIUKHPLH, BAAEBGGDFJEJRFESJIUKHPLH, BAAGDFJEJRFESJIUKHPLH, BAAGDFJEJRFESJIUKH, BAAJEJRFESJIUKH, BAAEBGGDFJEJRFESJIUKH, BAAEBGGDFJEJRFESJI, BAAEBGGDFRFESJI, BAAEBGJEJRFESJI, BAAJEJRFESJI, BAAEBGRFESJI, BAAEBGRFESJI, BAAEBGGDFJEJRFESJI, BAAGDFJEJRFESJI, BAAJEJRFESJI, BAAEBGGDFRFESJI, BAAEBGRFESJI, BAAEBGGDFRFESJI] BAAEBGGDFJEJRFESJI BAAEBGJEJRFESJI BAAEBGRFESJI

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
         *
         * @param id A character ID between A and L inclusive, corresponding to the piece.
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

            setOnMouseReleased(e -> snapPeg());

            setOnKeyPressed(e -> {                              // due to limitations in the engine, pieces must first be dragged
                if (e.getCode() == KeyCode.E)                   // before they can be rotated or flipped
                    rotatePiece(-1);
                if (e.getCode() == KeyCode.R)
                    rotatePiece(1);
                if (e.getCode() == KeyCode.F)
                    flipPiece();
            });

            setOnScroll(e -> rotatePiece(1) );                  // alternate control to rotate piece
        }

        /**
         * Querying methods.
         */
        int getPosition() { return this.position; }
        boolean isFlipped() { return getScaleY() == -1; }
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
            int i = 0;
            for (Circle c : pegList) {
                double distance = getDistanceTo(c.getLayoutX(), c.getLayoutY());
                if ( distance < d) {
                    d = distance;
                    n = c;
                    this.position=i;
                }
                i = i + 1;
            }
            return n;
        }

        /**
         * Places a piece centred on a peg rather than where the player lets go of the piece.
         */
        private void snapPeg() {
            Circle n = getNearestPeg();

            setLayoutX(n.getLayoutX() - PIECE_IMAGE_SIZE / 2);
            setLayoutY(n.getLayoutY() - PIECE_IMAGE_SIZE / 2);

            if (pieceOverlaps())
                snapHome();
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
           // System.out.println(currPlacement);
            if (isPlacementValid(currPlacement)) {
                placement = currPlacement;
                if (currPlacement.length() == 36)
                    setVictoryScene();
                if (currPlacement.length() >= 18) { // Can almost do 21, but there's a bit of lag when placing (0.3s computation time)
                    String[] tmpSolutions = getSolutions(currPlacement);
                    if (tmpSolutions.length > 0 && dynamicHints)
                        loadHints(tmpSolutions[0]);
                }
                return false;
            }
            else
                return true;
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
        private double positiveOrientation(double angle) {
            while(angle < 0)
                angle += 360;
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
    private void createBoard() {
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
     * Given a solution string, sets the global initial placement string to a random substring of the solution.
     * Written by Yicong and added to by Alex.
     *
     * @param n Number of pieces to place.
     */
    private void makeinitialPlacement(String solution, int n) {
        primaryStage.setScene(mainScene);
        if (n == 0)
            placement = "";
        else {
            List<String> so1 = new ArrayList<>();   //so1 contains 12 different piece placement in order
            List<Boolean> state = new ArrayList<>();  //if it used,then it is true;
            Random r = new Random();
            int order;

            for (int i = 0; i < solution.length() / 3; i++) {
                so1.add(solution.substring(3 * i, 3 * i + 3));
                state.add(false);
            }

            for (int j = 0; j < n; j++) {
                do order = r.nextInt(12);                //pick 6 pieces randomly
                    while (state.get(order));
                state.set(order, true);
                placement += so1.get(order);      //get the placement
            }

            startPlacement = placement;
        }
    }

    /**
     * Another helper method. Intended for use with generation solutions.
     * Written by Alex.
     *
     * @param difficulty An integer 0 to 2 for easy through expert difficulties, or 3 for free-form
     */
    private void makeInitialPlacement(int difficulty) {
        if (difficulty > 3)
            throw new IllegalArgumentException("Invalid difficulty " + difficulty);

        // Reset solution list on a new game.
        while (solutions.size() > 0)
            solutions.remove(0);

        Random r = new Random();
        int s;

        if (difficulty == 3) {
            placement = "";
            dynamicHints = true;
        } else {
            s = r.nextInt(solutionSet.length);
            placement = solutionSet[s][difficulty + 1];
            solutions.add(solutionSet[s][0]);
            loadHints(solutionSet[s][0]);
        }
        startPlacement = placement;
        primaryStage.setScene(mainScene);
        pieces.getChildren().clear();
        createLockedPieces(placement, pieces, true);
    }

    /**
     * Creates a set of locked pieces given a placement string.
     * Written by Yicong and modularised by Alex.
     *
     * @param placement A valid placement string.
     * @param g The group to add the pieces to.
     * @param allPieces If true, will place all pieces not in the placement string in their initial positions, unlocked.
     */
    private void createLockedPieces(String placement, Group g, boolean allPieces) {
        if (!placement.equals("")&&!isPlacementValid(placement))
            throw new IllegalArgumentException("Not a valid placement string for createLockedPieces");
        Map<Character,String> placementMap = new HashMap<>();
        for (int i = 0; i < placement.length() / 3; i++)
            placementMap.put(placement.charAt(3*i+1), placement.substring(3*i,3*i+3));

        for (char p = 'A'; p <= 'L'; p++) {
            if (placementMap.containsKey(p)) {
                String pieces = placementMap.get(p);
                int location = pieces.charAt(0) - 'A';
                int rotation = pieces.charAt(2) - 'A';
                int flip = rotation > 5 ? -1 : 1;
                int yPeg = location / 6;
                int xPeg = location % 6;

                LockedPiece piece = new LockedPiece(p, xPeg, yPeg, rotation % 6, flip);
                piece.setPosition(location);
                g.getChildren().add(piece);
            } else if (allPieces) {
                FXPiece piece = new FXPiece(p);
                piece.setPosition(-1);
                g.getChildren().add(piece);
            }
        }
    }

    /**
     * Creates the instruction image.
     */
    private void loadInstructions() {
        ImageView instruction=new ImageView(new Image(Board.class.getResource(URI_BASE+"instruction.jpg").toString()));
        instructions.getChildren().add(instruction);
    }

    /**
     * Creates a visual overlay of a solution.
     * @param solution A valid placement solution string.
     */
    private void loadHints(String solution) {
        if (solution.length() != 36)
            throw new IllegalArgumentException("Invalid solution string for loadHints");

        // Reset hints on a new game.
        hints.getChildren().clear();

        createLockedPieces(solution, hints, false);
    }

    /**
     * Creates the button controls (restart and new game) present in the bottom right corner of the game screen.
     * Written by Yicong.
     */
    private void makeControls() {
        Button button1 = new Button("New Game");
        button1.setLayoutX(BOARD_WIDTH - 105);
        button1.setLayoutY(BOARD_HEIGHT - 40);
        button1.setOnAction(e -> {
            Scene startScene= setWelcomeScene();
            primaryStage.setScene(startScene);   // if the restart button is clicked, goes to the main
        });
        controls.getChildren().add(button1);
        Button button2 = new Button("Restart");
        button2.setLayoutX(BOARD_WIDTH - 80);
        button2.setLayoutY(BOARD_HEIGHT - 80);
        button2.setOnAction(e -> {
            placement = startPlacement;
            pieces.getChildren().clear();
            createLockedPieces(startPlacement, pieces, true);
        });
        controls.getChildren().add(button2);
    }

    /**
     * Modular class to create a button in setWelcomeScene.
     * Written by Alex.
     */
    private class ImageButton extends ImageView {
        ImageButton(int imageIndex, double x, double y) {
            setImage(new Image(Board.class.getResource(URI_BASE+imageIndex+".png").toString()));
            setStyle("-fx-background-color: transparent;");
            setLayoutX(x);
            setLayoutY(y);
        }

        // Alternate constructor, given the pieces are created on the same y coordinate.
        ImageButton(int imageIndex, double x) {
            setImage(new Image(Board.class.getResource(URI_BASE+imageIndex+".png").toString()));
            setStyle("-fx-background-color: transparent;");
            setLayoutX(x);
            setLayoutY(450);
        }
    }

    /**
     * Creates the welcoming scene.
     * Created by Yicong, modularised and tidied by Alex.
     *
     * @return The opening splash screen.
     */
    private Scene setWelcomeScene() {
        System.out.println("Loading welcome splash...");

        Group start= new Group();
        Scene startScene = new Scene(start, BOARD_WIDTH, BOARD_HEIGHT);

        //add background Image
        Image background=new Image(Board.class.getResource("background.jpg").toString());

        //add button easy , when click, there are 9 pieces already on board
        ImageButton easyMode = new ImageButton(1, 100);
        easyMode.setOnMouseReleased(e -> makeInitialPlacement(0));

        //add button hard , when click, there are 6 pieces already on board
        ImageButton hardMode = new ImageButton(2, 300);
        hardMode.setOnMouseReleased(e -> makeInitialPlacement(1));

        //add button hard , when click, there are 9 pieces already on board
        ImageButton expertMode = new ImageButton(3, 500);
        expertMode.setOnMouseReleased(e -> makeInitialPlacement(2));

        //this button represents brand new game
        ImageButton normalMode = new ImageButton(4, 700);
        normalMode.setOnMousePressed(e -> makeInitialPlacement(3));

        System.out.println(".buttons");

        // some hints for the player to click on the button to enter the game
        ImageView title = new ImageView(new Image(Board.class.getResource(URI_BASE+"title.jpg").toString()));
        title.setLayoutX(0);
        title.setLayoutY(550);

        start.getChildren().add(new ImageView(background));
        start.getChildren().add(easyMode);
        start.getChildren().add(hardMode);
        start.getChildren().add(expertMode);
        start.getChildren().add(normalMode);
        start.getChildren().add(title);

        System.out.println(".gui");

        this.startScene = startScene;
        System.out.println("...done");
        return startScene;
    }

    /**
     * Initialises the main game page.
     * Written by Yicong and Alex.
     */
    private void setMainScene() {
        System.out.println("Loading game screen...");

        Scene scene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
        root.getChildren().add(pegs);
        root.getChildren().add(hints);
            hints.setOpacity(0);
        root.getChildren().add(pieces);
        root.getChildren().add(controls);
        root.getChildren().add(warnings);
        System.out.println(".resources");

        createBoard();
        loadInstructions();
        makeControls();
        System.out.println(".gui");

        Text ins = new Text(20, 30, "Press 'I' for Instructions");
        ins.setFill(Color.DARKBLUE);
        ins.setFont(new Font(20));
        root.getChildren().add(ins);
        System.out.println(".text");

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.SLASH)
                hints.setOpacity(0.2);
            if (e.getCode() == KeyCode.I && !root.getChildren().contains(instructions))
                root.getChildren().add(instructions);
        });

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.SLASH)   hints.setOpacity(0);
            if (e.getCode() == KeyCode.I)       root.getChildren().remove(instructions);
        });
        System.out.println(".keys");

        mainScene = scene;
        System.out.println("...done");
    }

    /**
     * Creates the victory splash on completing the game.
     * Written by Alex.
     */
    private void setVictoryScene() {
        System.out.println("Loading victory...");

        Group vic = new Group();

        Rectangle bg = new Rectangle(BOARD_WIDTH, BOARD_HEIGHT, Color.WHITE);
        bg.setOpacity(0.8);
        vic.getChildren().add(bg);

        System.out.println(".background");

        Text ins = new Text(BOARD_WIDTH / 2 - 100, BOARD_HEIGHT / 2 - 10, "You win!");
        ins.setFill(Color.DARKBLUE);
        ins.setFont(new Font(50));
        vic.getChildren().add(ins);

        System.out.println(".text");

        Button returnButton = new Button("Return home");
        returnButton.setPrefWidth(150);
        returnButton.setPrefHeight(20);
        returnButton.setLayoutX(BOARD_WIDTH / 2 - 75);
        returnButton.setLayoutY(BOARD_HEIGHT * 3/4 - 10);
        returnButton.setOnMouseReleased(e -> {
            primaryStage.setScene(startScene);
            root.getChildren().remove(vic);
        });
        vic.getChildren().add(returnButton);

        System.out.println(".button");

        root.getChildren().add(vic);
        System.out.println("...done");
    }

    /**
     * Loads some BGM.
     * Written by Alex.
     * Music is from Bensound and is distributed under the Creative Commons license.
     */
    private void loadMusic() {
        System.out.println("Loading music...");

        MediaPlayer music = new MediaPlayer(new Media(Board.class.getResource(URI_BASE + "music.mp3").toString()));

        music.setAutoPlay(true);
        music.setOnEndOfMedia(() -> music.seek(Duration.ZERO));
        music.setVolume(0.2);
        music.play();

        System.out.println("...done");
    }

    /**
     * Loads solutions from a provided file in the assets folder.
     * Though it ended up unused, code is taken from T.J. Crowder on StackExchange.
     */
    private void loadSolutions() {
//        try {
//            try (FileInputStream in = new FileInputStream("assets/solutions.txt")) {
//                for (int i = 0; i < 100; i++) {
//                    byte b = (byte) in.read();
//                    System.out.println(b);
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("Loading solutions...");

        String line;
        try (
                InputStream fis = new FileInputStream("assets/solutions.txt");
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr)
        ) {
            while ((line = br.readLine()) != null) {
                solutions.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("...done");
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Board.primaryStage = primaryStage;
        primaryStage.setTitle("IQ Link");
//        loadSolutions();
        setWelcomeScene();
        setMainScene();
//        loadMusic(); // Doesn't run on a typical Unix system due to missing libraries. Works fine on Windows.

        primaryStage.setScene(startScene);
        primaryStage.show();
    }
}
