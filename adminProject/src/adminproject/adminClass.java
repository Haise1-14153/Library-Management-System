package adminproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class adminClass {
    
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    
    private int generateBookID() {
        int number = ThreadLocalRandom.current().nextInt(100000,1000000);
        return number;
    }
    
    public void listBook(String bookname,String author,String ISBN,String language,String category,String condition,int quantity) {
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
                prestmt.setString(4,ISBN);
                prestmt.setString(5,language);
                prestmt.setString(6,category);
                prestmt.setString(7,condition);
                prestmt.setInt(8,booknum+i+1);
                prestmt.setDouble(9,0);
                prestmt.setDouble(10,0);
                prestmt.setDouble(11,0);
                prestmt.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(adminloginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(adminloginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return true;
    }
    
    public void saveInfo(String base,String LANGUAGE,String CATEGORY) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String query = "UPDATE bookInformation SET Language_ = ?, Category_ = ? WHERE Book_name = ?";
            prestmt = conn.prepareStatement(query);
            prestmt.setString(1,LANGUAGE);
            prestmt.setString(2,CATEGORY);
            prestmt.setString(3,base);
            prestmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(adminloginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(adminloginClass.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(adminloginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(adminloginClass.class.getName()).log(Level.SEVERE, null, ex);
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
