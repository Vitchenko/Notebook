package DAO;

import javax.naming.InitialContext;
import java.sql.Statement;
        import java.sql.Connection;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.util.logging.Level;
        import java.util.logging.Logger;
import javax.naming.NamingException;
        import javax.sql.DataSource;

public class OraDatabaseConnect {

    public Statement connectDb() {

        try {
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource) ic.lookup("jdbc/nb");
            Connection conn = ds.getConnection();
            Statement stmt = conn.createStatement();
            return stmt;

        } catch (SQLException ex) {
            Logger.getLogger(OraDatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(OraDatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }



    public void print_person(Statement stmt) {

        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("select person_id, Fname, Lname from person where person_id<100");
            while (rs.next()) {
                System.out.println(rs.getString("person_id") + " " + rs.getString("Fname") + " " + rs.getString("Lname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}


