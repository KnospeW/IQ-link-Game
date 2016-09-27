package comp1110.ass2.gui;

import comp1110.ass2.LinkGame;
import comp1110.ass2.Pegs;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Board extends Application {
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
    private static final int SQUARE_SIZE = 80;
    private static final int CIRCLE_SIZE = (int) (SQUARE_SIZE * 0.3);
    private static final int PIECE_IMAGE_SIZE = 3*SQUARE_SIZE;
    private static final double ROW_HEIGHT = SQUARE_SIZE * 0.8660254; // 60 degrees
    private static final int X_BORDER = 150 - PIECE_IMAGE_SIZE / 2;
    private static final int Y_BORDER = 150 - PIECE_IMAGE_SIZE / 2;

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group pegs = new Group();
    private final Group pieces = new Group();
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
        int position;

        FXPiece(char id) throws IllegalArgumentException {
            if (id > 'L') throw new IllegalArgumentException("Invalid piece id: " + id);
            this.id = id;
            setImage(new Image(Viewer.class.getResource(URI_BASE + id + ".png").toString()));
            setFitHeight(PIECE_IMAGE_SIZE);
            setFitWidth(PIECE_IMAGE_SIZE);
            if (id - 'A' < 6) {                           // row above the board
                initX = (id - 'A') * SQUARE_SIZE + 50;
                initY = BOARD_HEIGHT - SQUARE_SIZE * 4;   //change its postion to look better
                //initY = 0;
            } else {
                initX = (id - 'A' - 6) * SQUARE_SIZE + 50;  // row below the board
                initY = BOARD_HEIGHT - SQUARE_SIZE * 2;
            }
            this.setLayoutX(initX);
            this.setLayoutY(initY);

            setOnMousePressed(e -> {
                mouseX = e.getSceneX() - PIECE_IMAGE_SIZE / 2;
                mouseY = e.getSceneY() - PIECE_IMAGE_SIZE / 2;
            });

            setOnMouseDragged(e -> {
                setLayoutX(mouseX);
                setLayoutY(mouseY);
                mouseX = e.getSceneX() - PIECE_IMAGE_SIZE / 2;
                mouseY = e.getSceneY() - PIECE_IMAGE_SIZE / 2;
                e.consume();
            });

            setOnMouseReleased(e -> {
//                snapGrid();
                grabLocation();
                checkOverlap();
            });

            setOnKeyPressed(e -> {                  // once I get this up and working, maybe use QWERTY/ASDFGH to set
                System.out.println(e.getText());    // specific rotations, or try and get it working while dragging.
                if (e.getText() == "R" || e.getText() == "r") {
                    rotatePiece();
                    e.consume();
                }
            });

            setOnScroll(e -> {
                rotatePiece();                      // to update the piece's properties
                e.consume();
            });}
        public void setPosition(int pos)
        {
            this.position=pos;

        }
        private void rotatePiece() {
            setRotate((getRotate() + 60) % 360);
            grabLocation();

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

            double nearestY = nearestYIndex * ROW_HEIGHT + Y_BORDER;
            double nearestX = nearestXIndex * SQUARE_SIZE + xOffset + X_BORDER;

            System.out.println("Raw location: " + getLayoutX() + ", " + getLayoutY());
            System.out.println("Nearest points: " + nearestX + ", " + nearestY);
            System.out.println("Nearest indexes: " + nearestXIndex + ", " + nearestYIndex);
            System.out.println(this);
            this.position = nearestXIndex + nearestYIndex * 6;
            if(LinkGame.isPlacementValid(this.toString()))
            {
                String placement = "";
                for(Node p : pieces.getChildren()) {
                    placement += p.toString();
                }
                if(LinkGame.isPlacementValid(placement))
                {
                    setLayoutX(nearestX);
                    setLayoutY(nearestY);
                }
                else
                    {
                        this.position=-1;
                        setLayoutX(initX);
                        setLayoutY(initY);
                    }
            }
            else
            {
                this.position=-1;
                setLayoutX(initX);
                setLayoutY(initY);
            }



        }

        public void snapGrid() {
            boolean onGrid = true;
            int nearestYIndex = (int) Math.round((getLayoutY() - 25) / ROW_HEIGHT);
            if (nearestYIndex < 0) {
                nearestYIndex = 0;
                onGrid = false;
            }   // bounce if placing outside the grid
            if (nearestYIndex > 3) {
                nearestYIndex = 3;
                onGrid = false;
            }
            int xOffset = 25;                                               // account for hexagonal placement
            if (nearestYIndex % 2 == 1) xOffset += SQUARE_SIZE / 2;
            int nearestXIndex = (int) Math.round((getLayoutX() - xOffset) / SQUARE_SIZE);
            if (nearestXIndex < 0) {
                nearestXIndex = 0;
                onGrid = false;
            }   // bounce again
            if (nearestXIndex > 5) {
                nearestXIndex = 5;
                onGrid = false;
            }

            double nearestY = nearestYIndex * ROW_HEIGHT + 25;
            double nearestX = nearestXIndex * SQUARE_SIZE + xOffset;
//            System.out.println(nearestYIndex);
//            System.out.println(nearestY);
//            System.out.println(nearestXIndex);
//            System.out.println(nearestX);

            if (!onGrid) {
                setLayoutX(initX);
                setLayoutY(initY);
            } else {
                setLayoutX(nearestX);
                setLayoutY(nearestY);
            }
        }

/// get PiecePlacement
    public String toString() {
        char orientation = (char) ('A' + (int) (getRotate() / 60));
        return this.position == -1 ? "" : "" + (char) ('A' + this.position) + id + orientation;

    }


}



        // visually rotate a piece and update its data


        private void checkOverlap() {
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
            double xOffset = 0;
            int col = i / 6;
            int row = i % 6;
            if (col % 2 != 0)
                xOffset += SQUARE_SIZE / 2;
            double x = (row * SQUARE_SIZE) + PIECE_IMAGE_SIZE/2 + xOffset + X_BORDER;
            double y = (col * ROW_HEIGHT ) + PIECE_IMAGE_SIZE/2 + Y_BORDER;

            Circle a = new Circle(x, y, CIRCLE_SIZE, Color.GRAY);
            pegs.getChildren().add(a);
        }
    }
    // create each piece in the beginning

    private void makePieces() {
        pieces.getChildren().clear();
        for (char p = 'A'; p < 'L'; p++) {
            FXPiece piece=new FXPiece(p);
            piece.setPosition(-1);
            pieces.getChildren().add(piece);
        }
    }



    // flip the selected piece when a MouseEvent is captured
    public void flipPiece(MouseEvent e) {

    }

    //change the board when the user attempts to move the piece
    public void movePiece(MouseEvent e) {

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
        root.getChildren().add(pegs);
        root.getChildren().add(pieces);     //change the order of pieces and pegs to make piece in the upper layer
        root.getChildren().add(controls);

        createBoard();
        makePieces();
//        root.getChildren().add(new FXPiece('A'));
//        root.getChildren().add(new FXPiece('B'));
//        root.getChildren().add(new FXPiece('G'));
//        root.getChildren().add(new FXPiece('L'));

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
