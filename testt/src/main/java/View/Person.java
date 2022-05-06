package View;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty phoneNumber;
    private SimpleStringProperty address;

    public Person() {

    }


    public Person(String firstName, String lastName, String phoneNumber, String address) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.address = new SimpleStringProperty(address);
    }

    public String getFirstName() {
        return firstName.getValue();
    }

    public void setFirstName(StringProperty firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName.getValue();
    }

    public void setLastName(SimpleStringProperty lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber.getValue();
    }

    public void setPhoneNumber(SimpleStringProperty phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address.getValue();
    }
    public void setAddress(SimpleStringProperty address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber;
    }
}
