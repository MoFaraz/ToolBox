package View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class TurnOff extends AnchorPane {
    private Pane pane1;
    private Pane pane2;
    private Pane pane3;
    private Pane pane4;
    private TextField turnOffFLD;
    private Button turnOffBTN;

    public TurnOff() {
        pane1 = new Pane();
        pane2 = new Pane();
        pane3 = new Pane();
        pane4 = new Pane();

        turnOffFLD = new TextField("Shut Down In ...");
        turnOffBTN = new Button("Shut Down!");
        /*****Start Pane Style*****/
        pane1.setLayoutX(645.0);
        pane1.setLayoutY(121.0);
        pane1.setPrefHeight(315.0);
        pane1.setPrefWidth(232.0);
        pane1.setRotate(132.0);
        pane1.setStyle("-fx-background-color: #FA2C56;" + "-fx-background-radius: 70;");

        pane2.setLayoutX(170.0);
        pane2.setLayoutY(-264.0);
        pane2.setPrefHeight(315.0);
        pane2.setPrefWidth(232.0);
        pane2.setRotate(45.0);
        pane2.setStyle("-fx-background-color: #FA2C56;" + "-fx-background-radius: 70;");

        pane3.setLayoutX(-233.0);
        pane3.setLayoutY(195.0);
        pane3.setPrefHeight(315.0);
        pane3.setPrefWidth(232.0);
        pane3.setRotate(-131.4);
        pane3.setStyle("-fx-background-color: #FA2C56;" + "-fx-background-radius: 70;");

        pane4.setLayoutX(262.0);
        pane4.setLayoutY(497.0);
        pane4.setPrefHeight(315.0);
        pane4.setPrefWidth(232.0);
        pane4.setRotate(53.1);
        pane4.setStyle("-fx-background-color: #FA2C56;" + "-fx-background-radius: 70;");

        /*****End Pane Style*****/

        /****Start TextFLD Style****/

        turnOffFLD.setAlignment(Pos.CENTER);
        turnOffFLD.setStyle("-fx-background-radius: 30;-fx-border-color: #1A2238;");
        turnOffFLD.setLayoutX(252);
        turnOffFLD.setLayoutY(246);

        turnOffBTN.setAlignment(Pos.CENTER);
        turnOffBTN.setStyle("-fx-background-color: white; -fx-background-radius: 20;");
        turnOffBTN.setLayoutX(255);
        turnOffBTN.setLayoutY(286);
        turnOffBTN.setPrefWidth(167);
        turnOffBTN.setPrefHeight(33);

        this.getChildren().addAll(pane1,pane2,pane3,pane4,turnOffFLD,turnOffBTN);
        this.setStyle("-fx-background-color: #1A2238;");
    }
    public TextField getTurnOffFLD(){
        return turnOffFLD;
    }
    public Button getTurnOffBTN(){
        return turnOffBTN;
    }
}
