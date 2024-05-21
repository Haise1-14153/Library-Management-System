
package adminproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class editBookInfoSqlClass {
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    
    public boolean getdata(String name,String[] arr) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String query = "Select count(Book_Name) from bookInformation where Book_Name = ?";
            prestmt = conn.prepareStatement(query);
            prestmt.setString(1,name);
            result = prestmt.executeQuery();
            result.next();
            if(result.getInt(1) == 0){
                JOptionPane.showMessageDialog(null,"Book not found!","Error",JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else {
                query = "Select * from bookInformation where Book_Name = ?";
                prestmt = conn.prepareStatement(query);
                prestmt.setString(1,name);
                result = prestmt.executeQuery();
                result.next();
                for(int i=0;i<arr.length;i++) {
                arr[i] = result.getString(3+i);
                }
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
    
    public void saveInfo(String base,String BOOKNAME,String AUTHOR,String OVERVIEW,String LANGUAGE,String CATEGORY) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String query = "UPDATE bookInformation SET Book_Name = ?, Author = ?, Overview = ?, Language_ = ?, Category_ = ? WHERE Book_name = ?";
            prestmt = conn.prepareStatement(query);
            prestmt.setString(1,BOOKNAME);
            prestmt.setString(2,AUTHOR);
            prestmt.setString(3,OVERVIEW);
            prestmt.setString(4,LANGUAGE);
            prestmt.setString(5,CATEGORY);
            prestmt.setString(6,base);
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
