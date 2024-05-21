/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffproject;

import java.awt.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
    
    public void removeBorrowedBooks() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from borrowedbooks";
            prestmt = conn.prepareStatement(cmd);

            result = prestmt.executeQuery();
            while(result.next()) {
                int bookid = result.getInt("BookID");
                
                Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
                PreparedStatement prestmt1 = conn1.prepareStatement("delete from reservation where book_id = ?");
                prestmt1.setInt(1,bookid);
                prestmt1.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void getReservationTable(JTextField a,JTable b) {
        String text = a.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from reservation WHERE student_id LIKE \""+ text +"%\" or book_id LIKE \""+ text +"%\""+" ORDER BY student_name ASC, book_name asc";
            prestmt = conn.prepareStatement(cmd);

            result = prestmt.executeQuery();
            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            while(result.next()) {
                table.addRow(new Object[]{result.getInt("student_id"),result.getString("student_name"),result.getInt("book_number"),result.getString("book_name")});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public boolean addBalance(int studId,double balance) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select count(*) from useraccountinfo WHERE student_ID = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1, studId);
            result = prestmt.executeQuery();
            result.next();
            if(result.getInt(1) == 0) {
                return false;
            }
            cmd = "select * from useraccountinfo WHERE student_ID = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1, studId);
            result = prestmt.executeQuery();
            result.next();
            
            double cash_balance = result.getDouble("cash_balance");
            cash_balance += balance;
            
            cmd = "UPDATE useraccountinfo SET cash_balance = ? WHERE student_ID = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setDouble(1, cash_balance);
            prestmt.setInt(2, studId);
            prestmt.executeUpdate();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return false;
    }
    
    public void moveInfoToHistory() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
        
            String cmd = "select * from borrowedBooks";
            prestmt = conn.prepareStatement(cmd);
            prestmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void returnBook(int StudID,int bookID,String date,String condition,int ban) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from borrowedBooks WHERE studentID = ? and BookId = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,StudID);
            prestmt.setInt(2,bookID);
            result = prestmt.executeQuery();
            result.next();
            double payable = result.getDouble("Payable");
            
            cmd = "UPDATE borrowedBooks SET Date_Returned = ?, Condition_Returned = ?, Payable = ? WHERE studentID = ? and BookId = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1,date);
            prestmt.setString(2,condition);
            prestmt.setDouble(3,payable);
            prestmt.setInt(4,StudID);
            prestmt.setInt(5,bookID);
            prestmt.executeUpdate();
            
            cmd = "UPDATE bookInformation SET available = 0 WHERE BookId = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,bookID);
            prestmt.executeUpdate();
            
            cmd = "UPDATE useraccountinfo SET days_banned = ? WHERE student_ID = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,ban);
            prestmt.setInt(2,StudID);
            prestmt.executeUpdate();
            
            cmd = "UPDATE bookinformation SET Condition_ = ? WHERE BookId = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1,condition);
            prestmt.setInt(2,bookID);
            prestmt.executeUpdate();
            
            cmd = "INSERT INTO borrowhistory SELECT * FROM borrowedbooks WHERE bookid = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,bookID);
            prestmt.executeUpdate();
            
            cmd = "DELETE FROM borrowedbooks WHERE bookid = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,bookID);
            prestmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public boolean payWithCashBalance(int StudID,int bookID) {
        try {
            double[] cash = new double[2];
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from useraccountinfo WHERE student_ID = ?";
            
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,StudID);
            result = prestmt.executeQuery();
            result.next();
            
            cash[0] = result.getDouble("cash_balance");
            
            cmd = "select * from borrowedbooks WHERE studentID = ? and BookId = ?";
            
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,StudID);
            prestmt.setInt(2,bookID);
            result = prestmt.executeQuery();
            result.next();
            
            cash[1] = result.getDouble("Payable");
            if(cash[1] == 0) {
                return true;            
            } 
            if(cash[0]>=cash[1]) {  
                if (JOptionPane.showConfirmDialog(null, "Deduct to Cash balance", "Confirmation", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    cmd = "UPDATE useraccountinfo SET cash_balance = ? WHERE student_ID = ?";
                    
                    prestmt = conn.prepareStatement(cmd);
                    prestmt.setDouble(1,cash[0]-cash[1]);
                    prestmt.setInt(2,StudID);
                    prestmt.executeUpdate();
                    return true;
                }
                else {
                    return JOptionPane.showConfirmDialog(null, "The student already payed?", "Confirmation", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return false;
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
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void currentSetting(JLabel a,JLabel b) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from overdueFees where ID = 0";
            prestmt = conn.prepareStatement(cmd);

            result = prestmt.executeQuery();
            result.next();
            String txt = Double.toString(result.getDouble("Fine_per_day"))+" Pesos(₱)";
            a.setText(txt);
            
            int day = result.getInt("Borrow_Period");
            String txt1 = (day<2) ? " Day":" Days";
            txt = Integer.toString(day)+ txt1;
            b.setText(txt);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void getCurrentSetting(String[] arr) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from overdueFees where ID = 0";
            prestmt = conn.prepareStatement(cmd);

            result = prestmt.executeQuery();
            result.next();
            arr[0] = Integer.toString(result.getInt("Borrow_Period"));
            arr[1] = Double.toString(result.getDouble("Fine_per_day"));
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
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
            for(int i=0;i<2;i++) {
                token[i] = bookname1.nextToken();
            }
            
            cmd = "select * from  bookInformation where Book_Name LIKE \""+token[1]+"%\" and Book_Number = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,Integer.parseInt(token[0]));
            
            result = prestmt.executeQuery();
            result.next();
            info[2] = Integer.toString(result.getInt("BookID"));
            info[3] = token[1];
            info[9] = result.getString("Condition_"); 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void upload(String[] info) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //get student Info
            String cmd = "INSERT INTO borrowedbooks VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,Integer.parseInt(info[0]));
            prestmt.setString(2,info[1]);
            prestmt.setInt(3,Integer.parseInt(info[2]));
            prestmt.setString(4,info[3]);
            prestmt.setString(5,info[4]);
            prestmt.setString(6,null);
            prestmt.setString(7,info[6]);
            prestmt.setDouble(8,Double.parseDouble(info[7]));
            prestmt.setDouble(9,0);
            prestmt.setString(10,info[9]);
            prestmt.setString(11,null);
            
            prestmt.executeUpdate();
            //set book to unavailable
            cmd = "UPDATE bookInformation SET available = 1 WHERE BookID = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,Integer.parseInt(info[2]));
            prestmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public boolean findStudent(int studId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select count(*) from userAccountInfo where student_ID = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,studId);
            result = prestmt.executeQuery();
            result.next();
            if(result.getInt(1) == 0) {
                return false;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return true;
    }
    
    public void borrowedBookSearch(JTextField a,JTable b) {
        String text = a.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from borrowedBooks WHERE BookID LIKE \""+ text +"%\" or Student_Name LIKE \""+ text +"%\" ORDER BY  Student_Name asc";
            prestmt = conn.prepareStatement(cmd);

            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            result = prestmt.executeQuery();
            while(result.next()) {
                table.addRow(new Object[]{result.getString("StudentId"),result.getString("Student_Name"),result.getInt("BookID"),result.getString("Date_Borrowed"),result.getString("Due_Date"),result.getInt("Payable")});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        a.setText(text);
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
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void SearchMethod(JTextField a,JTable b) {
        String text = a.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from bookInformation WHERE Book_Name LIKE \""+ text +"%\" or BookID LIKE \""+ text +"%\""+" ORDER BY book_name ASC, book_number asc";
            prestmt = conn.prepareStatement(cmd);

            result = prestmt.executeQuery();
            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            while(result.next()) {
                String slot1 = "("+result.getInt("Book_Number")+")"+result.getString("Book_Name");
                table.addRow(new Object[]{result.getInt("BookID"),slot1});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        a.setText(text);
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
            Logger.getLogger(StaffProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        a.setSelectedItem(null);
        a.setPopupVisible(true);
        ((JTextField)a.getEditor().getEditorComponent()).setText(text);
    }
    
    public void centerText1(JTable a) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i<3; i++) {
            a.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }
    
    public void centerText(JTable a) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i<6; i++) {
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
