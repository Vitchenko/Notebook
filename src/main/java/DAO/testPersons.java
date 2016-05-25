package DAO;

import Beans.Person;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by viv on 25.05.2016.
 */
public class testPersons {
    //create test persons

    public void personsToDB(Statement stmt) {

        Person pr = new Person();
        OraDatabaseConnect ord = new OraDatabaseConnect();

        OraCRUDPerson OraCRUD = new OraCRUDPerson();


     for (int i=0;i<10000; i++){

         pr.setLname("Antonov" + i);
         pr.setFname("Anton" + i);
         pr.setAdress("Yadova" + i);
         pr.setEmail("anton" + i + "@test.ua2" + i);
         pr.setPhone("+380678794" + i);
         pr.setPole(1);

         try {
             OraCRUD.createPerson(stmt, pr);
         } catch (SQLException e) {
             e.printStackTrace();
         }

         pr = new Person();
         pr.setLname("Pushkin" + i);
         pr.setFname("Aleks" + i);
         pr.setAdress("Pushkina" + i);
         pr.setEmail("Push" + i + "@test.ua2" + i);
         pr.setPhone("+380998794" + i+i);
         pr.setPole(1);

         try {
             OraCRUD.createPerson(stmt, pr);
         } catch (SQLException e) {
             e.printStackTrace();
         }

         pr = new Person();
         pr.setLname("Watson" + i);
         pr.setFname("Charlz" + i);
         pr.setAdress("Beiker" + i);
         pr.setEmail("Watson" + i + "@test.ua2" + i);
         pr.setPhone("+3807318794" + i+i);
         pr.setPole(1);

         try {
             OraCRUD.createPerson(stmt, pr);
         } catch (SQLException e) {
             e.printStackTrace();
         }


         pr = new Person();
         pr.setLname("Donald" + i);
         pr.setFname("Dack" + i);
         pr.setAdress("Disney" + i);
         pr.setEmail("Dack" + i + "@test.ua2" + i);
         pr.setPhone("+380508794" + i+i);
         pr.setPole(1);

         try {
             OraCRUD.createPerson(stmt, pr);
         } catch (SQLException e) {
             e.printStackTrace();
         }


         pr = new Person();
         pr.setLname("Iowa" + i);
         pr.setFname("Luda" + i);
         pr.setAdress("Stepova" + i);
         pr.setEmail("Luda" + i + "@test.ua2" + i);
         pr.setPhone("+380938794" + i+i);
         pr.setPole(2);

         try {
             OraCRUD.createPerson(stmt, pr);
         } catch (SQLException e) {
             e.printStackTrace();
         }


         pr = new Person();
         pr.setLname("Dimitriva" + i);
         pr.setFname("Lena" + i);
         pr.setAdress("Prospert" + i);
         pr.setEmail("Lena" + i + "@test.ua2" + i);
         pr.setPhone("+380938794" + i+i);
         pr.setPole(2);

         try {
             OraCRUD.createPerson(stmt, pr);
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }





    }

}
