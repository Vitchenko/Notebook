package DAO;

import Beans.Person;

import java.util.ArrayList;

/**
 * Created by viv on 18.05.2016.
 */
public interface CRUDPerson {
//interface for operation from SUBD;

    void createPerson(Person Pr);
    Person viewPerson(int personid, String fname, String lname, String adress, String email, int pole, String phone);
    void deletePerson(Person Pr);
    void updatePerson(Person Pr);
    ArrayList<Person> viewAllPerson();
    ArrayList<Person> viewPersonLet(); //All person for firts-letter in LastName

}
