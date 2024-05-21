/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Azcuna
 */
public class unlistBookSqlClass {
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    
    public boolean searchBook(int bookID, String bookName) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String query = "Select count(*) from bookInformation where BookID = ? and Book_Name = ?";
            prestmt = conn.prepareStatement(query);
            prestmt.setInt(1,bookID);
            prestmt.setString(2,bookName);
            result = prestmt.executeQuery();
            result.next();
            if(result.getInt(1) == 0) {
                JOptionPane.showMessageDialog(null,"Book not found!","Error",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(loginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return true;
    }
    
    public void removeBook(int bookID, String bookName) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String query = "delete from bookInformation where BookID = ? and Book_Name = ?";
            prestmt = conn.prepareStatement(query);
            prestmt.setInt(1,bookID);
            prestmt.setString(2,bookName);
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
    
    private void closemySQL() {
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