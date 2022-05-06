package View;

import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Convertor extends AnchorPane {

    private HBox hBox;
    private TextField dayFLD;
    private TextField monthFLD;
    private TextField yearFLD;
    private Text text;

    private Button convertBTN;
    public TextField getDayFLD() {
        return dayFLD;
    }

    public TextField getMonthFLD() {
        return monthFLD;
    }

    public TextField getYearFLD() {
        return yearFLD;
    }

    public Button getConvertBTN() {
        return convertBTN;
    }

    public Text getText() {
        return text;
    }

    public Convertor(){
        yearFLD = new TextField();
        monthFLD = new TextField();
        dayFLD = new TextField();
        convertBTN = new Button("Convert");
        hBox = new HBox(yearFLD,monthFLD,dayFLD);
        text = new Text();
        text.setVisible(false);

        yearFLD.setMaxWidth(85);
        yearFLD.setStyle("-fx-background-color: #1A2238; -fx-text-fill: #FA2C56; -fx-prompt-text-fill: #FA2C56; -fx-border-color: #FA2C56");
        yearFLD.setMaxHeight(24);
        yearFLD.setAlignment(Pos.CENTER);
        yearFLD.setPromptText("Year");
        monthFLD.setStyle("-fx-background-color: #1A2238; -fx-text-fill: #FA2C56; -fx-prompt-text-fill: #FA2C56; -fx-border-color: #FA2C56");
        monthFLD.setMaxWidth(85);
        monthFLD.setMaxHeight(24);
        monthFLD.setAlignment(Pos.CENTER);
        monthFLD.setPromptText("Month");
        dayFLD.setStyle("-fx-background-color: #1A2238; -fx-text-fill: #FA2C56; -fx-prompt-text-fill: #FA2C56; -fx-border-color: #FA2C56");
        dayFLD.setMaxHeight(24);
        dayFLD.setMaxWidth(85);
        dayFLD.setAlignment(Pos.CENTER);
        dayFLD.setPromptText("Day");
        hBox.setSpacing(20);
        hBox.setLayoutX(48);
        hBox.setLayoutY(14);
        hBox.setPrefHeight(100);
        hBox.setPrefWidth(328);
        convertBTN.setCursor(Cursor.HAND);
        convertBTN.setLayoutX(181);
        convertBTN.setLayoutY(114);
        convertBTN.setStyle("-fx-background-color: #1A2238; -fx-text-fill: #FA2C56; -fx-border-color: #FA2C56;");

        hBox.setStyle("-fx-background-color: #1A2238;");
        this.getChildren().addAll(hBox,convertBTN);
        this.setStyle("-fx-background-color: #1A2238;");
    }
}
