
import adminproject.loginClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Azcuna
 */
public class CREATEDATABASE {

    /**
     * @param args the command line arguments
     */
    private static Connection conn = null;
    private static PreparedStatement prestmt = null;
    private static ResultSet result = null;
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //create adminaccountinfo
            String query = "create table adminaccountinfo (username varchar(100),pass varchar(100),firstname varchar(100),lastname varchar(100),"
                    + "birthmonth varchar(10),birthday int,birthyear int,gender varchar(10),datecreated varchar(50))";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create staffaccountinfo
            query = "create table staffaccountinfo (username varchar(100),pass varchar(100),firstname varchar(100),lastname varchar(100),"
                    + "birthmonth varchar(10),birthday int,birthyear int,gender varchar(10),datecreated varchar(50))";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create useraccountinfo
            query = "create table staffaccountinfo (username varchar(100),pass varchar(100),firstname varchar(100),lastname varchar(100),"
                    + "birthmonth varchar(10),birthday int,birthyear int,gender varchar(10),student_ID int,cash_balance double,days_banned int,datecreated varchar(50))";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create useraccountinfo
            query = "create table staffaccountinfo (username varchar(100),pass varchar(100),firstname varchar(100),lastname varchar(100),"
                    + "birthmonth varchar(10),birthday int,birthyear int,gender varchar(10),student_ID int,cash_balance double,days_banned int,datecreated varchar(50))";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(loginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    private static void closemySQL() {
        if (result != null) {
            try {
                result.close();
            } catch (SQLException sqlEx) { }
                result = null;
        }
        if (prestmt != null) {
            try {
                prestmt.close();
            } catch (SQLException sqlEx) { }
                prestmt = null;
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException sqlEx) { }
                conn = null;
       }
    }
    
}
