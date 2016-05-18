package DAO;

import javax.naming.InitialContext;

/**
 * Created by viv on 17.05.2016.
 */

import java.sql.Statement;
        import java.sql.Connection;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.util.logging.Level;
        import java.util.logging.Logger;
        import javax.naming.InitialContext;
        import javax.naming.NamingException;
        import javax.sql.DataSource;

public class testjdbc {

    public void check() {

        try {
            InitialContext ic = new InitialContext();
            //DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/Library");
            DataSource ds = (DataSource) ic.lookup("jdbc/nb");
            Connection conn = ds.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select person_id, Fname, Lname from person where person_id<100");
            while (rs.next()) {
                System.out.println(rs.getString("person_id") + " " +rs.getString("Fname") + " " + rs.getString("Lname"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(testjdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(testjdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
