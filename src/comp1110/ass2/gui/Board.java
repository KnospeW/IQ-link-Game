package comp1110.ass2.gui;

import comp1110.ass2.Pegs;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.security.Key;
import java.util.Objects;

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

    private Pegs[] board = new Pegs[24];

    // FIXME Task 8: Implement a basic playable Link Game in JavaFX that only allows pieces to be placed in valid places

    // FIXME Task 9: Implement starting placements

    // FIXME Task 11: Implement hints

    // FIXME Task 12: Generate interesting starting placements

    class FXPiece extends ImageView {
        char id;
        int initX, initY;
        double mouseX, mouseY;
        FXPiece(char id) throws IllegalArgumentException {
            if (id > 'L') throw new IllegalArgumentException("Invalid piece id: " + id);
            this.id = id;
            setImage(new Image(Viewer.class.getResource(URI_BASE + id + ".png").toString()));
            setFitHeight(PIECE_IMAGE_SIZE);
            setFitWidth (PIECE_IMAGE_SIZE);
            int mod = id - 'A';
            if (mod < 4) {                                                  // row above the board
                initX = mod * 2 * SQUARE_SIZE + SQUARE_SIZE * 3 / 2;
                if ( mod % 2 != 0) initY = 40;
                else initY = -40;
            }
            else if (mod < 6) {                                             // left row
                initX = 0;
                initY = PIECE_IMAGE_SIZE * 2 / 3 * (mod - 3);
            }
            else if (mod < 8) {
                initX = BOARD_WIDTH - PIECE_IMAGE_SIZE + SQUARE_SIZE / 3;   // right row
                initY = PIECE_IMAGE_SIZE * 2 / 3 * (mod - 5);
            }
            else {
                initX = (mod - 8) * 2 * SQUARE_SIZE + SQUARE_SIZE * 3 / 2;  // row below the board
                initY = BOARD_HEIGHT - SQUARE_SIZE * 5 / 2;
            }
//            setRotate(60);
            setLayoutX(initX);
            setLayoutY(initY);

            setOnMousePressed(e -> {
                mouseX = e.getSceneX() - PIECE_IMAGE_SIZE / 2; // we want to manipulate from the centre of the piece,
                mouseY = e.getSceneY() - PIECE_IMAGE_SIZE / 2; // not the corner (which is transparent)
            });

            setOnMouseDragged(e -> {
                setLayoutX(mouseX);
                setLayoutY(mouseY);
                mouseX = e.getSceneX() - PIECE_IMAGE_SIZE / 2;
                mouseY = e.getSceneY() - PIECE_IMAGE_SIZE / 2;
                requestFocus();
            });

            setOnMouseReleased(e -> {
//                grabLocation();                     // testing
                snapGrid();
                checkOverlap();
            });

            setOnKeyPressed(e -> {                  // due to limitations in the engine, pieces must first be dragged
//                System.out.println(e.getCode());    // before they can be rotated or flipped
                if (e.getCode() == KeyCode.E) {
                    rotatePiece(-1);
                    setRotate(getRotate() - 60);
                }
                if (e.getCode() == KeyCode.R) {
                    rotatePiece(1);
                    setRotate(getRotate() + 60);
                }
                if (e.getCode() == KeyCode.F) {
                    flipPiece();
                    setScaleY(getScaleY() * -1);
                }
            });

            setOnScroll(e -> {
                rotatePiece(1);                      // to update the piece's properties
                setRotate(getRotate() + 60);
            });

        }

        // visually rotate a piece and update its data
        public void rotatePiece(int modifier) {

        }

        // flip the selected piece
        public void flipPiece() {

        }

        private void checkOverlap() {
        }

        private void grabLocation() { // debugging method for snapGrid
            // TODO: Copy this across to snapGrid and tweak border for maximum visibility, then arrange initial pieces
            /*  -50 should snap to 0
                49 should snap to 0
                50 should snap to 1
                149 should snap to 1
             */
//            int nearestYIndex = 0, nearestXIndex = 0;
//            double temp = getLayoutY();
//            int nearestYIndex = (int) Math.round((getLayoutY() ) / ROW_HEIGHT);
//            while (temp > SQUARE_SIZE / 2) { temp -= SQUARE_SIZE / 2; nearestYIndex++; }
//            int nearestXIndex = (int) Math.round(getLayoutX() - xOffset) / SQUARE_SIZE;
//            temp = getLayoutX();
//            while (temp > SQUARE_SIZE / 2 + xOffset) { temp -= SQUARE_SIZE / 2; nearestXIndex++; }

            int nearestYIndex = (int) ((getLayoutY() + SQUARE_SIZE / 2 - Y_BORDER) / ROW_HEIGHT);
            int xOffset = 0;
            if (nearestYIndex % 2 == 1) xOffset += SQUARE_SIZE / 2;
            int nearestXIndex = (int) ((getLayoutX() + SQUARE_SIZE / 2 - X_BORDER - xOffset) / SQUARE_SIZE);

            double nearestY = nearestYIndex * ROW_HEIGHT  + Y_BORDER;
            double nearestX = nearestXIndex * SQUARE_SIZE + X_BORDER + xOffset;

            System.out.println("Raw location: " + getLayoutX() + ", " + getLayoutY());
            System.out.println("Nearest points: " + nearestX + ", " + nearestY);
            System.out.println("Nearest indexes: " + nearestXIndex + ", " + nearestYIndex);

            setLayoutX(nearestX);
            setLayoutY(nearestY);
        }

        public void snapGrid() {
            // FIXME: Strip that should be -1 is read as 0 and makes the piece snap to the board instead of home.
            boolean onGrid = true;
            int nearestYIndex = (int) ((getLayoutY() + SQUARE_SIZE / 2 - Y_BORDER) / ROW_HEIGHT);
            if (nearestYIndex < 0) { nearestYIndex = 0; onGrid = false; }   // bounce if placing outside the grid
            if (nearestYIndex > 3) { nearestYIndex = 3; onGrid = false; }
            int xOffset = 0;                                                // account for hexagonal placement
            if (nearestYIndex % 2 != 0) xOffset += SQUARE_SIZE / 2;
            int nearestXIndex = (int) ((getLayoutX() + SQUARE_SIZE / 2 - X_BORDER - xOffset) / SQUARE_SIZE);
            if (nearestXIndex < 0) { nearestXIndex = 0; onGrid = false; }   // bounce again
            if (nearestXIndex > 5) { nearestXIndex = 5; onGrid = false; }

            double nearestY = nearestYIndex * ROW_HEIGHT  + Y_BORDER;
            double nearestX = nearestXIndex * SQUARE_SIZE + X_BORDER + xOffset;

            if (!onGrid) { setLayoutX(initX);    setLayoutY(initY);    }
            else         { setLayoutX(nearestX); setLayoutY(nearestY); }
        }
    }
//    class MoveFXPiece extends FXPiece {
//
//    }


    //create our Board, have 12 grey circle backgrounds
    //it is the initial container, the center will be the solution area
    public void createBoard()
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

            Circle a = new Circle(x, y, CIRCLE_SIZE, Color.GRAY);
            pegs.getChildren().add(a);
        }
    }

    // create each piece
    public void drawPiece() {

    }

    // while the game starts,show the pictures of 12 Pieces on both side of the board
    public void createPieces() {

    }

    // if the placement is not well formed, retrun the warning
    public void invalidPlacement(String placement) {

    }

    private void snapHome() {

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("IQ Link");
        Scene scene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
        root.getChildren().add(pieces);
        root.getChildren().add(pegs);
        root.getChildren().add(controls);

        createBoard();
        for (char n = 'A'; n < 'M'; n++) {
            root.getChildren().add(new FXPiece(n));
        }

//        scene.setOnKeyPressed(e -> System.out.println(e.getCode()));

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
