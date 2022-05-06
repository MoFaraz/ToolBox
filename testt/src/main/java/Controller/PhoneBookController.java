package Controller;

import View.Person;
import View.PhoneBook;

public class PhoneBookController {
    private PhoneBook phoneBook;

    public PhoneBookController() {
        phoneBook = new PhoneBook();
        phoneBook.getAddBTN().setOnAction(event -> {
            Person person = new Person(phoneBook.getFirstNameFLD().getText(), phoneBook.getLastNameFLD().getText(),phoneBook.getPhoneNumberFLD().getText(),phoneBook.getAddressFLD().getText() );
            
        });
    }

    public PhoneBook getPhoneBook() {
        return phoneBook;
    }
}
