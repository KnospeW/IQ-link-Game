package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private static final int VIEWER_WIDTH = 750;
    private static final int VIEWER_HEIGHT = 500;

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

    }

    private class Piece extends ImageView {
        Piece(char id) {
            setImage(new Image(Viewer.class.getResource(URL_BASE + id + ".png").toString()));
        }
    }
//    private void assignImages() {
//        Image[] imageSet = {A,B,C,D,E,F,G,H,I,J,K,L};
//        for (int n=0;n<imageSet.length;n++) {
//            imageSet[n] = new Image(Viewer.class.getResource(URL_BASE + n + ".png").toString());
//        }
//        A = new Image(Viewer.class.getResource(URL_BASE + "A.png").toString());
//    }
    /**
     * Create a basic text field for input and a refresh button.
     */
    private void makeControls() {
        Label label1 = new Label("Placement:");
        textField = new TextField ();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                makePlacement(textField.getText());
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

        makeControls();
//        assignImages();

        primaryStage.setScene(scene);
        primaryStage.show();
        root.getChildren().add(new Piece('A'));
    }
}
