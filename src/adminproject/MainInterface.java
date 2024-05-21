
package adminproject;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class MainInterface extends javax.swing.JFrame implements ActionListener {

    String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    String USERNAME;
    int[] date = new int[3];

    public MainInterface(String name) {
        this.USERNAME = name;
        String date = LocalDate.now().toString();
        StringTokenizer st1 = new StringTokenizer(date, "-");
        for(int i=0;st1.hasMoreTokens();i++){
            this.date[i] = Integer.parseInt(st1.nextToken());
        }
        this.date[1]--;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        parent = new javax.swing.JPanel();
        listBook = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();
        jLabel9 = new javax.swing.JLabel();
        choice3 = new java.awt.Choice();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        editbookinfo = new javax.swing.JPanel();
        input = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        editBookInformation = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jTextField20 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        unlistBook = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel63 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        editOverdueFees = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        choice11 = new java.awt.Choice();
        jTextField7 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        viewBorrowedBooks = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        borrowHistory = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        manageAccount = new javax.swing.JPanel();
        verification = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        choice2 = new java.awt.Choice();
        editInformation = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jTextField19 = new javax.swing.JTextField();
        choice19 = new java.awt.Choice();
        jLabel60 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        inputNewPass = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton18 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        dashboard = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new RoundedPanel(25,new java.awt.Color(255, 153, 0));
        jButton15 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jPanel19 = new RoundedPanel(25,new java.awt.Color(102, 0, 0));
        jButton16 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jPanel20 = new RoundedPanel(25,new java.awt.Color(255, 153, 0));
        jButton24 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        viewadmin = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        viewstaff = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        viewuser = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jButton28 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(270, 550));

        jLabel7.setFont(new java.awt.Font("Sitka Subheading", 1, 65)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADMIN");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("List Book");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Edit Book Information");
        jButton2.setBorderPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Unlist Book");
        jButton3.setBorderPainted(false);
        jButton3.setFocusable(false);
        jButton3.setVerifyInputWhenFocusTarget(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Set overdue fees");
        jButton4.setBorderPainted(false);
        jButton4.setFocusable(false);
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Exit");
        jButton5.setBorderPainted(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("View borrowed books");
        jButton6.setBorderPainted(false);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Dashboard");
        jButton8.setBorderPainted(false);
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Manage account");
        jButton9.setBorderPainted(false);
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 153, 0));
        jLabel49.setText(month[date[1]]+" "+date[2]+" "+date[0]);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel49)
                .addContainerGap())
        );

        parent.setPreferredSize(new java.awt.Dimension(973, 768));
        parent.setLayout(new java.awt.CardLayout());

        listBook.setBackground(new java.awt.Color(255, 255, 255));
        listBook.setPreferredSize(new java.awt.Dimension(1016, 768));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Book name");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Author");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Overview");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Condition");

        choice1.insert("(5)New",1);
        choice1.insert("(4)Fine",2);
        choice1.insert("(3)Good",3);
        choice1.insert("(2)Acceptable",4);
        choice1.insert("(1)Poor",5);
        choice1.setFocusable(false);
        choice1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Category");

        for(int i=1;i<31;i++) {
            choice3.insert(Integer.toString(i),i);
        }
        choice3.setFocusable(false);
        choice3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Language");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setText("List Book");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jButton10.setBackground(new java.awt.Color(51, 0, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Add");
        jButton10.setBorderPainted(false);
        jButton10.setFocusable(false);
        jButton10.setVerifyInputWhenFocusTarget(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout listBookLayout = new javax.swing.GroupLayout(listBook);
        listBook.setLayout(listBookLayout);
        listBookLayout.setHorizontalGroup(
            listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listBookLayout.createSequentialGroup()
                .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(listBookLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel14)
                        .addGap(691, 691, 691))
                    .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listBookLayout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, listBookLayout.createSequentialGroup()
                                        .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(323, 323, 323)))
                                .addGroup(listBookLayout.createSequentialGroup()
                                    .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(choice3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(listBookLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        listBookLayout.setVerticalGroup(
            listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listBookLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(2, 2, 2)
                .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(choice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(choice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        parent.add(listBook, "card2");

        editbookinfo.setPreferredSize(new java.awt.Dimension(1016, 768));
        editbookinfo.setLayout(new java.awt.CardLayout());

        input.setBackground(new java.awt.Color(255, 255, 255));
        input.setPreferredSize(new java.awt.Dimension(973, 583));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel27.setText("Edit Book Information");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Book name");

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jComboBox1.getEditor().getEditorComponent().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editBookSearchMethod(jComboBox1);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jButton12.setBackground(new java.awt.Color(51, 0, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Select");
        jButton12.setBorderPainted(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputLayout = new javax.swing.GroupLayout(input);
        input.setLayout(inputLayout);
        inputLayout.setHorizontalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel27))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputLayout.setVerticalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(496, Short.MAX_VALUE))
        );

        editbookinfo.add(input, "card3");

        editBookInformation.setBackground(new java.awt.Color(255, 255, 255));
        editBookInformation.setPreferredSize(new java.awt.Dimension(973, 768));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Book name");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Author");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Overview");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Category");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Language");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel19.setText("Edit Book Information");

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jButton11.setBackground(new java.awt.Color(51, 0, 0));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Save");
        jButton11.setBorderPainted(false);
        jButton11.setFocusable(false);
        jButton11.setVerifyInputWhenFocusTarget(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton17.setBackground(new java.awt.Color(51, 0, 0));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Cancel");
        jButton17.setBorderPainted(false);
        jButton17.setFocusable(false);
        jButton17.setVerifyInputWhenFocusTarget(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editBookInformationLayout = new javax.swing.GroupLayout(editBookInformation);
        editBookInformation.setLayout(editBookInformationLayout);
        editBookInformationLayout.setHorizontalGroup(
            editBookInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBookInformationLayout.createSequentialGroup()
                .addGroup(editBookInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editBookInformationLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(editBookInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editBookInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editBookInformationLayout.createSequentialGroup()
                                    .addGroup(editBookInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(323, 323, 323)))
                            .addComponent(jLabel17)
                            .addGroup(editBookInformationLayout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editBookInformationLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editBookInformationLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editBookInformationLayout.setVerticalGroup(
            editBookInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBookInformationLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(editBookInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        editbookinfo.add(editBookInformation, "card2");

        parent.add(editbookinfo, "card9");

        unlistBook.setBackground(new java.awt.Color(255, 255, 255));
        unlistBook.setPreferredSize(new java.awt.Dimension(1016, 748));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel28.setText("Unlist Book");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Book name");

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jButton13.setBackground(new java.awt.Color(51, 0, 0));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Select");
        jButton13.setBorderPainted(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Book ID");

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setFocusable(false);
        setheadertoBold(jTable3);
        jTable3.setRowHeight(30);
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setShowGrid(true);
        jTable3.getTableHeader().setResizingAllowed(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(100);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(600);
        }

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel63.setText("Books listed");

        jPanel8.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jTextField23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unlistBookSearchMethod(jTextField23,jTable3);
            }
        });

        javax.swing.GroupLayout unlistBookLayout = new javax.swing.GroupLayout(unlistBook);
        unlistBook.setLayout(unlistBookLayout);
        unlistBookLayout.setHorizontalGroup(
            unlistBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unlistBookLayout.createSequentialGroup()
                .addGroup(unlistBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(unlistBookLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel28))
                    .addGroup(unlistBookLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(unlistBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(unlistBookLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(unlistBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(unlistBookLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel63)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        unlistBookLayout.setVerticalGroup(
            unlistBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unlistBookLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        parent.add(unlistBook, "card3");

        editOverdueFees.setBackground(new java.awt.Color(255, 255, 255));
        editOverdueFees.setPreferredSize(new java.awt.Dimension(1016, 768));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel38.setText("Overdue Fees");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Borrow Period");

        jPanel10.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        choice11.setFocusable(false);
        choice11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        for(int i=0;i<31;i++){
            choice11.insert(Integer.toString(i),i);
        }

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setText("Overdue fine per day");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel26.setText("Pesos(₱)");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel31.setText("Days");

        jButton14.setBackground(new java.awt.Color(51, 0, 0));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Save");
        jButton14.setBorderPainted(false);
        jButton14.setFocusable(false);
        jButton14.setVerifyInputWhenFocusTarget(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTable4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Borrow Period", "Fine per day"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setAutoscrolls(false);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)jTable4.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable4.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jTable4.setFocusable(false);
        jTable4.setGridColor(new java.awt.Color(0, 0, 0));
        jTable4.setMinimumSize(new java.awt.Dimension(30, 30));
        jTable4.setPreferredSize(new java.awt.Dimension(150, 70));
        jTable4.setRowHeight(70);
        jTable4.setRowSelectionAllowed(false);
        jTable4.setShowGrid(true);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel56.setText("Current Setting");

        javax.swing.GroupLayout editOverdueFeesLayout = new javax.swing.GroupLayout(editOverdueFees);
        editOverdueFees.setLayout(editOverdueFeesLayout);
        editOverdueFeesLayout.setHorizontalGroup(
            editOverdueFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editOverdueFeesLayout.createSequentialGroup()
                .addGroup(editOverdueFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editOverdueFeesLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editOverdueFeesLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel38))
                    .addGroup(editOverdueFeesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(editOverdueFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addGroup(editOverdueFeesLayout.createSequentialGroup()
                                .addGroup(editOverdueFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField7)
                                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addComponent(jLabel40)
                            .addGroup(editOverdueFeesLayout.createSequentialGroup()
                                .addComponent(choice11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel31)))
                        .addGap(143, 143, 143)
                        .addGroup(editOverdueFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        editOverdueFeesLayout.setVerticalGroup(
            editOverdueFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editOverdueFeesLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(editOverdueFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editOverdueFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editOverdueFeesLayout.createSequentialGroup()
                        .addGroup(editOverdueFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(choice11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel40)
                        .addGap(4, 4, 4)
                        .addGroup(editOverdueFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(349, 349, 349))
        );

        parent.add(editOverdueFees, "card3");

        viewBorrowedBooks.setBackground(new java.awt.Color(255, 255, 255));
        viewBorrowedBooks.setPreferredSize(new java.awt.Dimension(1016, 748));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel29.setText("View Borrowed Books");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Borrowed Books: ");

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student name", "Book ID", "Date Borrowed", "Due Date", "Payable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        setheadertoBold(jTable1);
        centerText(jTable1);
        jTable1.setRowHeight(30);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Availbable Books: ");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Total: ");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel21.setText("");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel22.setText("");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel23.setText("");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Search");

        jTextField21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                borrowedBookSearch(jTextField21,jTable1);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Borrow History");
        jButton7.setBorderPainted(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewBorrowedBooksLayout = new javax.swing.GroupLayout(viewBorrowedBooks);
        viewBorrowedBooks.setLayout(viewBorrowedBooksLayout);
        viewBorrowedBooksLayout.setHorizontalGroup(
            viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(viewBorrowedBooksLayout.createSequentialGroup()
                .addGroup(viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(viewBorrowedBooksLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel29)
                        .addGap(220, 220, 220)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(viewBorrowedBooksLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(viewBorrowedBooksLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel6)
                                .addComponent(jLabel16))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel21)
                                .addComponent(jLabel23))
                            .addGap(209, 209, 209)
                            .addGroup(viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        viewBorrowedBooksLayout.setVerticalGroup(
            viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewBorrowedBooksLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewBorrowedBooksLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewBorrowedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23)))
                    .addGroup(viewBorrowedBooksLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addContainerGap())
        );

        parent.add(viewBorrowedBooks, "card3");

        borrowHistory.setBackground(new java.awt.Color(255, 255, 255));
        borrowHistory.setPreferredSize(new java.awt.Dimension(1016, 748));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel64.setText("Borrow History");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel65.setText("Borrowed Books: ");

        jPanel14.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jTable5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Book ID", "Date Borrowed", "Due Date", "Date Returned", "Payable", "Condition returned"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setFocusable(false);
        setheadertoBold(jTable5);
        centerText2(jTable5);
        jTable5.setRowHeight(30);
        jTable5.setRowSelectionAllowed(false);
        jTable5.setShowGrid(true);
        jTable5.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable5.getColumnModel().getColumn(3).setResizable(false);
            jTable5.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable5.getColumnModel().getColumn(4).setResizable(false);
            jTable5.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable5.getColumnModel().getColumn(5).setResizable(false);
            jTable5.getColumnModel().getColumn(5).setPreferredWidth(30);
            jTable5.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel66.setText("Availbable Books: ");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel67.setText("Total: ");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel68.setText("");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel69.setText("");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel70.setText("");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel71.setText("Search");

        jTextField24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                borrowHistorySearch(jTextField24,jTable5);
            }
        });

        jButton25.setBackground(new java.awt.Color(0, 0, 0));
        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Borrowed Books");
        jButton25.setBorderPainted(false);
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton25.setFocusable(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borrowHistoryLayout = new javax.swing.GroupLayout(borrowHistory);
        borrowHistory.setLayout(borrowHistoryLayout);
        borrowHistoryLayout.setHorizontalGroup(
            borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(borrowHistoryLayout.createSequentialGroup()
                .addGroup(borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borrowHistoryLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(borrowHistoryLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel65)
                                .addComponent(jLabel67)
                                .addComponent(jLabel66))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel69)
                                .addComponent(jLabel68)
                                .addComponent(jLabel70))
                            .addGap(209, 209, 209)
                            .addGroup(borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel71)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, borrowHistoryLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        borrowHistoryLayout.setVerticalGroup(
            borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowHistoryLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel64)
                    .addComponent(jButton25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borrowHistoryLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jLabel68))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jLabel65))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(borrowHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jLabel70)))
                    .addGroup(borrowHistoryLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addContainerGap())
        );

        parent.add(borrowHistory, "card3");

        manageAccount.setPreferredSize(new java.awt.Dimension(1016, 768));
        manageAccount.setLayout(new java.awt.CardLayout());

        verification.setBackground(new java.awt.Color(255, 255, 255));
        verification.setPreferredSize(new java.awt.Dimension(1016, 768));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("Enter 6-digit code");

        jTextField16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(51, 0, 0));
        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Get code");
        jButton20.setBorderPainted(false);
        jButton20.setFocusable(false);
        jButton20.setVerifyInputWhenFocusTarget(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(51, 0, 0));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Enter");
        jButton21.setBorderPainted(false);
        jButton21.setFocusable(false);
        jButton21.setVerifyInputWhenFocusTarget(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 0, 0));
        jLabel48.setText("Invalid code!");

        jPanel11.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel57.setText("Verification");

        choice2.insert("Change password",0);
        choice2.insert("Edit information",1);
        choice2.setFocusable(false);
        choice2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        javax.swing.GroupLayout verificationLayout = new javax.swing.GroupLayout(verification);
        verification.setLayout(verificationLayout);
        verificationLayout.setHorizontalGroup(
            verificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verificationLayout.createSequentialGroup()
                .addGroup(verificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(verificationLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel57))
                    .addGroup(verificationLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(verificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48)
                            .addGroup(verificationLayout.createSequentialGroup()
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(verificationLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        verificationLayout.setVerticalGroup(
            verificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verificationLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(verificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(438, Short.MAX_VALUE))
        );

        manageAccount.add(verification, "card2");

        editInformation.setBackground(new java.awt.Color(255, 255, 255));
        editInformation.setPreferredSize(new java.awt.Dimension(1016, 768));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setText("Firstname");

        jTextField18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel54.setText("Lastname");

        jButton19.setBackground(new java.awt.Color(51, 0, 0));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Save");
        jButton19.setBorderPainted(false);
        jButton19.setFocusable(false);
        jButton19.setVerifyInputWhenFocusTarget(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jTextField19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        choice19.insert("Male",1);
        choice19.insert("Female",2);
        choice19.setFocusable(false);
        choice19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel60.setText("Gender");

        jPanel12.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel58.setText("Edit Information");

        jButton22.setBackground(new java.awt.Color(51, 0, 0));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Cancel");
        jButton22.setBorderPainted(false);
        jButton22.setFocusable(false);
        jButton22.setVerifyInputWhenFocusTarget(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editInformationLayout = new javax.swing.GroupLayout(editInformation);
        editInformation.setLayout(editInformationLayout);
        editInformationLayout.setHorizontalGroup(
            editInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editInformationLayout.createSequentialGroup()
                .addGroup(editInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editInformationLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(editInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choice19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58)
                            .addGroup(editInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addComponent(jLabel53)
                                .addGroup(editInformationLayout.createSequentialGroup()
                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel60)
                                .addComponent(jLabel54)
                                .addComponent(jTextField19))))
                    .addGroup(editInformationLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editInformationLayout.setVerticalGroup(
            editInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editInformationLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60)
                .addGap(1, 1, 1)
                .addComponent(choice19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        manageAccount.add(editInformation, "card2");

        inputNewPass.setBackground(new java.awt.Color(255, 255, 255));
        inputNewPass.setFocusable(false);
        inputNewPass.setPreferredSize(new java.awt.Dimension(1016, 768));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setText("New password");

        jTextField17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setText("Confirm new password");

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton18.setBackground(new java.awt.Color(51, 0, 0));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Save");
        jButton18.setBorderPainted(false);
        jButton18.setFocusable(false);
        jButton18.setVerifyInputWhenFocusTarget(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel59.setText("Change Password");

        jButton23.setBackground(new java.awt.Color(51, 0, 0));
        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Cancel");
        jButton23.setBorderPainted(false);
        jButton23.setFocusable(false);
        jButton23.setVerifyInputWhenFocusTarget(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputNewPassLayout = new javax.swing.GroupLayout(inputNewPass);
        inputNewPass.setLayout(inputNewPassLayout);
        inputNewPassLayout.setHorizontalGroup(
            inputNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputNewPassLayout.createSequentialGroup()
                .addGroup(inputNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputNewPassLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(inputNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputNewPassLayout.createSequentialGroup()
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(inputNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel51)
                                .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                                .addComponent(jLabel50))))
                    .addGroup(inputNewPassLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel59))
                    .addGroup(inputNewPassLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputNewPassLayout.setVerticalGroup(
            inputNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputNewPassLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(424, Short.MAX_VALUE))
        );

        manageAccount.add(inputNewPass, "card2");

        parent.add(manageAccount, "card10");

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setPreferredSize(new java.awt.Dimension(1016, 768));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel52.setText("Dashboard");

        jPanel15.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(255, 153, 0));
        jPanel16.setForeground(new java.awt.Color(255, 153, 0));
        jPanel16.setOpaque(false);

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton15.setText("0");
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setFocusable(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 28)); // NOI18N
        jLabel79.setText("Admin accounts");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel79)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel19.setBackground(new java.awt.Color(102, 0, 0));
        jPanel19.setForeground(new java.awt.Color(102, 0, 0));
        jPanel19.setOpaque(false);

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("2");
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setFocusable(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 28)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Staff accounts");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel80)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel20.setBackground(new java.awt.Color(255, 153, 0));
        jPanel20.setForeground(new java.awt.Color(255, 153, 0));
        jPanel20.setOpaque(false);

        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton24.setText("2");
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setFocusable(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 28)); // NOI18N
        jLabel81.setText("User accounts");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel81)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel52))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(402, Short.MAX_VALUE))
        );

        parent.add(dashboard, "card3");

        viewadmin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel55.setText("Admin Account Information");

        jPanel17.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jButton26.setBackground(new java.awt.Color(0, 0, 0));
        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Back");
        jButton26.setBorderPainted(false);
        jButton26.setFocusable(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name", "Gender", "Account Created"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        setheadertoBold(jTable2);
        centerText3(jTable2);
        jTable2.setRowHeight(30);
        jTable2.setShowGrid(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        javax.swing.GroupLayout viewadminLayout = new javax.swing.GroupLayout(viewadmin);
        viewadmin.setLayout(viewadminLayout);
        viewadminLayout.setHorizontalGroup(
            viewadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewadminLayout.createSequentialGroup()
                .addGroup(viewadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewadminLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel55))
                    .addGroup(viewadminLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewadminLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        viewadminLayout.setVerticalGroup(
            viewadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewadminLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
        );

        parent.add(viewadmin, "card10");

        viewstaff.setBackground(new java.awt.Color(255, 255, 255));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel61.setText("Staff Account Information");

        jPanel18.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jButton27.setBackground(new java.awt.Color(0, 0, 0));
        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Back");
        jButton27.setBorderPainted(false);
        jButton27.setFocusable(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jTable6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name", "Gender", "Account Created"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setFocusable(false);
        setheadertoBold(jTable6);
        centerText3(jTable6);
        jTable6.setRowHeight(30);
        jTable6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable6.setShowGrid(true);
        jTable6.getTableHeader().setReorderingAllowed(false);
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);
        jTable6.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable6.getColumnModel().getColumn(2).setResizable(false);
            jTable6.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable6.getColumnModel().getColumn(3).setResizable(false);
            jTable6.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        javax.swing.GroupLayout viewstaffLayout = new javax.swing.GroupLayout(viewstaff);
        viewstaff.setLayout(viewstaffLayout);
        viewstaffLayout.setHorizontalGroup(
            viewstaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewstaffLayout.createSequentialGroup()
                .addGroup(viewstaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewstaffLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel61))
                    .addGroup(viewstaffLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewstaffLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(jScrollPane6)
        );
        viewstaffLayout.setVerticalGroup(
            viewstaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewstaffLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
        );

        parent.add(viewstaff, "card10");

        viewuser.setBackground(new java.awt.Color(255, 255, 255));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel62.setText("User Account Information");

        jPanel21.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jButton28.setBackground(new java.awt.Color(0, 0, 0));
        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Back");
        jButton28.setBorderPainted(false);
        jButton28.setFocusable(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jTable7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Email", "Account Created", "Cash Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setFocusable(false);
        setheadertoBold(jTable7);
        centerText4(jTable7);
        jTable7.setRowHeight(30);
        jTable7.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable7.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable7.setShowGrid(true);
        jTable7.getTableHeader().setReorderingAllowed(false);
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);
        jTable7.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setResizable(false);
            jTable7.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable7.getColumnModel().getColumn(2).setResizable(false);
            jTable7.getColumnModel().getColumn(2).setPreferredWidth(170);
            jTable7.getColumnModel().getColumn(3).setResizable(false);
            jTable7.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable7.getColumnModel().getColumn(4).setResizable(false);
            jTable7.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        javax.swing.GroupLayout viewuserLayout = new javax.swing.GroupLayout(viewuser);
        viewuser.setLayout(viewuserLayout);
        viewuserLayout.setHorizontalGroup(
            viewuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewuserLayout.createSequentialGroup()
                .addGroup(viewuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewuserLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel62))
                    .addGroup(viewuserLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewuserLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(jScrollPane7)
        );
        viewuserLayout.setVerticalGroup(
            viewuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewuserLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
        );

        parent.add(viewuser, "card10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        changepanel(editbookinfo,input);
        changepanel(parent,editbookinfo);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField8.setText("");
        jTextField23.setText("");
        unlistBookSearchMethod("",jTable3);
        changepanel(parent,unlistBook);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField7.setText("");
        choice11.select(0);
        changepanel(parent,editOverdueFees);
        currentSetting(jTable4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Wanna close the program?","Exit",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int[] data = new int[3];
        getData(data);
        setText(jLabel21,jLabel22,jLabel23,data);
        jTextField21.setText("");
        showInTable(jTable1);
        changepanel(parent,viewBorrowedBooks);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton15.setText(getAdminInfo(jTable2)); 
        jButton16.setText(getStaffInfo(jTable6)); 
        jButton24.setText(getUserInfo(jTable7)); 
        changepanel(parent,dashboard);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        erase(jTextField16,jTextField17,jPasswordField2);
        jLabel48.setVisible(false);
        jButton20.setText("Get code");
        changepanel(parent,manageAccount);
        changepanel(manageAccount,verification);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        erase(jTextField1,jTextField2,jTextField5,jTextField6,jTextField15,choice1,choice3);
        changepanel(parent,listBook);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField15.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Make sure there's no empty boxes","Error",JOptionPane.ERROR_MESSAGE);
        }
        else {
            if(JOptionPane.showConfirmDialog(null,"List book?","Confirmation",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null,"Book listed","Saved",JOptionPane.INFORMATION_MESSAGE);
                addBookInfoSqlClass run = new addBookInfoSqlClass();
                run.listBook(jTextField1.getText(),jTextField2.getText(),jTextField5.getText(),jTextField6.getText(),jTextField15.getText(),choice1.getItem(choice1.getSelectedIndex()),Integer.parseInt(choice3.getItem(choice3.getSelectedIndex())));
                erase(jTextField1,jTextField2,jTextField5,jTextField6,jTextField15,choice1,choice3);
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Save changes?","Confirmation",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            editBookInfoSqlClass run = new editBookInfoSqlClass();
            String base = ((JTextField)jComboBox1.getEditor().getEditorComponent()).getText();
            run.saveInfo(base,jTextField3.getText(),jTextField4.getText(),jTextField11.getText(),jTextField12.getText(),jTextField20.getText());
            jComboBox1.getEditor().setItem("");
            changepanel(editbookinfo,input);
            JOptionPane.showMessageDialog(null,"Saved","Saved",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        editBookInfoSqlClass myObj = new editBookInfoSqlClass();
        String bookname = ((JTextField)jComboBox1.getEditor().getEditorComponent()).getText();
        String[] arr = new String[4];
        
        if(myObj.getdata(bookname,arr)) {
            changepanel(editbookinfo,editBookInformation);
            jTextField3.setText(bookname);
            jTextField4.setText(arr[0]);
            jTextField11.setText(arr[1]);
            jTextField12.setText(arr[2]);
            jTextField20.setText(arr[3]);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        unlistBookSqlClass run = new unlistBookSqlClass();
        String stringBookID = jTextField8.getText();
        String bookname = jTextField23.getText();
        
        if(stringBookID.equals("") || bookname.equals("")) {
            JOptionPane.showMessageDialog(null,"Book not found!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                int bookID = Integer.parseInt(stringBookID);
                if(run.searchBook(bookID,bookname)) {
                    if(JOptionPane.showConfirmDialog(null,"Remove this book to the list?","Confirmation",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                        run.removeBook(bookID,bookname);
                        JOptionPane.showMessageDialog(null,"The book is removed from the list","Removed",JOptionPane.INFORMATION_MESSAGE);
                        unlistBookSearchMethod(jTextField23,jTable3);
                        jTextField8.setText("");    
                        jTextField23.setText("");
                    }
                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null,"Book not found!","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String stringRate = jTextField7.getText();
        
        if(stringRate.equals("")) {
            JOptionPane.showMessageDialog(null,"Invalid input","Error",JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                int day = Integer.parseInt(choice11.getItem(choice11.getSelectedIndex()));
                double rate = Double.parseDouble(stringRate);
                if(JOptionPane.showConfirmDialog(null,"Save changes?","Confirmation",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    overdueFees run = new overdueFees();
                    run.update(day,rate);
                    currentSetting(jTable4);
                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null,"Invalid input","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String newPass = jTextField17.getText();
        String confirmNewPass = new String(jPasswordField2.getPassword());
        if(!(newPass.equals("") || confirmNewPass.equals(""))) {
            if(newPass.equals(confirmNewPass)) {
                loginClass run = new loginClass();
                run.changepass(USERNAME,confirmNewPass);
                jLabel48.setVisible(false);
                jButton20.setText("Get code");
                erase(jTextField16,jTextField17,jPasswordField2);
                changepanel(manageAccount,verification);
                JOptionPane.showMessageDialog(null,"New password saved","Saved",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Passwords doesn't match!","Error message",JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Make sure there's no empty boxes","Error message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        manageAccountSqlClass run = new manageAccountSqlClass(); 
        String firstname = jTextField18.getText();
        String lastname = jTextField19.getText();
        String gender = choice19.getItem(choice19.getSelectedIndex());
        run.save(USERNAME,firstname,lastname,gender);
        jLabel48.setVisible(false);
        jButton20.setText("Get code");
        erase(jTextField18,jTextField19,jTextField16,choice19);
        changepanel(manageAccount,verification);
        JOptionPane.showMessageDialog(null,"Saved","Saved",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        sendCode();
        jButton20.setText("Resend");
        JOptionPane.showMessageDialog(null,"The code was sent to your gmail.","Sent",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        verification();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        changepanel(manageAccount,verification);
        erase(jTextField18,jTextField19,jTextField16,choice19);
        jButton20.setText("Get code");
        jLabel48.setVisible(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        changepanel(manageAccount,verification);
        erase(jTextField16,jTextField17,jPasswordField2);
        jButton20.setText("Get code");
        jLabel48.setVisible(false);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        verification();
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jComboBox1.getEditor().setItem("");
        changepanel(editbookinfo,input);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int[] data = new int[3];
        getData(data);
        jTextField21.setText("");
        borrowhistory(jTable5);
        setText(jLabel68,jLabel69,jLabel70,data);
        changepanel(parent,borrowHistory);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        String BookID = jTable3.getValueAt(jTable3.getSelectedRow(),0).toString();
        jTextField8.setText(BookID);
        fillBookname(Integer.parseInt(BookID),jTextField23);
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        int[] data = new int[3];
        getData(data);
        setText(jLabel21,jLabel22,jLabel23,data);
        jTextField24.setText("");
        showInTable(jTable1);
        changepanel(parent,viewBorrowedBooks);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        getAdminInfo(jTable2);
        changepanel(parent,viewadmin);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        getStaffInfo(jTable6);
        changepanel(parent,viewstaff);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        getUserInfo(jTable7);
        changepanel(parent,viewuser);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        changepanel(parent,dashboard);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        changepanel(parent,dashboard);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        changepanel(parent,dashboard);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        String value = jTable2.getModel().getValueAt(jTable2.getSelectedRow(),0).toString();
        if(JOptionPane.showConfirmDialog(null,"Remove account?","Warning",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if(JOptionPane.showConfirmDialog(null,"Are you sure?","Warning",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                removeAdminAccount(value);
                jButton15.setText(getAdminInfo(jTable2));
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        String value = jTable6.getModel().getValueAt(jTable6.getSelectedRow(),0).toString();
        if(JOptionPane.showConfirmDialog(null,"Remove account?","Warning",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if(JOptionPane.showConfirmDialog(null,"Are you sure?","Warning",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                removeStaffAccount(value);
                jButton16.setText(getStaffInfo(jTable6)); 
            }
        }
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        String value = jTable7.getModel().getValueAt(jTable7.getSelectedRow(),2).toString();
        if(JOptionPane.showConfirmDialog(null,"Remove account?","Warning",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if(JOptionPane.showConfirmDialog(null,"Are you sure?","Warning",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                removeUserAccount(value);
                jButton24.setText(getUserInfo(jTable7)); 
            }
        }
    }//GEN-LAST:event_jTable7MouseClicked

    public void MainInterface() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface(USERNAME).setVisible(true);
            }
        });
    }
    
    private void removeAdminAccount(String a) {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //check if empty
            String cmd = "delete from adminAccountInfo where username = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1, a);
            prestmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Account removed!","removed",JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    private void removeStaffAccount(String a) {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //check if empty
            String cmd = "delete from staffAccountInfo where username = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1, a);
            prestmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Account removed!","removed",JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    private void removeUserAccount(String a) {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //check if empty
            String cmd = "delete from userAccountInfo where username = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1, a);
            prestmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Account removed!","removed",JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    private String getAdminInfo(JTable a) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //get count
            String cmd = "select count(*) from adminAccountInfo";
            prestmt = conn.prepareStatement(cmd);
            result = prestmt.executeQuery();
            result.next();
            int count = result.getInt(1);
            DefaultTableModel table = (DefaultTableModel)a.getModel();
            table.setRowCount(0);
            if(count == 0) {
                return Integer.toString(count);
            }
            //show in tables
            cmd = "select * from adminAccountInfo order by datecreated asc";
            prestmt = conn.prepareStatement(cmd);
            result = prestmt.executeQuery();
            while(result.next()) {
                table.addRow(new Object[]{result.getString("username"),result.getString("firstname")+" "+result.getString("lastname"),result.getString("gender"),result.getString("datecreated")});
            }
            
            return Integer.toString(count);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return "0";
    }
    
    private String getStaffInfo(JTable a) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //get count
            String cmd = "select count(*) from staffAccountInfo";
            prestmt = conn.prepareStatement(cmd);
            result = prestmt.executeQuery();
            result.next();
            int count = result.getInt(1);
            DefaultTableModel table = (DefaultTableModel)a.getModel();
            table.setRowCount(0);
            if(count == 0) {
                return Integer.toString(count);
            }
            //show in tables
            cmd = "select * from staffAccountInfo order by datecreated asc";
            prestmt = conn.prepareStatement(cmd);
            result = prestmt.executeQuery();
            while(result.next()) {
                table.addRow(new Object[]{result.getString("username"),result.getString("firstname")+" "+result.getString("lastname"),result.getString("gender"),result.getString("datecreated")});
            }
            
            return Integer.toString(count);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return "0";
    }
    
    private String getUserInfo(JTable a) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            //get count
            String cmd = "select count(*) from userAccountInfo";
            prestmt = conn.prepareStatement(cmd);
            result = prestmt.executeQuery();
            result.next();
            int count = result.getInt(1);
            DefaultTableModel table = (DefaultTableModel)a.getModel();
            table.setRowCount(0);
            if(count == 0) {
                return Integer.toString(count);
            }
            //show in tables
            cmd = "select * from userAccountInfo order by student_ID asc";
            prestmt = conn.prepareStatement(cmd);
            result = prestmt.executeQuery();
            while(result.next()) {
                table.addRow(new Object[]{result.getInt("student_ID"),result.getString("firstname")+" "+result.getString("lastname"),result.getString("username"),result.getString("datecreated"),result.getDouble("cash_balance")});
            }
            
            return Integer.toString(count);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return "0";
    }
    
    public void verification() {
        loginClass run = new loginClass();
        String strCode = jTextField16.getText();
        int code;
        try {
            code = Integer.parseInt(strCode);
            if(run.compareCode(USERNAME,code)) {
                jButton20.setText("Get code");
                JPanel panel = (choice2.getSelectedIndex()==0) ? inputNewPass:editInformation;
                if(panel == editInformation) {
                    String[] info = new String[3];
                    getInfo(info);
                    jTextField18.setText(info[0]);
                    jTextField19.setText(info[1]);
                    choice19.select(info[2]);
                }
                changepanel(manageAccount,panel);
            }
            else {
                jLabel48.setVisible(true);
            }
        }
        catch(Exception e) {
            jLabel48.setVisible(true);
        }
    }
    
    public void changepanel(JPanel parent,JPanel subpanel) {
        parent.removeAll();
        parent.add(subpanel);
        parent.repaint();
        parent.revalidate();
    }
    
    public void fillBookname(int bookID, JTextField b) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from bookInformation where BookID = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,bookID);
            
            result = prestmt.executeQuery();
            result.next();
            b.setText(result.getString("Book_Name"));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    public void getInfo(String[] arr) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from adminAccountInfo where username = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1,USERNAME);
            
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
    
    public void borrowhistory(JTable a) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from borrowhistory ORDER BY Date_Borrowed desc;";
            prestmt = conn.prepareStatement(cmd);
            DefaultTableModel table = (DefaultTableModel)a.getModel();
            table.setRowCount(0);
            result = prestmt.executeQuery();
            while(result.next()) {
                table.addRow(new Object[]{result.getInt("StudentID"),result.getInt("BookID"),result.getString("Date_Borrowed"),result.getString("Due_Date"),result.getString("Date_Returned"),result.getDouble("Payable"),result.getString("Condition_Returned")});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
     
    public void unlistBookSearchMethod(JTextField a, JTable b) {
        String text = a.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from bookInformation WHERE Book_Name LIKE \""+ text +"%\""+" ORDER BY book_name ASC, book_number asc";
            prestmt = conn.prepareStatement(cmd);

            result = prestmt.executeQuery();
            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            
            while(result.next()) {
                String txt = result.getString("Book_Name");
                String slot1 = "("+result.getInt("Book_Number")+")"+result.getString("Book_Name");
                table.addRow(new Object[]{result.getInt("BookID"),slot1});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        a.setText(text);
    }
    
    private void getData(int[] data) {             
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    private void borrowedBookSearch(JTextField a,JTable b) {
        String text = a.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from borrowedBooks WHERE BookID LIKE \""+ text +"%\" or StudentId LIKE \""+ text +"%\" ORDER BY  Date_Borrowed desc;";
            prestmt = conn.prepareStatement(cmd);

            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            result = prestmt.executeQuery();
            while(result.next()) {
                table.addRow(new Object[]{result.getString("StudentId"),result.getString("Student_Name"),result.getInt("BookID"),result.getString("Date_Borrowed"),result.getString("Due_Date"),result.getInt("Payable")});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        a.setText(text);
    }
    
    private void borrowHistorySearch(JTextField a,JTable b) {
        String text = a.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from borrowhistory WHERE BookID LIKE \""+ text +"%\" or StudentId LIKE \""+ text +"%\" ORDER BY  Date_Borrowed desc";
            prestmt = conn.prepareStatement(cmd);

            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            result = prestmt.executeQuery();
            while(result.next()) {
                table.addRow(new Object[]{result.getInt("StudentID"),result.getInt("BookID"),result.getString("Date_Borrowed"),result.getString("Due_Date"),result.getString("Date_Returned"),result.getDouble("Payable"),result.getString("Condition_Returned")});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        a.setText(text);
    }
    
    private void unlistBookSearchMethod(String a, JTable b) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from bookInformation WHERE Book_Name LIKE \""+ a +"%\""+" ORDER BY book_name ASC, book_number asc";
            prestmt = conn.prepareStatement(cmd);

            result = prestmt.executeQuery();
            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            
            while(result.next()) {
                String txt = result.getString("Book_Name");
                String slot1 = "("+result.getInt("Book_Number")+")"+result.getString("Book_Name");
                table.addRow(new Object[]{result.getInt("BookID"),slot1});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    private void showInTable(JTable a) {
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
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    private void editBookSearchMethod(JComboBox a) {
        String text = ((JTextField)a.getEditor().getEditorComponent()).getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from bookInformation WHERE Book_Name LIKE \""+ text +"%\""+" ORDER BY book_name ASC, book_number asc";
            prestmt = conn.prepareStatement(cmd);

            result = prestmt.executeQuery();
            a.removeAllItems();
            String previousArr = "";
            while(result.next()) {
                String txt = result.getString("Book_Name");
                if(!previousArr.equals(txt)) {
                    a.addItem(txt);
                    previousArr = txt;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        a.setSelectedItem(null);
        a.setPopupVisible(true);
        ((JTextField)a.getEditor().getEditorComponent()).setText(text);
    }
    
    private void currentSetting(JTable b) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from overdueFees where ID = 0";
            prestmt = conn.prepareStatement(cmd);

            result = prestmt.executeQuery();
            result.next();
            
            DefaultTableModel table = (DefaultTableModel)b.getModel();
            table.setRowCount(0);
            int inputDay = result.getInt("Borrow_Period");
            String txt = (inputDay<=1) ? " Day":" Days";
            table.addRow(new Object[]{Integer.toString(inputDay)+txt,Double.toString(result.getDouble("fine_per_day"))+" Pesos"});
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    private void sendCode() {             
        String user = this.USERNAME;
        loginClass run = new loginClass();
        run.setCode(user,"This is your code for verification: ");
    }       
    
    private void centerText(JTable a) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i<6; i++) {
            a.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }
    
    private void centerText2(JTable a) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i<7; i++) {
            a.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }
    
    private void centerText3(JTable a) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i<4; i++) {
            a.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }
    
    private void centerText4(JTable a) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i<5; i++) {
            a.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }
    
    private void setheadertoBold(JTable a) {
        JTableHeader table = a.getTableHeader();
        table.setFont(new java.awt.Font("Segoe UI",Font.BOLD,18));
        
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)a.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        a.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
    }
    
    private void setText(JLabel a,JLabel b,JLabel c,int[] data) {   
        a.setText(Integer.toString(data[0]));
        b.setText(Integer.toString(data[1]));
        c.setText(Integer.toString(data[2]));
    }
    
    private void erase(JTextField a,JTextField b,JTextField c,JTextField d,JTextField e,Choice f,Choice g) {   
        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");
        e.setText("");
        f.select(0);
        g.select(0);
    }
    private void erase(JTextField a,JTextField b,JPasswordField c) {   
        a.setText("");
        b.setText("");
        c.setText("");
    }
    
    private void erase(JTextField a,JTextField b,JTextField c,Choice d) {   
        a.setText("");
        b.setText("");
        c.setText("");
        d.select(0);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borrowHistory;
    private java.awt.Choice choice1;
    private java.awt.Choice choice11;
    private java.awt.Choice choice19;
    private java.awt.Choice choice2;
    private java.awt.Choice choice3;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel editBookInformation;
    private javax.swing.JPanel editInformation;
    private javax.swing.JPanel editOverdueFees;
    private javax.swing.JPanel editbookinfo;
    private javax.swing.JPanel input;
    private javax.swing.JPanel inputNewPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel listBook;
    private javax.swing.JPanel manageAccount;
    private javax.swing.JPanel parent;
    private javax.swing.JPanel unlistBook;
    private javax.swing.JPanel verification;
    private javax.swing.JPanel viewBorrowedBooks;
    private javax.swing.JPanel viewadmin;
    private javax.swing.JPanel viewstaff;
    private javax.swing.JPanel viewuser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
class RoundedPanel extends JPanel {

    private Color backgroundColor;
    private int cornerRadius = 15;

    public RoundedPanel(LayoutManager layout, int radius) {
        super(layout);
        cornerRadius = radius;
    }

    public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
        super(layout);
        cornerRadius = radius;
        backgroundColor = bgColor;
    }

    public RoundedPanel(int radius) {
        super();
        cornerRadius = radius;
    }

    public RoundedPanel(int radius, Color bgColor) {
        super();
        cornerRadius = radius;
        backgroundColor = bgColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Draws the rounded panel with borders.
        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
        } else {
            graphics.setColor(getBackground());
        }
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint border
    }
}