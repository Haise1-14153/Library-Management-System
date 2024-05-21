package adminproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class addBookInfoSqlClass {
    
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    
    private int generateBookID() {
        int number = ThreadLocalRandom.current().nextInt(100000,1000000);
        return number;
    }
    
    public void listBook(String bookname,String author,String overview,String language,String category,String condition,int quantity) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            int baseID;
            int booknum = 0;
            while(true) {
                boolean flag = true;
                baseID = generateBookID();
                String query = "Select count(BookID) from bookInformation where BookID >= "+ baseID;
                prestmt = conn.prepareStatement(query);
                result = prestmt.executeQuery();
                result.next();
                if(result.getInt(1) != 0) {
                    query = "Select BookID from bookInformation where BookID >= "+ baseID;
                    prestmt = conn.prepareStatement(query);
                    result = prestmt.executeQuery();
                    for(int i=0;i<quantity && result.next();i++) {
                        result.next();
                        if(baseID+i == result.getInt(1)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) {
                    break;
                }
            }
            String query ="select * from bookInformation WHERE Book_Name LIKE \""+ bookname +"%\"";
            prestmt = conn.prepareStatement(query);
            result = prestmt.executeQuery();
            while(result.next()) {
                booknum = result.getInt("Book_Number");
            }
            
            for(int i=0;i<quantity;i++) {
                prestmt = conn.prepareStatement("insert into bookInformation values(?,?,?,?,?,?,?,?,?,?,?)");
                prestmt.setInt(1,baseID+i);
                prestmt.setString(2,bookname);
                prestmt.setString(3,author);
                prestmt.setString(4,overview);
                prestmt.setString(5,language);
                prestmt.setString(6,category);
                prestmt.setString(7,condition);
                prestmt.setInt(8,booknum+i+1);
                prestmt.setDouble(9,0);
                prestmt.setDouble(10,0);
                prestmt.setDouble(11,0);
                prestmt.executeUpdate();
            }
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
