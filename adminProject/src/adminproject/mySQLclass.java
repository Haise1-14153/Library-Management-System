
package adminproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class mySQLclass {
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    
    public boolean loggingIn(String user, String pass) {
        boolean returnValue = true;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            
            prestmt = conn.prepareStatement("select count(*) from adminaccountinfo where username = ? and pass = ?");
            prestmt.setString(1,user);
            prestmt.setString(2,pass);

            result = prestmt.executeQuery();
            result.next();
            int count = result.getInt(1);
            if(count == 0 ) {
                returnValue = false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if (result != null) {
                try {
                result.close();
                } catch (SQLException sqlEx) { }
                result = null;
            }
            if (prestmt != null) {
                try {
                    prestmt.close();
                } catch (SQLException sqlEx) { } // ignore
                prestmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) { } // ignore
                conn = null;
            }
        }
        return returnValue;
    }
    
    public boolean createAccount(String user, String pass, String fname, String lname,String bmon,int bday,int byear,String gender) {
        boolean resultvalue = true;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            
            prestmt = conn.prepareStatement("select count(*) from adminaccountinfo where username = ?");
            prestmt.setString(1,user);
            
            result = prestmt.executeQuery();
            result.next();
            int count = result.getInt(1);
            
            if(count == 0) {
                prestmt = conn.prepareStatement("insert into adminaccountinfo values(?,?,?,?,?,?,?,?)");
                prestmt.setString(1,user);
                prestmt.setString(2,pass);
                prestmt.setString(3,fname);
                prestmt.setString(4,lname);
                prestmt.setString(5,bmon);
                prestmt.setInt(6,bday);
                prestmt.setInt(7,byear);
                prestmt.setString(8,gender);
            
                prestmt.executeUpdate();
            }
            else {
                JOptionPane.showMessageDialog(null,"Username is already used","Error message",JOptionPane.ERROR_MESSAGE);
                resultvalue = false;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mySQLclass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mySQLclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if (result != null) {
                try {
                result.close();
                } catch (SQLException sqlEx) { }
                result = null;
            }
            if (prestmt != null) {
                try {
                    prestmt.close();
                } catch (SQLException sqlEx) { } // ignore
                prestmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) { } // ignore
                conn = null;
            }
        }
        return resultvalue;
    }
    
    public boolean recoverAccount(String user, String bmon,int bday,int byear) {
        boolean resultvalue = true;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            
            prestmt = conn.prepareStatement("select count(*) from adminaccountinfo where username = ? and birthmonth = ? and birthday = ? and birthyear = ?");
            prestmt.setString(1,user);
            prestmt.setString(2,bmon);
            prestmt.setInt(3,bday);
            prestmt.setInt(4,byear);
            
            
            result = prestmt.executeQuery();
            result.next();
            int count = result.getInt(1);
            
            if(count == 0) {
                JOptionPane.showMessageDialog(null,"Invalid credentials!","Error message",JOptionPane.ERROR_MESSAGE);
                resultvalue = false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mySQLclass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mySQLclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if (result != null) {
                try {
                result.close();
                } catch (SQLException sqlEx) { }
                result = null;
            }
            if (prestmt != null) {
                try {
                    prestmt.close();
                } catch (SQLException sqlEx) { } // ignore
                prestmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) { } // ignore
                conn = null;
            }
        }
        return resultvalue;
    }
    
    public void changepass(String username, String newpass) {
        boolean resultvalue = true;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String query = "update adminaccountinfo SET pass = ? where username = ?";
            prestmt = conn.prepareStatement(query);
            prestmt.setString(1,newpass);
            prestmt.setString(2,username);

            prestmt.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mySQLclass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mySQLclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if (result != null) {
                try {
                result.close();
                } catch (SQLException sqlEx) { }
                result = null;
            }
            if (prestmt != null) {
                try {
                    prestmt.close();
                } catch (SQLException sqlEx) { } // ignore
                prestmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) { } // ignore
                conn = null;
            }
        }
    }
}
