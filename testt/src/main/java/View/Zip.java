package View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Zip extends AnchorPane {
    private HBox hBox;
    private Button zip;
    private Button unZip;

    public Button getZip() {
        return zip;
    }

    public Button getUnZip() {
        return unZip;
    }

    public Zip() {
        zip = new Button("Zip");
        unZip = new Button("UnZip");

        zip.setStyle("-fx-background-color: #1A2238;-fx-border-color: #FA2C56;");
        zip.setTextFill(Color.rgb(250,44,86));
        unZip.setTextFill(Color.rgb(250,44,86));
        unZip.setStyle("-fx-background-color: #1A2238; -fx-border-color: #FA2C56;");

        hBox = new HBox(zip,unZip);
        hBox.setSpacing(30);
        hBox.setPrefHeight(141);
        hBox.setPrefWidth(378);
        hBox.setAlignment(Pos.CENTER);

        this.getChildren().add(hBox);
        this.setStyle("-fx-background-color: #1A2238;");
    }
}
