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

        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(strSql);

        } catch (SQLException e) {
            e.printStackTrace();
        }


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
    public ArrayList<Person> viewAllPerson(Statement stmt) throws SQLException {

        Person per = new Person;
        ArrayList PerList = new ArrayList(100);
        String strSql;
        ResultSet rs = null;

        strSql = "SELECT Pr.PERSON_ID, Pr.LNAME, Pr.Fname, Pr.Adress, Pr.Pole, Pr.Email, Ph.ph_number FROM Person Pr, Phones Ph" +
                " where Pr.person_id = Ph.PERSON_ID";

        try {
            rs = stmt.executeQuery(strSql);
            while (rs.next()) {

                per.setPersonid(rs.getInt("person_id"));
                per.setFname(rs.getString("Fname"));
                per.setLname(rs.getString("Lname"));
                per.setEmail(rs.getString("Email"));
                per.setAdress(rs.getString("Adress"));
                per.setPhone(rs.getString("Phone"));
                per.setPole(rs.getInt("Pole"));


                PerList.add(per);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        for (int i=0;i<PerList.size();i++){
            System.out.println("Person" + PerList.get(i));

        }


        return null;
    }

    @Override
    public ArrayList<Person> viewPersonLet(Statement stmt, String let) {


        return null;

    }


}
