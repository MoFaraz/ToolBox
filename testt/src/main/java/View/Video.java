package View;

import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.*;
import javafx.scene.media.*;

public class Video extends AnchorPane {
    private Button pause;
    private Button openFile;
    private Button play;
    private Button stop;
    private Button speedUp;
    private Button slowDown;
    private MediaPlayer mediaPlayer;
    private String path;
    private MediaView mediaView;
    private Slider volumeSlider;
    private Slider progressBar;
    private HBox hBox;

    public Video(){
        pause = new Button("Pause");
        play = new Button("Play");
        stop = new Button("Stop");
        speedUp = new Button("SpeedUp");
        slowDown = new Button("SlowDown");
        openFile = new Button("openFile");
        mediaView = new MediaView();
        progressBar = new Slider();
        hBox = new HBox(play,pause,stop,speedUp,slowDown,progressBar);
        volumeSlider = new Slider();


        /****** Start Style *******/

        /*****   HBOX    *****/

        hBox.setPrefHeight(46);
        hBox.setPrefWidth(606);
        hBox.setLayoutX(-4);
        hBox.setLayoutY(355);

        /***** Media View ******/

        mediaView.setLayoutX(200);
        mediaView.setLayoutY(100);
        mediaView.setX(0);
        mediaView.setY(0);

        this.getChildren().addAll(hBox,mediaView,openFile);
    }
    public Button getPause() {
        return pause;
    }

    public Button getOpenFile() {
        return openFile;
    }

    public Button getPlay() {
        return play;
    }

    public Button getStop() {
        return stop;
    }

    public Button getSpeedUp() {
        return speedUp;
    }

    public Button getSlowDown() {
        return slowDown;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public MediaView getMediaView() {
        return mediaView;
    }

    public Slider getVolumeSlider() {
        return volumeSlider;
    }

    public Slider getProgressBar() {
        return progressBar;
    }
}
