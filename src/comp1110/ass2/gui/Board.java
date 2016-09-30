package comp1110.ass2.gui;

import comp1110.ass2.Pegs;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

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

    private Pegs[] board = new Pegs[24];
    private boolean hovering;
    private String placement="";

    // FIXME Task 8: Implement a basic playable Link Game in JavaFX that only allows pieces to be placed in valid places

    // FIXME Task 9: Implement starting placements

    // FIXME Task 11: Implement hints

    // FIXME Task 12: Generate interesting starting placements

    // FIXME Stop pieces snapping home while being held and rotating
    // FIXME Remove bug on snapping to grid while placing at Y index -1
    // TODO Implement controls
    // TODO Reimplement hints (i.e., visual overlay)

    private class FXPiece extends ImageView {
        char id;
        int initX, initY;
        double mouseX, mouseY;
        int position;

        FXPiece(char id) throws IllegalArgumentException {
            if (id > 'L') throw new IllegalArgumentException("Invalid piece id: " + id);
            this.id = id;
            setImage(new Image(Viewer.class.getResource(URI_BASE + id + ".png").toString()));
            setFitHeight(PIECE_IMAGE_SIZE);
            setFitWidth(PIECE_IMAGE_SIZE);
            findInitialPlacement();

            setLayoutX(initX);
            setLayoutY(initY);

            setOnMousePressed(e -> {
                mouseX = e.getSceneX() - PIECE_IMAGE_SIZE / 2; // we want to manipulate from the centre of the piece,
                mouseY = e.getSceneY() - PIECE_IMAGE_SIZE / 2; // not the corner (which is transparent)
//                hovering = true;
            });

            setOnMouseDragged(e -> {
                setLayoutX(mouseX);
                setLayoutY(mouseY);
                mouseX = e.getSceneX() - PIECE_IMAGE_SIZE / 2;
                mouseY = e.getSceneY() - PIECE_IMAGE_SIZE / 2;
//                hovering = true;
                requestFocus();
            });

            setOnMouseReleased(e -> {
//                grabLocation();                     // testing
//                hovering = false;
                snapGrid();
                checkOverlap();
            });

            setOnKeyPressed(e -> {                  // due to limitations in the engine, pieces must first be dragged
//                System.out.println(e.getCode());    // before they can be rotated or flipped
                if (e.getCode() == KeyCode.E) {
                    rotatePiece();
//                    rotatePiece(-1);
//                    setRotate(getRotate() - 60);
                }
                if (e.getCode() == KeyCode.R) {
                      rotatePiece();
//                    rotatePiece(1);
//                    setRotate(getRotate() + 60);
                }
                if (e.getCode() == KeyCode.F) {
                    flipPiece();
                }
     //           checkOverlap();
                System.out.println(hovering);
            });

            setOnScroll(e -> {
                rotatePiece();
               // rotatePiece(1);                      // to update the piece's properties
               // setRotate(getRotate() + 60);
                //checkOverlap();
            });


    }

        public void setPosition(int pos) {
            this.position = pos;
        }

        public int getPosition() {
            return this.position;
        }

        private void findInitialPlacement() {
            int mod = id - 'A';
            if (mod < 4) {                                                  // row above the board
                initX = mod * 2 * SQUARE_SIZE + SQUARE_SIZE * 3 / 2;
                if (mod % 2 != 0) initY = 40;
                else initY = -40;
            } else if (mod < 6) {                                             // left row
                initX = 0;
                initY = PIECE_IMAGE_SIZE * 2 / 3 * (mod - 3);
            } else if (mod < 8) {
                initX = BOARD_WIDTH - PIECE_IMAGE_SIZE + SQUARE_SIZE / 3;   // right row
                initY = PIECE_IMAGE_SIZE * 2 / 3 * (mod - 5);
            } else {
                initX = (mod - 8) * 2 * SQUARE_SIZE + SQUARE_SIZE * 3 / 2;  // row below the board
                initY = BOARD_HEIGHT - SQUARE_SIZE * 5 / 2;
            }
        }

        // visually rotate a piece and update its data
        private void rotatePiece(int modifier) {

        }
        private void rotatePiece()
        {
            setRotate((getRotate() + 60) % 360);
//            snapGrid(); // enabling this here causes a bug where rotating a piece on the spot before moving it can cause it to snap to the grid, and isn't needed to do snapping on mouse release
        }
        // flip the selected piece
        private void flipPiece() {
            setScaleY(getScaleY() * -1);
            snapGrid(); // same as rotatePiece
        }

        private void checkOverlap() {

        }

        private void grabLocation() { // debugging method for snapGrid
            /*  -50 should snap to 0
                49 should snap to 0
                50 should snap to 1
                149 should snap to 1
             */

            int nearestYIndex = (int) ((getLayoutY() + SQUARE_SIZE / 2 - Y_BORDER) / ROW_HEIGHT);
            int xOffset = 0;
            if (nearestYIndex % 2 == 1) xOffset += SQUARE_SIZE / 2;
            int nearestXIndex = (int) ((getLayoutX() + SQUARE_SIZE / 2 - X_BORDER - xOffset) / SQUARE_SIZE);

            double nearestY = nearestYIndex * ROW_HEIGHT + Y_BORDER;
            double nearestX = nearestXIndex * SQUARE_SIZE + X_BORDER + xOffset;

            System.out.println("Raw location: " + getLayoutX() + ", " + getLayoutY());
            System.out.println("Nearest points: " + nearestX + ", " + nearestY);
            System.out.println("Nearest indexes: " + nearestXIndex + ", " + nearestYIndex);
            System.out.println(this);
//            if (isPlacementValid(this.toString())) {
//                setLayoutX(nearestX);
//                setLayoutY(nearestY);
//            } else {
//                setLayoutX(initX);
//                setLayoutY(initY);
//            }

        }

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
            if (onGrid && isPlacementValid(this.toString())) {
                String placement = "";
                for (Node p : pieces.getChildren()) {
                    if (!p.toString().equals(""))
                        placement += p.toString();
                }
               if (isPlacementValid(placement)) {
                   setLayoutX(nearestX);
                   setLayoutY(nearestY);
               }
               else {
                   snapHome();
               }
            } else {
                snapHome();
            }
        }

        // modularising the return home code
        private void snapHome() {
            setPosition(-1);
            setLayoutX(initX);
            setLayoutY(initY);
        }

        /// get PiecePlacement
        public String toString() {
            char orientation = (char) ('A' + (int) (getRotate() / 60));
            if(this.getScaleY()==-1)
                orientation=(char)(orientation+6);
            return (getPosition() == -1) ? "" : "" + (char) ('A' + getPosition()) + id + orientation;
        }
    }

    private class preplacedPiece extends FXPiece {
        preplacedPiece(char id, int xPeg, int yPeg,int rotate,int flip) throws IllegalArgumentException {
            super(id);
            int xOffset = 0;
            if (yPeg % 2 != 0) xOffset += SQUARE_SIZE / 2;
            initY = (int) (yPeg * ROW_HEIGHT + Y_BORDER);
            initX = xPeg * SQUARE_SIZE + X_BORDER + xOffset;

            setLayoutX(initX);
            setLayoutY(initY);
            setRotate(rotate*60);
            setScaleY(flip);
        }
    }


    //create our Board, have 12 grey circle backgrounds
    //it is the initial container, the center will be the solution area
    private void createBoard()
    {
        int[] blank = {0,0,0,0,0,0};
        for (int i = 0; i < 24; i++) {
            board[i]=new Pegs(blank);
            board[i].updateStates(blank);
        }

        for (int i = 0; i < 24; i++) {
            int col = i / 6;
            int row = i % 6;
            double y = (col * ROW_HEIGHT ) + PIECE_IMAGE_SIZE / 2 + Y_BORDER;
            int xOffset = 0;
            if (col % 2 != 0) xOffset += SQUARE_SIZE / 2;
            double x = (row * SQUARE_SIZE) + PIECE_IMAGE_SIZE / 2 + X_BORDER + xOffset;

            Circle a = new Circle(x, y, CIRCLE_SIZE, Color.LIGHTGRAY);
            pegs.getChildren().add(a);
        }
    }


    private void makePieces(String placement) {
        pieces.getChildren().clear();
        Map<Character,String> prePieces= new HashMap<Character,String>();  // the piece as key, pieceplacement as value
        for (int i=0;i<placement.length()/3;i++)
        {
            prePieces.put(placement.charAt(3*i+1),placement.substring(3*i,3*i+3));
        }
        for (char p = 'A'; p <= 'L'; p++) {
            if(prePieces.containsKey(p))               //if it is in the starting placement
            {
                String piecePlacement=prePieces.get(p);
                int location = piecePlacement.charAt(0)-'A';                           // pulls the location char
                int rotation = piecePlacement.charAt(2)-'A';
                int flip=rotation>5?-1:1;
                int xpeg=location%6;
                int ypeg=location/6;
                preplacedPiece piece= new preplacedPiece(p,xpeg,ypeg,rotation%6,flip);
                piece.setPosition(location);
                pieces.getChildren().add(piece);
            }
            else {
                FXPiece piece = new FXPiece(p);
                piece.setPosition(-1);
                pieces.getChildren().add(piece);
            }

           // pieces.getChildren().clear();
        }
    }

    private void loadHints() {
        // TODO: Turn this into a visual representation, since players won't know what BAA means (I barely know what BAA means)
        int boxW = 470;
        int boxH = 27;

        Rectangle box = new Rectangle(10, BOARD_HEIGHT - boxH - 8, boxW, boxH);
        box.setFill(Color.LIGHTGREY);

        Text sol = new Text(15, BOARD_HEIGHT - 15, "BAAHBATCJRDKWEBEFDNGLPHEDIFMJJQKIKLJ");
        sol.setFill(Color.DARKRED);
        sol.setFont(new Font(20));

        hints.getChildren().addAll(box, sol);
    }

    // if the placement is not well formed, return the warning
    public void invalidPlacement(String placement) {

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("IQ Link");
        Scene scene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
        root.getChildren().add(pegs);
        root.getChildren().add(pieces);
        root.getChildren().add(controls);

        createBoard();
        loadHints();
        placement="BAAHBATCJRDKWEBEFDNGLPHEDIFMJJQKIKLJ";
        makePieces(placement);

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.SLASH && !root.getChildren().contains(hints))
                root.getChildren().add(hints);
        });

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.SLASH) root.getChildren().remove(hints);
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
