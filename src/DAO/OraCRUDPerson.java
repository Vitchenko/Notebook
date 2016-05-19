package DAO;

import Beans.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by viv on 18.05.2016.
 */
public class OraCRUDPerson implements CRUDPerson {
    @Override
    public void createPerson(Statement stmt, Person Pr) throws SQLException {

        String strSql;

        strSql = "INSERT ALL INTO person (Person_id, Lname, Fname, Adress, Pole, Email) VALUES (Person_sc.NEXTVAL, '" +
                Pr.getLname() + "', '" + Pr.getFname() + "', '" + Pr.getAdress() + "'," + Pr.getPole() + ", '" + Pr.getEmail() + " ') " +
                "INTO phones (id, ph_number, person_id) VALUES (Phones_sc.NEXTVAL, '" + Pr.getPhone() + "', Person_sc.currval )"
                + " SELECT * FROM dual";

        //System.out.println(strSql);

        ResultSet rs = null;


        try {
            rs = stmt.executeQuery(strSql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                stmt.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }


    }

    @Override
    public Person viewPerson(Statement stmt, int personid, String fname, String lname, String adress, String email, int pole, String phone) {
        return null;
    }

    @Override
    public void deletePerson(Statement stmt, int personid) {

    }

    @Override
    public void updatePerson(Statement stmt, int personid) {

    }

    @Override
    public ArrayList<Person> viewAllPerson(Statement stmt) {
        return null;
    }

    @Override
    public ArrayList<Person> viewPersonLet(Statement stmt, String let) {
        return null;
    }

//    }


}
