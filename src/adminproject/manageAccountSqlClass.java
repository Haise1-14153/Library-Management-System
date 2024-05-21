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

/**
 *
 * @author Azcuna
 */
public class manageAccountSqlClass {
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    
    public void save(String email,String firstname,String lastname,String gender) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "update adminaccountinfo SET firstname = ?,lastname = ?,gender = ? where username = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1,firstname);
            prestmt.setString(2,lastname);
            prestmt.setString(3,gender);
            prestmt.setString(4,email);
            
            prestmt.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void getInfo(String[] arr,String email) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from adminAccountInfo where username = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1,email);
            
            result = prestmt.executeQuery();
            result.next();
            arr[0] = result.getString("firstname");
            arr[1] = result.getString("lastname");
            arr[2] = result.getString("gender");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
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
