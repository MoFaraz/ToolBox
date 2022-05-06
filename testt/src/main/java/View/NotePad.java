package View;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class NotePad extends AnchorPane {
    private MenuBar menuBar;
    private Menu file;
    private MenuItem New;
    private MenuItem open;
    private MenuItem save;
    private MenuItem save_as;
    private TextArea textArea;
    private VBox vBox;

    public NotePad(){
        New = new MenuItem("New");
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        save_as = new MenuItem("Save_As");
        file = new Menu("File");
        menuBar = new MenuBar();
        file.getItems().addAll(New,open,save,save_as);
        menuBar.getMenus().addAll(file);

        textArea = new TextArea();
        textArea.setMaxWidth(600);
        textArea.setMaxHeight(400);

        vBox = new VBox(menuBar,textArea);
        this.getChildren().addAll(vBox);
    }


    public MenuBar getMenuBar() {
        return menuBar;
    }

    public Menu getFile() {
        return file;
    }

    public MenuItem getNew() {
        return New;
    }

    public MenuItem getOpen() {
        return open;
    }

    public MenuItem getSave() {
        return save;
    }

    public MenuItem getSave_as() {
        return save_as;
    }

    public TextArea getTextArea() {
        return textArea;
    }
}
