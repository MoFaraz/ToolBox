import Controller.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        var mainPageController = new MainPageController();
        primaryStage.setScene(new Scene(mainPageController.getMainPage()));
        primaryStage.setMaxWidth(676.0);
        primaryStage.setMaxHeight(550.0);
        primaryStage.show();

        mainPageController.getMainPage().getNoteBTN().setOnAction(event -> {
            var notePadController = new NotePadController();
            var notePadStage = new Stage();
            notePadStage.setScene(new Scene(notePadController.getNotePad()));
            notePadStage.show();
        });

        mainPageController.getMainPage().getConvertorBTN().setOnAction(event -> {
            var convertorController = new ConvertorController();
            var convertStage = new Stage();
            convertStage.setScene(new Scene(convertorController.getConvertor()));
            convertStage.setMaxWidth(400);
            convertStage.setMinWidth(400);
            convertStage.setMaxHeight(200);
            convertStage.setMinHeight(200);
            convertStage.setHeight(200);
            convertStage.setWidth(400);
            convertStage.show();
        });

        mainPageController.getMainPage().getStopBTN().setOnAction(event -> {
            var stopWatchController = new StopWatchController();
            var stopStage = new Stage();
            stopStage.setScene(new Scene(stopWatchController.getStopWatch()));
            stopStage.show();
        });

        mainPageController.getMainPage().getTurnoffBTN().setOnAction(event -> {
            var turnOffController = new TurnOffController();
            var turnOffStage = new Stage();
            turnOffStage.setScene(new Scene(turnOffController.getTurnOff()));
            turnOffStage.show();
        });

        mainPageController.getMainPage().getMediaBTN().setOnAction(event -> {
            var videoController = new VideoController();
            var videoStage = new Stage();
            videoStage.setScene(new Scene(videoController.getVideo()));
            videoStage.show();
        });

        mainPageController.getMainPage().getZipBTN().setOnAction(event -> {
            var zipController = new ZipController();
            var zipStage = new Stage();
            zipStage.setScene(new Scene(zipController.getZip()));
            zipStage.show();
        });

        mainPageController.getMainPage().getPhoneBTN().setOnAction(event -> {
            var phoneController = new PhoneBookController();
            var phoneStage = new Stage();
            phoneStage.setScene(new Scene(phoneController.getPhoneBook()));
            phoneStage.show();
        });

        mainPageController.getMainPage().getMediaBTN().setOnAction(event -> {
            var videoController = new VideoController();
            var videoStage = new Stage();
            videoStage.setScene(new Scene(videoController.getVideo()));
            videoStage.show();
        });
     }

}
