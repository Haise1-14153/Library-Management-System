/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userproject;

import java.awt.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
/**
 *
 * @author Azcuna
 */
public class MySqlClasses {
    
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    
    public void rateBook(double rate,int id,String email) {
        try {
            System.out.println("asdasdd");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from bookinformation where bookid = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1, id);
            result = prestmt.executeQuery();
            result.next();
            String bookname = result.getString("Book_Name");
            double[] rating = {result.getDouble("Score"),result.getDouble("Overall_Score")};
            rating[0]+=rate;
            rating[1]+=5;
            
            cmd = "update bookinformation set Score = ?,Overall_Score = ? where Book_Name = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setDouble(1, rating[0]);
            prestmt.setDouble(2, rating[1]);
            prestmt.setString(3, bookname);
            prestmt.executeUpdate();
            
            cmd = "INSERT INTO rating values(?,?)";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1, email);
            prestmt.setString(2, bookname);
            prestmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public boolean checkIfRated(String email,String name) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select count(*) from rating where email = ? and bookname = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1, email);
            prestmt.setString(2, name);
            result = prestmt.executeQuery();
            result.next();
            if(result.getInt(1) == 0) {
                return true;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return false;
    }
    
    public String getbookName(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from bookinformation where bookid = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1, id);
            result = prestmt.executeQuery();
            result.next();
            return result.getString("Book_Name");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return "0";
    }
    
    public void category(Choice a) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select Category_ from bookinformation group by Category_ having count(*) > 0 order by Category_ asc";
            prestmt = conn.prepareStatement(cmd);
            result = prestmt.executeQuery();
            a.insert("All", 0);
            for(int i = 1;result.next();i++) {
                a.insert(result.getString(1), i);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public boolean checkduplicate(int studid,int bookid) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select count(*) from reservation WHERE student_id = ? and book_id = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1, studid);
            prestmt.setInt(2, bookid);
            result = prestmt.executeQuery();
            result.next();
            if(result.getInt(1) > 0) {
                return false;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return true;
    }
    
    public void cancelreservation(int studid,int bookid) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "delete from reservation WHERE student_id = ? and book_id = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1, studid);
            prestmt.setInt(2, bookid);
            prestmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void viewreservedbook(JTable a,int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from reservation WHERE student_id = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1, id);
            
            DefaultTableModel table = (DefaultTableModel)a.getModel();
            table.setRowCount(0);
            result = prestmt.executeQuery();
            while(result.next()) {
                table.addRow(new Object[]{result.getInt("book_id"),result.getString("book_name"),result.getString("date_reserved")});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void reservebook(int bookid,int studid,String studname,String date) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String[] book = new String[2];
            String cmd = "select * from bookinformation where bookid = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,bookid);
            result = prestmt.executeQuery();
            result.next();
            book[0] = result.getString("book_name");
            book[1] = result.getString("Book_Number");
            
            cmd = "insert into reservation values(?,?,?,?,?,?)";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,studid);
            prestmt.setString(2,studname);
            prestmt.setInt(3,bookid);
            prestmt.setString(4,book[0]);
            prestmt.setInt(5,Integer.parseInt(book[1]));
            prestmt.setString(6,date);
            
            prestmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void getCashBalance(JLabel a,String email) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
        
            String cmd = "select * from useraccountinfo where username = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1, email);
            
            result = prestmt.executeQuery();
            result.next();
            double balance = result.getDouble("cash_balance");
            String text = "Cash balance: ₱"+balance;
            a.setText(text);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void notification(JButton a,String username) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
        
            String cmd = "select count(*) from notification where email = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1, username);
            
            result = prestmt.executeQuery();
            result.next();
            int count = result.getInt(1);
            String text = (count == 0) ? "Notification":"Notification("+count+")";
            a.setText(text);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void removenotification(JButton a,String username) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
        
            String cmd = "delete from notification where email = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1, username);
            
            prestmt.executeUpdate();
            a.setText("Notification");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void updatePayable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
        
            String cmd = "select * from borrowedBooks";
            prestmt = conn.prepareStatement(cmd);
            result = prestmt.executeQuery();

            while(result.next()) {
                int[] due = new int[3];
                StringTokenizer st2 = new StringTokenizer(result.getString("Due_Date"), "- ");
                for(int i=0;st2.hasMoreTokens();i++){
                    if(i==0) {
                        String mon = st2.nextToken();
                        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
                        for(int j=0;j<12;j++){
                            if(mon.equals(month[j])) {
                                due[0] = j+1;
                                break;
                            }
                        }
                    } 
                    else {
                        due[i] = Integer.parseInt(st2.nextToken());
                    }
                }
                int bookId = result.getInt("BookID");
                long gap = ChronoUnit.DAYS.between(LocalDate.of(due[2],due[0],due[1]), LocalDate.now());
                if(gap > 0) {
                    double payable = gap * result.getDouble("Fine_per_day");
                    cmd = "update borrowedBooks set Payable = ? where BookID = ?";
                    prestmt = conn.prepareStatement(cmd);
                    prestmt.setDouble(1,payable);
                    prestmt.setInt(2,bookId);
                    prestmt.executeUpdate();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public boolean findInBorrowedBookList(int studId, int bookId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select count(*) from borrowedBooks where studentID = ? and BookId = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,studId);
            prestmt.setInt(2,bookId);
            result = prestmt.executeQuery();
            result.next();
            if(result.getInt(1) == 0) {
                return false;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return true;
    }
    public void getInfo(String[] info,int StudID,String bookname) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //get student Info
            String cmd = "select * from  useraccountinfo where Student_ID = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,StudID);
            
            result = prestmt.executeQuery();
            result.next();
            String name = result.getString("firstname")+" "+result.getString("lastname");
            info[1] = name;
            
            //get book info
            StringTokenizer bookname1 = new StringTokenizer(bookname,"()");
            String[] token = new String[2];
            for(int i=0;bookname1.hasMoreTokens();i++) {
                token[i] = bookname1.nextToken();
            }
            
            cmd = "select * from  bookInformation where Book_Name = ? and Book_Number = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1,token[1]);
            prestmt.setInt(2,Integer.parseInt(token[0]));
            
            result = prestmt.executeQuery();
            result.next();
            info[2] = Integer.toString(result.getInt("BookID"));
            info[3] = token[1];
            info[9] = result.getString("Condition_"); 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    
    public void getBorrowedBooks(JTable b,int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from borrowedBooks WHERE StudentID = ? ORDER BY Book_Name asc";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1, id);
            
            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            result = prestmt.executeQuery();
            while(result.next()) {
                table.addRow(new Object[]{result.getInt("BookID"),result.getString("Book_Name"),result.getString("Date_Borrowed"),result.getString("Due_Date"),result.getDouble("Payable")});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void showInTable(JTable a) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from borrowedBooks";
            prestmt = conn.prepareStatement(cmd);
            DefaultTableModel table = (DefaultTableModel)a.getModel();
            table.setRowCount(0);
            result = prestmt.executeQuery();
            while(result.next()) {
                table.addRow(new Object[]{result.getInt("StudentID"),result.getString("Student_Name"),result.getInt("BookID"),result.getString("Date_Borrowed"),result.getString("Due_Date"),result.getDouble("Payable")});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void studentReceiver(JComboBox a) {
        String text = ((JTextField)a.getEditor().getEditorComponent()).getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from userAccountinfo WHERE firstname LIKE \""+ text +"%\" or lastname LIKE \""+ text +"%\" or student_id LIKE \""+ text +"%\"";
            prestmt = conn.prepareStatement(cmd);
            
            result = prestmt.executeQuery();
            a.removeAllItems();
            
            while(result.next()) {
                String ID = result.getString("student_ID");
                String fname = result.getString("firstname");
                String lname = result.getString("lastname");
                String txt = ID + " - " + fname + " "+ lname;
                a.addItem(txt);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        a.setSelectedItem(null);
        a.setPopupVisible(true);
        ((JTextField)a.getEditor().getEditorComponent()).setText(text);
    }
    
    public void getData(int[] data) {             
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //available books
            String cmd = "select count(*) from bookInformation where available = 0";
            prestmt = conn.prepareStatement(cmd);
            
            result = prestmt.executeQuery();
            result.next();
            data[0] = result.getInt(1);
            //unavailable books
            cmd = "select count(*) from bookInformation where available = 1";
            prestmt = conn.prepareStatement(cmd);
            
            result = prestmt.executeQuery();
            result.next();
            data[1] = result.getInt(1);
            //total number of books
            cmd = "select count(*) from bookInformation";
            prestmt = conn.prepareStatement(cmd);
            
            result = prestmt.executeQuery();
            result.next();
            data[2] = result.getInt(1);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void SearchMethod(JTextField a,JTable b,int setting,String c) {
        String text = a.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from bookInformation WHERE available = ? and Category_ = ? and (Book_Name LIKE \""+ text +"%\" or BookID LIKE \""+ text +"%\")"+" ORDER BY book_name ASC, book_number asc";
            String cmd1 = "select * from bookInformation WHERE available = ? and (Book_Name LIKE \""+ text +"%\" or BookID LIKE \""+ text +"%\")"+" ORDER BY book_name ASC, book_number asc";
            if(c.equals("All")) {
                prestmt = conn.prepareStatement(cmd1);
                prestmt.setInt(1,setting);
            }
            else {
                prestmt = conn.prepareStatement(cmd);
                prestmt.setInt(1,setting);
                prestmt.setString(2,c);
            }
            
            result = prestmt.executeQuery();
            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            DecimalFormat df = new DecimalFormat("#.#"); 
            while(result.next()) {
                double overallscore = result.getDouble("Overall_Score");
                double rating = result.getDouble("Score")/overallscore*5;
                String ratings = (overallscore==0) ? "none" : df.format(rating).toString()+"/5.0";
                String slot1 = "("+result.getInt("Book_Number")+")"+result.getString("Book_Name");
                table.addRow(new Object[]{result.getInt("BookID"),slot1,ratings});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        a.setText(text);
    }
    
    public void SearchMethod(JTable b,int setting,String c) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from bookInformation WHERE available = ? and Category_ = ? ORDER BY book_name ASC, book_number asc";
            String cmd1 = "select * from bookInformation WHERE available = ? ORDER BY book_name ASC, book_number asc";
            if(c.equals("All")) {
                prestmt = conn.prepareStatement(cmd1);
                prestmt.setInt(1,setting);
            }
            else {
                prestmt = conn.prepareStatement(cmd);
                prestmt.setInt(1,setting);
                prestmt.setString(2,c);
            }
            
            result = prestmt.executeQuery();
            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            while(result.next()) {
                String slot1 = "("+result.getInt("Book_Number")+")"+result.getString("Book_Name");
                table.addRow(new Object[]{result.getInt("BookID"),slot1});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void borrowSearchMethod(JComboBox a) {
        String text = ((JTextField)a.getEditor().getEditorComponent()).getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from bookInformation WHERE available = 0 and Book_Name LIKE \""+ text +"%\""+" ORDER BY book_name ASC, book_number asc";
            prestmt = conn.prepareStatement(cmd);

            result = prestmt.executeQuery();
            a.removeAllItems();
            while(result.next()) {
                String txt = result.getString("Book_Name");
                int number = result.getInt("Book_Number");
                a.addItem("("+number+")"+txt);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        a.setSelectedItem(null);
        a.setPopupVisible(true);
        ((JTextField)a.getEditor().getEditorComponent()).setText(text);
    }
    
    public void centerText(JTable a) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i<6; i++) {
            a.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }
    
    public void centerText1(JTable a) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i<5; i++) {
            if(i==1) {
                continue;
            }
            a.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }
    
    public void centerText2(JTable a) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        a.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        a.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
    }
    
    public void centerText3(JTable a) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i<3; i++) {
            if(i==1) {
                continue;
            }
            a.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }
    
    public void setheadertoBold(JTable a) {
        JTableHeader table = a.getTableHeader();
        table.setFont(new java.awt.Font("Segoe UI",Font.BOLD,18));
        
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)a.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        a.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
    }

    public void setText(JLabel a,JLabel b,JLabel c,int[] data) {   
        a.setText(Integer.toString(data[0]));
        b.setText(Integer.toString(data[1]));
        c.setText(Integer.toString(data[2]));
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
