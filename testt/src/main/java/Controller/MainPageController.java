package Controller;


import View.MainPage;

public class MainPageController {
    private MainPage mainPage;

    public MainPageController(){
        mainPage = new MainPage();
    }
    public MainPage getMainPage(){
        return mainPage;
    }
}
