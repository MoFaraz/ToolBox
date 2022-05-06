package Controller;

import View.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private Calculator calculator;

    public CalculatorController() {
        calculator = new Calculator();
    }

    public Calculator getCalculator() {
        return calculator;
    }
}