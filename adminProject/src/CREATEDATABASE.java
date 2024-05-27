
import adminproject.adminloginClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CREATEDATABASE {
    //this code will be saved on my github. I want to run this program on my laptop soon without errors.
    //the project will automtically delete itself on June 01, 2024.
    //this is just all MySql commands that create tables.
    
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prestmt = null;
        ResultSet result = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //create accountinfo
            String query = "create table accountinfo (username varchar(100),pass varchar(100),firstname varchar(100),lastname varchar(100),birthmonth varchar(10),birthday int,birthyear int,gender varchar(10),datecreated varchar(50),account_type tinyint)";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create useraccountinfo
            query = "create table useraccountinfo (username varchar(100),pass varchar(100),firstname varchar(100),lastname varchar(100),"
                    + "birthmonth varchar(10),birthday int,birthyear int,gender varchar(10),student_ID int,cash_balance double,days_banned int,datecreated varchar(50))";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create bookinformation
            query = "create table bookinformation (BookID int,Book_Name varchar(300),Author varchar(300),ISBN varchar(300),"
                    + "Language_ varchar(30),Category_ varchar(100),Condition_ varchar(10)),Book_Number int,Score double,Overall_Score double,available tinyint";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create borrowedbooks
            query = "create table borrowedbooks (StudentID int,Student_Name varchar(100),BookID int,Book_Name varchar(300)"
                    + ",Date_Borrowed varchar(30),Date_Returned varchar(30),Due_Date varchar(30),Fine_per_day double,payable double,Condition_Borrowed varchar(20),Condition_Returned varchar(20))";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create borrowhistory
            query = "create table borrowedbooks (StudentID int,Student_Name varchar(100),BookID int,Book_Name varchar(300)"
                    + ",Date_Borrowed varchar(30),Date_Returned varchar(30),Due_Date varchar(30),Fine_per_day double,payable double,Condition_Borrowed varchar(20),Condition_Returned varchar(20))";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create codeauthentication
            query = "create table codeauthentication (Email varchar(100),Code_ int)";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create notification
            query = "create table notification (email varchar(300))";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create overduefees
            query = "create table overduefees (ID int,Borrow_Period int,Fine_per_day double)";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create reservation
            query = "create table reservation (student_id int,student_name varchar(100),book_id int,book_name varchar(300),book_number int,date_reserved varchar(50))";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
            //create rating
            query = "create table rating (email varchar(100),bookname varchar(300))";
            prestmt = conn.prepareStatement(query);
            prestmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(adminloginClass.class.getName()).log(Level.SEVERE, null, ex);
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
}
