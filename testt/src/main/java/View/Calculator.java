package View;

import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Calculator extends AnchorPane {
    private VBox vBox1;
    private VBox vBox2;
    private VBox vBox3;
    private VBox vBox4;
    private TextField number;
    private double num1,num2;
    private HBox hBox1;
    private HBox hBox2;
    private HBox hBox3;
    private HBox hBox4;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button dotBTN;
    private Button equalBTN;
    private Button addBTN;
    private Button minusBTN;
    private Button divideBTN;
    private Button multiBTN;
    private Button logBTN;
    private Button powerBTN;
    private Button squareBTN;

    public Calculator() {
        number = new TextField();
        btn1 = new Button();
        btn2 = new Button();
        btn3 = new Button();
        btn4 = new Button();
        btn5 = new Button();
        btn6 = new Button();
        btn7 = new Button();
        btn8 = new Button();
        btn9 = new Button();
        btn0 = new Button();
        dotBTN = new Button();
        equalBTN = new Button();
        addBTN = new Button();
        minusBTN = new Button();
        divideBTN = new Button();
        multiBTN = new Button();
        logBTN = new Button();
        powerBTN = new Button();
        squareBTN = new Button();
        hBox1 = new HBox(btn1,btn2,btn3);
        hBox2 = new HBox(btn4,btn5,btn6);
        hBox3 = new HBox(btn7,btn8,btn9);
        hBox4 = new HBox(equalBTN,btn0,dotBTN);
        vBox1 = new VBox(hBox1,hBox2,hBox3,hBox4);
        vBox2 = new VBox(addBTN,minusBTN,multiBTN,divideBTN);
        vBox3 = new VBox(logBTN,powerBTN,squareBTN,convertBTN);
    }
    public TextField getNumber() {
        return number;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public HBox gethBox1() {
        return hBox1;
    }

    public HBox gethBox2() {
        return hBox2;
    }

    public HBox gethBox3() {
        return hBox3;
    }

    public HBox gethBox4() {
        return hBox4;
    }

    public Button getBtn1() {
        return btn1;
    }

    public Button getBtn2() {
        return btn2;
    }

    public Button getBtn3() {
        return btn3;
    }

    public Button getBtn4() {
        return btn4;
    }

    public Button getBtn5() {
        return btn5;
    }

    public Button getBtn6() {
        return btn6;
    }

    public Button getBtn7() {
        return btn7;
    }

    public Button getBtn8() {
        return btn8;
    }

    public Button getBtn9() {
        return btn9;
    }

    public Button getBtn0() {
        return btn0;
    }

    public Button getDotBTN() {
        return dotBTN;
    }

    public Button getEqualBTN() {
        return equalBTN;
    }

    public Button getAddBTN() {
        return addBTN;
    }

    public Button getMinusBTN() {
        return minusBTN;
    }

    public Button getDivideBTN() {
        return divideBTN;
    }

    public Button getMultiBTN() {
        return multiBTN;
    }

    public Button getLogBTN() {
        return logBTN;
    }

    public Button getPowerBTN() {
        return powerBTN;
    }

    public Button getSquareBTN() {
        return squareBTN;
    }

    public Button getConvertBTN() {
        return convertBTN;
    }

    private Button convertBTN;
}

