package comp1110.ass2.gui;

import comp1110.ass2.LinkGame;
import comp1110.ass2.Pegs;
import javafx.application.Application;
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

    private Pegs[] board = new Pegs[24];

    // FIXME Task 8: Implement a basic playable Link Game in JavaFX that only allows pieces to be placed in valid places

    // FIXME Task 9: Implement starting placements

    // FIXME Task 11: Implement hints

    // FIXME Task 12: Generate interesting starting placements

    class draggablePiece extends ImageView {

    }


    //create our Board, have 12 grey circle backgrounds
    //it is the initial container, the center will be the solution area
    public void createBoard()
    {
        int[] blank = {0,0,0,0,0,0};
        for (Pegs peg : board) {
            peg.updateStates(blank);
        }

        for (int i = 0; i < 24; i++) {
            double x = 0, y;
            int col = i / 6;
            int row = i % 6;
            if (col % 2 != 0)
                x =  SQUARE_SIZE / 2;
            x = x + 25 + row * SQUARE_SIZE+150;
            y = 25 + (ROW_HEIGHT * col)+150;


            Circle a = new Circle(x,y,30, Color.GRAY);
//            root.getChildren().add(a);
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
    //change the board when the user attemped to move the piece
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
    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
