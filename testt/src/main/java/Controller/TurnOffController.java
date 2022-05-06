package Controller;


import View.TurnOff;

import java.io.IOException;

public class TurnOffController{
    private TurnOff turnOff;

    public TurnOff getTurnOff(){
        return turnOff;
    }
    public TurnOffController(){
        turnOff = new TurnOff();
        Runtime runtime = Runtime.getRuntime();
        turnOff.getTurnOffBTN().setOnAction(event -> {
            try {
                runtime.exec("shutdown -s -" + turnOff.getTurnOffFLD().getText());
            }catch (IOException e){
                e.printStackTrace();
            }
        });
    }
    
}