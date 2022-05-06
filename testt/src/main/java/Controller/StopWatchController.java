package Controller;


import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import View.StopWatch;

import java.net.URL;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class StopWatchController {
    private StopWatch stopWatch;
    private double xOffset = 0;
    private double yOffset = 0;

    Timeline timeline;
    LocalTime time = LocalTime.parse("00:00:00");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

    public StopWatch getStopWatch() {
        return stopWatch;
    }

    private void incrementTime() {
        time = time.plusSeconds(1);
        stopWatch.getTime().setText(time.format(dtf));
    }

    public StopWatchController(){
        stopWatch = new StopWatch();
        timeline = new Timeline();
        timeline = new Timeline(new KeyFrame(Duration.millis(1000), ae -> incrementTime()));
        timeline.setCycleCount(Animation.INDEFINITE);
        stopWatch.getPlay().setOnAction(event -> {
            timeline.play();
            stopWatch.getPlay().setDisable(true);
        });
        stopWatch.getPause().setOnAction(event -> {
            if (timeline.getStatus().equals(Animation.Status.PAUSED)) {
                timeline.play();
                stopWatch.getPause().setText("Pause");
            } else if (timeline.getStatus().equals(Animation.Status.RUNNING)) {
                timeline.pause();
                stopWatch.getPause().setText("Continue");
            }
        });
        stopWatch.getStop().setOnAction(event -> {
            if (stopWatch.getPlay().isDisable()) {
                timeline.stop();
                stopWatch.getPlay().setDisable(false);
                time = LocalTime.parse("00:00:00");
                stopWatch.getTime().setText(time.format(dtf));
            }
        });
    }



}
