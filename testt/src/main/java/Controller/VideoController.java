package Controller;

import View.Video;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.util.Duration;

import java.io.File;

public class VideoController {
    private Video video;
    private String path;
    public VideoController(){
        video = new Video();
        video.getPause().setOnAction(event -> {
            video.getMediaPlayer().pause();
        });
        video.getStop().setOnAction(event -> {
            video.getMediaPlayer().stop();
        });
        video.getPlay().setOnAction(event -> {
            video.getMediaPlayer().play();
            video.getMediaPlayer().setRate(1);
        });
        video.getSpeedUp().setOnAction(event -> {
            video.getMediaPlayer().setRate(2);
        });
        video.getSlowDown().setOnAction(event -> {
            video.getMediaPlayer().setRate(0.5);
        });
        openMedia(video);
    }
    public Video getVideo(){
        return video;
    }
    
    private void openMedia(Video video){
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        path = file.toURI().toString();

        if (path != null) {
            Media media = new Media(path);
            video.setMediaPlayer(new MediaPlayer(media));
            video.getMediaView().setMediaPlayer(video.getMediaPlayer());

            DoubleProperty widthProp = video.getMediaView().fitWidthProperty();
            DoubleProperty heightProp = video.getMediaView().fitHeightProperty();

            widthProp.bind(Bindings.selectDouble(video.getMediaView().sceneProperty(), "width"));
            heightProp.bind(Bindings.selectDouble(video.getMediaView().sceneProperty(), "height"));

            video.getVolumeSlider().setValue(video.getMediaPlayer().getVolume() * 100);
            video.getVolumeSlider().valueProperty().addListener(new InvalidationListener() {
                @Override
                public void invalidated(Observable observable) {
                    video.getMediaPlayer().setVolume(video.getVolumeSlider().getValue()/100);
                }
            });
            video.getMediaPlayer().currentTimeProperty().addListener(new ChangeListener<Duration>() {
                @Override
                public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
                    video.getProgressBar().setValue(newValue.toSeconds());
                }
            });
            video.getProgressBar().setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    video.getMediaPlayer().seek(Duration.seconds(video.getProgressBar().getValue()));
                }
            });
            video.getProgressBar().setOnMouseDragged(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    video.getMediaPlayer().seek(Duration.seconds(video.getProgressBar().getValue()));
                }
            });

            video.getMediaPlayer().setOnReady(new Runnable() {
                @Override
                public void run() {
                    Duration total = media.getDuration();
                    video.getProgressBar().setMax(total.toSeconds());
                }
            });

            video.getMediaPlayer().play();
        }
    }

}
