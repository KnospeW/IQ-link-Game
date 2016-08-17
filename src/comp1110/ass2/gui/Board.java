package comp1110.ass2.gui;

import comp1110.ass2.LinkGame;
import javafx.application.Application;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Board extends Application {
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;

    // FIXME Task 8: Implement a basic playable Link Game in JavaFX that only allows pieces to be placed in valid places

    // FIXME Task 9: Implement starting placements

    // FIXME Task 11: Implement hints

    // FIXME Task 12: Generate interesting starting placements

    //create our Borad,have 12 grey circle backgrounds
    //it is the initial container, the center will be the solution area
    public void createBoard()
    {

    }
    //  change the look of the selected piece and rotate it when a MouseEvent is captured
    public void rotatePiece(MouseEvent e )
    {

    }
    // flip the selected piece when a MouseEvent is captured
    public void flipPiece(MouseEvent e ) {

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

    private void snapGrid() {

    }

    private void snapHome() {

    }
    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
