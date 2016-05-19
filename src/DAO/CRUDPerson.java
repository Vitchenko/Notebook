package DAO;

import Beans.Person;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public interface CRUDPerson {
//interface for operation from SUBD;


    void createPerson(Statement stmt, Person Pr) throws SQLException;

    Person viewPerson(Statement stmt, int personid, String fname, String lname, String adress, String email, int pole, String phone);

    void deletePerson(Statement stmt, int personid);

    void updatePerson(Statement stmt, int personid);

    ArrayList<Person> viewAllPerson(Statement stmt);

    ArrayList<Person> viewPersonLet(Statement stmt, String let); //All person for firts-letter in LastName

}
