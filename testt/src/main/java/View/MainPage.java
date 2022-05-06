package View;

import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MainPage extends AnchorPane {

    private Pane pane1;
    private Pane pane2;
    private Pane pane3;
    private Pane pane4;
    private Button noteBTN;
    private Button phoneBTN;
    private Button calBTN;
    private Button stopBTN;
    private Button turnoffBTN;
    private Button zipBTN;
    private Button convertorBTN;
    private Button mediaBTN;

    public MainPage(){
        pane1 = new Pane();
        pane2 = new Pane();
        pane3 = new Pane();
        pane4 = new Pane();
        noteBTN = new Button("NotePad");
        phoneBTN = new Button("PhoneBook");
        calBTN = new Button("Calculator");
        stopBTN = new Button("StopWatch");
        turnoffBTN = new Button("TurnOff");
        zipBTN = new Button("Zip&Rar");
        convertorBTN = new Button("Convertor");
        mediaBTN = new Button("Media");
        /*****Start Button Style****/
        noteBTN.setLayoutX(69);
        noteBTN.setLayoutY(56);
        noteBTN.setPrefWidth(116);
        noteBTN.setPrefHeight(113);
        noteBTN.setStyle("-fx-background-radius: 80;-fx-background-color: #2568FB;");
        noteBTN.setCursor(Cursor.HAND);

        phoneBTN.setLayoutX(262);
        phoneBTN.setLayoutY(56);
        phoneBTN.setPrefHeight(113);
        phoneBTN.setPrefWidth(116);
        phoneBTN.setStyle("-fx-background-radius: 80; -fx-background-color: #2568FB;");
        phoneBTN.setCursor(Cursor.HAND);

        calBTN.setLayoutX(69);
        calBTN.setLayoutY(205);
        calBTN.setPrefHeight(113);
        calBTN.setPrefWidth(116);
        calBTN.setStyle("-fx-background-radius: 80; -fx-background-color: #2568FB;");
        calBTN.setCursor(Cursor.HAND);

        stopBTN.setLayoutX(458);
        stopBTN.setLayoutY(56);
        stopBTN.setPrefHeight(113);
        stopBTN.setPrefWidth(116);
        stopBTN.setStyle("-fx-background-radius: 80; -fx-background-color: #2568FB;");
        stopBTN.setCursor(Cursor.HAND);

        turnoffBTN.setLayoutX(352);
        turnoffBTN.setLayoutY(357);
        turnoffBTN.setPrefHeight(113);
        turnoffBTN.setPrefWidth(116);
        turnoffBTN.setStyle("-fx-background-radius: 80; -fx-background-color: #2568FB;");
        turnoffBTN.setCursor(Cursor.HAND);

        zipBTN.setLayoutX(164);
        zipBTN.setLayoutY(357);
        zipBTN.setPrefHeight(113);
        zipBTN.setPrefWidth(116);
        zipBTN.setStyle("-fx-background-radius: 80; -fx-background-color: #2568FB;");
        zipBTN.setCursor(Cursor.HAND);

        convertorBTN.setLayoutX(450);
        convertorBTN.setLayoutY(205);
        convertorBTN.setPrefHeight(113);
        convertorBTN.setPrefWidth(116);
        convertorBTN.setStyle("-fx-background-radius: 80; -fx-background-color: #2568FB;");
        convertorBTN.setCursor(Cursor.HAND);

        mediaBTN.setLayoutX(262);
        mediaBTN.setLayoutY(205);
        mediaBTN.setPrefHeight(113);
        mediaBTN.setPrefWidth(116);
        mediaBTN.setStyle("-fx-background-radius: 80; -fx-background-color: #2568FB;");
        mediaBTN.setCursor(Cursor.HAND);


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

        this.getChildren().addAll(pane1,pane2,pane3,pane4,calBTN,
                                phoneBTN,zipBTN,convertorBTN,mediaBTN,stopBTN,turnoffBTN,noteBTN);
        this.setStyle("-fx-background-color: #1A2238;");
    }


    public Button getNoteBTN() {
        return noteBTN;
    }

    public Button getPhoneBTN() {
        return phoneBTN;
    }

    public Button getCalBTN() {
        return calBTN;
    }

    public Button getStopBTN() {
        return stopBTN;
    }

    public Button getTurnoffBTN() {
        return turnoffBTN;
    }

    public Button getZipBTN() {
        return zipBTN;
    }

    public Button getConvertorBTN() {
        return convertorBTN;
    }

    public Button getMediaBTN() {
        return mediaBTN;
    }

}
