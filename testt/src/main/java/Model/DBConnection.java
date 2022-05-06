package Model;

import View.Person;
import javafx.collections.ObservableList;

import java.sql.*;

public class DBConnection {

    private Connection con = null;
    private String JDBC = "com.mysql.jdbc.Driver";
    private String username = "root", password = "";
    private final String dbname = "jdbc:mysql://localhost/phonebook";

    public DBConnection() throws Exception {

    }//END Conn()

    public void Connect() throws Exception {

        try {
            Class.forName(JDBC);
            con = DriverManager.getConnection(dbname, username, password);
            System.out.println("Success...");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            System.out.println("Failure");
        }
    }//end CONNECT()

    public Connection Conn() throws Exception {

        try {
            Class.forName(JDBC);
            con = DriverManager.getConnection(dbname, username, password);
            System.out.println("Success...");
            return con;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            System.out.println("Failure");
            return null;
        }
    }//end CONNECT()

    public void addPerson(Person person) throws Exception {
        Connect();

        //SQL to add the new contact
        String sqlString = "INSERT into contacts (first_name, last_name, phone_number, address) VALUES ('" + person.getFirstName() + "', '" + person.getLastName() + "', '" + person.getPhoneNumber() + "', '" + person.getAddress() + "')";
        try {
            //PreparedStatement ps = con.prepareStatement(sqlString);
            Statement st = (Statement) con.createStatement();
            st.execute(sqlString);

        } catch (Exception e) {
            //print the error
            System.out.println("There was an error: " + e);
        }

        con.close();
    }

    public void removePerson(String number) throws Exception{
        Connect();

        //SQL to add the new contact
        String sqlString = "DELETE from contacts WHERE phone_number= '" + number + "'";
        try {
            //PreparedStatement ps = con.prepareStatement(sqlString);
            Statement st = (Statement) con.createStatement();
            st.execute(sqlString);

        } catch (Exception e) {
            //print the error
            System.out.println("There was an error: " + e);
        }

        con.close();
    }


    public void closeCon() throws SQLException {
        con.close();
    }
}
