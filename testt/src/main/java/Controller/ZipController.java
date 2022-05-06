package Controller;

import View.Zip;
import javafx.stage.FileChooser;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import java.io.File;

public class ZipController {
    private Zip zip;
    public ZipController(){
        zip = new Zip();
        zip.getZip().setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showOpenDialog(null);
            try {
                new ZipFile(selectedFile.getName() + ".zip").addFile(selectedFile.getAbsolutePath().toString());
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        zip.getUnZip().setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showOpenDialog(null);
            try {
                new ZipFile(selectedFile.getName() + ".zip").extractAll("/home/mofaraz/");
            } catch (ZipException e) {
                e.printStackTrace();
            }
        });
    }
    public Zip getZip() {
        return zip;
    }
}
