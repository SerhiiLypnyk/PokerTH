package controls;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainTableFormController implements Initializable {
    Stage stage;

    @FXML
    AnchorPane parentAnchor;
    @FXML
    Circle avatar;
    @FXML
    Circle closeButton;

    @FXML
    Circle player1;
    @FXML
    Circle player2;
    @FXML
    Circle player3;
    @FXML
    Circle player4;
    @FXML
    Circle player5;
    @FXML
    Circle player6;
    @FXML
    Circle player7;
    @FXML
    Circle player8;
    @FXML
    Circle player9;
    @FXML
    Circle player10;

    Circle[] avatars;

    Image ava;


    double orgSceneX, orgSceneY;
    double orgTranslateX, orgTranslateY;

    public void initialize(URL location, ResourceBundle resources) {
       // stage = (Stage) parentAnchor.getScene().getWindow();

        avatars = new Circle[10];
        avatars[0] = player1;
        avatars[1] = player2;
        avatars[2] = player3;
        avatars[3] = player4;
        avatars[4] = player5;
        avatars[5] = player6;
        avatars[6] = player7;
        avatars[7] = player8;
        avatars[8] = player9;
        avatars[9] = player10;

        for (int i=0; i< 10; i++) {
            avatars[i].setStrokeWidth(0);
            avatars[i].setFill(new ImagePattern(new Image("/image/128_6.png")));
        }
        ava = new Image("/image/128_3.png");
        avatar.setStrokeWidth(0);
        avatar.setFill(new ImagePattern(ava));
        avatar.setEffect(new DropShadow(+10d, 0d, 0d, Color.DARKSEAGREEN));

        closeButton.setStrokeWidth(0);
        closeButton.setFill(new ImagePattern(new Image("/image/no.png")));

    }

    public void hideForm(ActionEvent actionEvent) {
        //
    }

    public void closeForm(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void dragMousePressed(MouseEvent mouseEvent) {
//        Stage s = (Stage) ((Node)(mouseEvent.getSource())).getScene().getWindow();
        Scene s = (Scene) ((Node)(mouseEvent.getSource())).getScene();
        orgTranslateX = s.getX();
        orgTranslateY = s.getY();

//        System.out.println("orgSceneX " + orgSceneX);
//        System.out.println("orgSceneY " + orgSceneY);
//
//        System.out.println("orgTranslateX " + orgTranslateX);
//        System.out.println("orgTranslateY " + orgTranslateY);

    }

    public void dragged(MouseEvent mouseEvent) {
        double offsetX = mouseEvent.getSceneX() - orgSceneX;
        double offsetY = mouseEvent.getSceneY() - orgSceneY;

//        System.out.println("offsetX " + offsetX);

        Stage s = (Stage) ((Node)(mouseEvent.getSource())).getScene().getWindow();
        double newTranslateX = s.getX() - orgTranslateX;
        double newTranslateY = s.getY() - orgTranslateY;
        s.setX(newTranslateX);
        s.setY(newTranslateY);

    }

    public void forDebug(ActionEvent actionEvent) {
        //
    }

    public void qwer(MouseEvent mouseEvent) {
    }
}
