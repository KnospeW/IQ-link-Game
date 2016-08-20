package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * A very simple viewer for piece placements in the link game.
 *
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various piece
 * placements.
 */
public class Viewer extends Application {

    /* board layout */
    private static final int SQUARE_SIZE = 100;
    private static final int PIECE_IMAGE_SIZE = 3*SQUARE_SIZE;
    private static final double ROW_HEIGHT = SQUARE_SIZE * 0.8660254; // 60 degrees
    private static final int VIEWER_WIDTH = 933;
    private static final int VIEWER_HEIGHT = 700;

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();
    TextField textField;

    public static final String URL_BASE = "assets/";


    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement  A valid placement string
     */
    void makePlacement(String placement) {
        // FIXME Task 5: implement the simple placement viewer
        // Will import a location, a piece, and a rotation.
        if (root.getChildren().size() > 1) root.getChildren().remove(1);    // removes any pieces present
        char name = placement.charAt(1);                                    // pulls the name char
        Character location = placement.charAt(0);                           // pulls the location char
        Character rotation = placement.charAt(2);                           // pulls the rotation char

        Piece piece = new Piece(name);                                      // creates the piece
        int rMod = rotation - 'A';                                          // rotation step
        double sMod = 1;
        int iSize = 100*(int)sMod;                                          // piece size modifier
        int row = (location - 'A') % 6;
        int col = (location - 'A') / 6;
        double x = 0;
        if (col % 2 != 0)
            x = Math.round(Math.cos(rMod*60)) * iSize/2;                    // spacing on odd rows
        x = x + 25 + row * iSize;
        int pyt = (iSize * iSize) + ((iSize / 2) * (iSize / 2));            // pythagoras, to save line space
        double y = 25 + (col * (Math.sqrt(pyt) -25*sMod) );

        piece.setScaleX(sMod);                                              // scale pieces if needed
        if (rMod > 5) piece.setScaleY(-sMod);                               // flips pieces
            else piece.setScaleY(sMod);
        piece.setRotate(60*rMod);                                           // rotate in multiples of 60 deg
        piece.setX(x);
        piece.setY(y);

//        System.out.println(placement);                                      // debugging
//        System.out.println(row + ", " + col);
//        System.out.println(x + ", " + y);
        root.getChildren().add(piece);                                      // adds piece to stage
    }

    private class Piece extends ImageView {
        Piece(char id) {
            setImage(new Image(Viewer.class.getResource(URL_BASE + id + ".png").toString()));
        }
    }

    /**
     * Create a basic text field for input and a refresh button.
     */
    private void makeControls() {
        Label label1 = new Label("Placement:");
        textField = new TextField ();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(e -> {
            makePlacement(textField.getText());
            textField.clear();
        });
        textField.setOnKeyPressed(k -> {                                    // because Steve should know programmers
            if (k.getCode() == KeyCode.ENTER) {                             // better than thinking that they ever
                makePlacement(textField.getText());                         // want to use a mouse.
                textField.clear();
            }
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(VIEWER_HEIGHT - 50);
        controls.getChildren().add(hb);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("LinkGame Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        root.getChildren().add(controls);

//        makePlacement("BAA");                                               // debugging
//        makePlacement("HBA");
//        makePlacement("TCJ");
//        makePlacement("RDK");
//        makePlacement("XEB");
//        makePlacement("EFD");
//        makePlacement("NGL");
//        makePlacement("PHE");
//        makePlacement("DIF");
//        makePlacement("MJJ");
//        makePlacement("QKI");
//        makePlacement("KLJ");
        makeControls();

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

// SCRAPYARD

//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;

//import javafx.scene.transform.Rotate;
//import javafx.scene.transform.Scale;
//import javafx.scene.transform.Translate;

//        if (rMod > 5) { }
//        piece.getTransforms().add(new Scale(sMod,sMod));                    // reduces the piece's size a bit
//        piece.getTransforms().add(new Rotate(60*rMod,x+150,y+150));         // rotates the piece
//        piece.getTransforms().add(new Translate(x,y));
//        move(piece,row,col);

//    private void assignImages() {
//        Image[] imageSet = {A,B,C,D,E,F,G,H,I,J,K,L};
//        for (int n=0;n<imageSet.length;n++) {
//            imageSet[n] = new Image(Viewer.class.getResource(URL_BASE + n + ".png").toString());
//        }
//        A = new Image(Viewer.class.getResource(URL_BASE + "A.png").toString());
//    }