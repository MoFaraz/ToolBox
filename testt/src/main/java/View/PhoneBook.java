package View;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PhoneBook extends AnchorPane {
    private TableView<Person> tableView;
    private TableColumn<Person,String> firstName,lastName,phoneNumber,address;
    private Button addBTN;
    private Button removeBTN;
    private Button editBTN;
    private TextField firstNameFLD;
    private TextField lastNameFLD;
    private TextField addressFLD;
    private TextField phoneNumberFLD;
    private VBox vBoxFLD;
    private VBox vBoxCOL;
    private HBox hBoxBTN;

    public TableView<Person> getTableView() {
        return tableView;
    }

    public TableColumn<Person, String> getFirstName() {
        return firstName;
    }

    public TableColumn<Person, String> getLastName() {
        return lastName;
    }

    public TableColumn<Person, String> getPhoneNumber() {
        return phoneNumber;
    }

    public TableColumn<Person, String> getAddress() {
        return address;
    }

    public Button getAddBTN() {
        return addBTN;
    }

    public Button getRemoveBTN() {
        return removeBTN;
    }

    public Button getEditBTN() {
        return editBTN;
    }

    public TextField getFirstNameFLD() {
        return firstNameFLD;
    }

    public TextField getLastNameFLD() {
        return lastNameFLD;
    }

    public TextField getAddressFLD() {
        return addressFLD;
    }

    public TextField getPhoneNumberFLD() {
        return phoneNumberFLD;
    }

    public PhoneBook() {
        firstNameFLD = new TextField();
        lastNameFLD = new TextField();
        phoneNumberFLD = new TextField();
        addressFLD = new TextField();
        addBTN = new Button("Add");
        removeBTN = new Button("Remove");
        editBTN = new Button("Edit");
        firstName = new TableColumn<>();
        lastName = new TableColumn<>();
        phoneNumber = new TableColumn<>();
        tableView = new TableView<>();
        tableView.getColumns().addAll(firstName,lastName,address,phoneNumber);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        vBoxCOL = new VBox(tableView);
        vBoxFLD = new VBox(firstNameFLD,lastNameFLD,addressFLD,phoneNumberFLD);
        hBoxBTN = new HBox(addBTN,removeBTN,editBTN);


        this.getChildren().addAll(vBoxCOL,vBoxFLD,hBoxBTN);
    }
}

