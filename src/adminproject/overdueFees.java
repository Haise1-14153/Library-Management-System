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
public class overdueFees {
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    
    public void update(int day,double rate) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String query = "delete from overdueFees where Id = 0";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            
            query = "insert into overdueFees values(?,?,?)";
            prestmt = conn.prepareStatement(query);
            prestmt.setInt(1,0);
            prestmt.setInt(2,day);
            prestmt.setDouble(3,rate);
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
