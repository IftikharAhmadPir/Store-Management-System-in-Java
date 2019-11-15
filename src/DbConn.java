/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc world
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConn {
public static String dbpath=("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=D:\\J2SE\\Medical Store\\MedicalStore.accdb");
public boolean UDI(String query){

try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection(DbConn.dbpath);
            Statement stmt = conn.createStatement();
            stmt.execute(query);
            conn.close();
            return true;
        }
        catch(java.lang.ClassNotFoundException ex)
        {
            return false;
            //        JOptionPane.showMessageDialog(null,"Exception Occured"+ex.getMessage());
        }
        catch(Exception ex)
        {
            return false;
            //          JOptionPane.showMessageDialog(null,"Exception Occured"+ex.getMessage());
        }

}
    public ResultSet Search(String query){


  try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection(DbConn.dbpath);
            Statement stmt = conn.createStatement();
            stmt.execute(query);
            ResultSet rs = stmt.getResultSet();// get results of query
           return rs;
    }catch(java.lang.ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured"+ex.getMessage());
          return null;
        }
        catch(Exception ex)
        {

            JOptionPane.showMessageDialog(null,"Exception Occured"+ex.getMessage());
            return null;
        }
}
}
