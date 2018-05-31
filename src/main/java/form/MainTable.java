package form;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.stage.StageStyle.TRANSPARENT;

public class MainTable extends Application {
    public void start(Stage primaryStage) throws Exception {
        String fxmlFile = "/form/MainTable.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        primaryStage.setTitle("PokerTH");
        Scene scene = new Scene(root);
        scene.setFill(null);
        primaryStage.setScene(scene);
        primaryStage.initStyle(TRANSPARENT);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
        Label lbl = new Label("LABEL");
        VBox p = new VBox(lbl);

        //make the background of the label white and opaque
        lbl.setStyle("-fx-background-color: rgba(255, 255, 255, 1);");

        //add some borders to visualise the element' locations
        lbl.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, null, null)));
        p.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, null, null)));

        Scene scene = new Scene(p);
        primaryStage.setScene(scene);

        //this is where the transparency is achieved:
        //the three layers must be made transparent
        //(i)  make the VBox transparent (the 4th parameter is the alpha)
        p.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);");
        //(ii) set the scene fill to transparent
        scene.setFill(null);
        //(iii) set the stage background to transparent
        primaryStage.initStyle(TRANSPARENT);

        primaryStage.setWidth(200);
        primaryStage.setHeight(100);
        primaryStage.show();

*/