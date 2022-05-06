package View;

import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class StopWatch extends AnchorPane {
    private Label time;
    private Button play;
    private Button stop;
    private Button pause;
    private HBox timeHbox;
    private HBox BTNhbox;
    private VBox vBox;

    public Label getTime() {
        return time;
    }

    public Button getPlay() {
        return play;
    }

    public Button getStop() {
        return stop;
    }

    public Button getPause() {
        return pause;
    }

    public StopWatch(){
        time = new Label("00:00:00");
        play = new Button("Play");
        stop = new Button("Stop");
        pause = new Button("Pause");
        timeHbox = new HBox(time);
        BTNhbox = new HBox(play,pause,stop);
        vBox = new VBox(timeHbox,BTNhbox);

        time.setTextFill(Color.WHITE);
        time.setStyle("-fx-font-size: 20;");

        play.setStyle("-fx-background-color: #1A2238;");
        play.setCursor(Cursor.HAND);
        play.setTextFill(Color.rgb(250,44,86));
        pause.setTextFill(Color.rgb(250,44,86));
        pause.setStyle("-fx-background-color: #1A2238;");
        pause.setCursor(Cursor.HAND);
        stop.setTextFill(Color.rgb(250,44,86));
        stop.setCursor(Cursor.HAND);
        stop.setStyle("-fx-background-color: #1A2238;");

        vBox.setLayoutX(10);
        vBox.setLayoutY(9);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPrefHeight(351);
        vBox.setPrefWidth(587);

        timeHbox.setSpacing(40);
        timeHbox.setAlignment(Pos.CENTER);

        BTNhbox.setSpacing(20);
        BTNhbox.setPrefHeight(141);
        BTNhbox.setPrefWidth(378);
        BTNhbox.setAlignment(Pos.CENTER);

        this.getChildren().add(vBox);
        this.setStyle("-fx-background-color: #1A2238;");
    }
}
