package Controller;


import View.Convertor;
import ir.huri.jcal.JalaliCalendar;
import javafx.scene.text.Text;

import java.util.GregorianCalendar;

public class ConvertorController {
    private Convertor convertor;
    private int salShamsi;
    private int mahShamsi;
    private int rozShamsi;

    public ConvertorController(){
        convertor = new Convertor();
        convertor.getConvertBTN().setOnAction(event -> {
           try {
               int year = Integer.parseInt(convertor.getYearFLD().getText());
               int month = Integer.parseInt(convertor.getMonthFLD().getText());
               int day = Integer.parseInt(convertor.getDayFLD().getText());
                   JalaliCalendar jalaliCalendar = new JalaliCalendar(new GregorianCalendar(year, month, day));

                   convertor.getYearFLD().setVisible(false);
                   convertor.getMonthFLD().setVisible(false);
                   convertor.getDayFLD().setVisible(false);

                   convertor.getConvertBTN().setText(jalaliCalendar.toString());
           }catch (NullPointerException e){
               e.printStackTrace();
           }
           });
    }


    public Convertor getConvertor() {
        return convertor;
    }
}
