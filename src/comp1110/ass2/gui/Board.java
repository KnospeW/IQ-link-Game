package comp1110.ass2.gui;

import comp1110.ass2.LinkGame;
import comp1110.ass2.Pegs;
import javafx.application.Application;
import javafx.scene.Group;
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
    private static final int SQUARE_SIZE = 100;
    private static final int PIECE_IMAGE_SIZE = 3*SQUARE_SIZE;
    private static final double ROW_HEIGHT = SQUARE_SIZE * 0.8660254; // 60 degrees

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
//            setFitHeight(SQUARE_SIZE);
//            setFitHeight(SQUARE_SIZE);
            if ( id - 'A' < 6) {                           // row above the board
                initX = (id - 'A') * SQUARE_SIZE + 50;
                initY = 0;
            }
            else {
                initX = (id - 'A' - 6) * SQUARE_SIZE + 50;  // row below the board
                initY = BOARD_HEIGHT - SQUARE_SIZE*2;
            }
            this.setLayoutX(initX);
            this.setLayoutY(initY);

            setOnMousePressed(e -> {
                mouseX = e.getSceneX();
                mouseY = e.getSceneY();
            });

            setOnMouseDragged(e -> {
                setLayoutX(mouseX);
                setLayoutY(mouseY);
                mouseX = e.getSceneX();
                mouseY = e.getSceneY();
            });

            setOnMouseReleased(e -> {
                snapGrid();
            });

        }
    }
//    class MoveFXPiece extends FXPiece {
//
//    }


    //create our Board, have 12 grey circle backgrounds
    //it is the initial container, the center will be the solution area
    public void createBoard()
    {
//        int[] blank = {0,0,0,0,0,0};
//        for (int i = 0; i < 24; i++) {
//            board[i].updateStates(blank);
//        }

        for (int i = 0; i < 24; i++) {
            double x = 0, y;
            int col = i / 6;
            int row = i % 6;
            if (col % 2 != 0)
                x =  SQUARE_SIZE / 2;
            x = x + 25 + row * SQUARE_SIZE+150;
            y = 25 + (ROW_HEIGHT * col)+150;

            Circle a = new Circle(x,y,30, Color.GRAY);
            pegs.getChildren().add(a);
        }
    }
    // create each piece
    public void drawPiece()
    {

    }
    //  change the look of the selected piece and rotate it when a MouseEvent is captured
    public void rotatePiece(MouseEvent e)
    {

    }
    // flip the selected piece when a MouseEvent is captured
    public void flipPiece(MouseEvent e) {

    }
    //change the board when the user attempts to move the piece
    public void movePiece(MouseEvent e)
    {

    }
    // while the game starts,show the pictures of 12 Pieces on both side of the board
    public void createPieces()
    {

    }
    // if the placement is not well formed, retrun the warning
    public void invalidPlacement(String placement)
    {

    }

    private void snapGrid()
    {

    }

    private void snapHome()
    {

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
        root.getChildren().add(new FXPiece('A'));
        root.getChildren().add(new FXPiece('B'));
        root.getChildren().add(new FXPiece('G'));
        root.getChildren().add(new FXPiece('L'));

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
