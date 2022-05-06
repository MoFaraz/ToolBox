package Controller;

import javafx.scene.input.KeyCombination;
import javafx.stage.FileChooser;
import View.NotePad;

import java.io.*;

public class NotePadController {
    private NotePad notePad;

    public NotePadController(){
        notePad = new NotePad();
        notePad.getSave().setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            File saveFile = fileChooser.showSaveDialog(null);
            try {
                FileWriter fileWriter = new FileWriter(saveFile);
                fileWriter.write(notePad.getTextArea().getText());
                fileWriter.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        notePad.getOpen().setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
        notePad.getSave().setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
        notePad.getOpen().setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open File");
            File selectedFile = fileChooser.showOpenDialog(null);
            try {
                FileReader fileReader = new FileReader(selectedFile.getAbsolutePath().toString());
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                StringBuilder stringBuilder = new StringBuilder();
                String myText = "";

                while ((myText = bufferedReader.readLine()) != null)
                    stringBuilder.append(myText + "\n");
                notePad.getTextArea().setText(stringBuilder.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    public NotePad getNotePad() {
        return notePad;
    }
}
