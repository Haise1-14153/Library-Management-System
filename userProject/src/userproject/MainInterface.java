package userproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainInterface extends javax.swing.JFrame implements ActionListener {

    String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    Connection conn = null;
    PreparedStatement prestmt = null;
    ResultSet result = null;
    String[] name = new String[2];
    String USERNAME;
    int id;
    int[] date = new int[3];
    
    MySqlClasses run = new MySqlClasses();

    public MainInterface(String email,String[] name,int id) {
        this.USERNAME = email;
        this.id = id;
        this.name[0] = name[0];
        this.name[1] = name[1];
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

        Buttons = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel("",SwingConstants.CENTER);
        jButton7 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        parent = new javax.swing.JPanel();
        browseBook = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();
        choice3 = new java.awt.Choice();
        jLabel7 = new javax.swing.JLabel();
        bookreservation = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        viewreservation = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        manageAccount = new javax.swing.JPanel();
        verification = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        choice2 = new java.awt.Choice();
        editInformation = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jTextField19 = new javax.swing.JTextField();
        choice19 = new java.awt.Choice();
        jLabel60 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        inputNewPass = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton18 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        dashboard = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rateBook = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Buttons.setBackground(new java.awt.Color(102, 0, 0));
        Buttons.setPreferredSize(new java.awt.Dimension(270, 768));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Browse Book ");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Book Reservation");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Dashboard");
        jButton4.setBorderPainted(false);
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
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(name[0]+" "+name[1]);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Manage Account");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 153, 0));
        jLabel43.setText(month[date[1]]+" "+date[2]+" "+date[0]);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Notification");
        run.notification(jButton8,USERNAME);
        jButton8.setBorderPainted(false);
        jButton8.setVerifyInputWhenFocusTarget(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/picture.png"))); // NOI18N

        javax.swing.GroupLayout ButtonsLayout = new javax.swing.GroupLayout(Buttons);
        Buttons.setLayout(ButtonsLayout);
        ButtonsLayout.setHorizontalGroup(
            ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsLayout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(ButtonsLayout.createSequentialGroup()
                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ButtonsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43))
                    .addGroup(ButtonsLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2))
                    .addGroup(ButtonsLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonsLayout.setVerticalGroup(
            ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel43)
                .addContainerGap())
        );

        parent.setPreferredSize(new java.awt.Dimension(973, 768));
        parent.setRequestFocusEnabled(false);
        parent.setLayout(new java.awt.CardLayout());

        browseBook.setBackground(new java.awt.Color(255, 255, 255));
        browseBook.setPreferredSize(new java.awt.Dimension(1016, 748));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel29.setText("Browse Books");

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
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
        jTable1.setFocusable(false);
        jTable1.setRowHeight(30);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        run.setheadertoBold(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                int selectedItem = (choice1.getSelectedIndex()==0) ? 0:1;
                run.SearchMethod(jTextField1,jTable1,selectedItem,choice3.getSelectedItem());
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Search Bar");

        choice1.setFocusable(false);
        choice1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        choice1.insert("available",1);
        choice1.insert("unavailable",2);
        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });

        choice3.setFocusable(false);
        choice3.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        run.category(choice3);
        choice3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice3ItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Category");

        javax.swing.GroupLayout browseBookLayout = new javax.swing.GroupLayout(browseBook);
        browseBook.setLayout(browseBookLayout);
        browseBookLayout.setHorizontalGroup(
            browseBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(browseBookLayout.createSequentialGroup()
                .addGroup(browseBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(browseBookLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel29))
                    .addGroup(browseBookLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(browseBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, browseBookLayout.createSequentialGroup()
                                .addGroup(browseBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(browseBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(browseBookLayout.createSequentialGroup()
                                        .addComponent(choice3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        browseBookLayout.setVerticalGroup(
            browseBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(browseBookLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(browseBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(browseBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(choice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(choice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        run.SearchMethod(jTable1,0,"All");

        parent.add(browseBook, "card3");

        bookreservation.setBackground(new java.awt.Color(255, 255, 255));
        bookreservation.setPreferredSize(new java.awt.Dimension(1016, 748));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel30.setText("Book Reservation");

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book name", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCellSelectionEnabled(false);
        run.centerText2(jTable2);
        run.setheadertoBold(jTable2);
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
            jTable2.getColumnModel().getColumn(0).setMinWidth(100);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setMinWidth(100);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                run.SearchMethod(jTextField2,jTable2,0,"All");
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Search Bar");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View Reservations");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookreservationLayout = new javax.swing.GroupLayout(bookreservation);
        bookreservation.setLayout(bookreservationLayout);
        bookreservationLayout.setHorizontalGroup(
            bookreservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookreservationLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(bookreservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(bookreservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(bookreservationLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookreservationLayout.setVerticalGroup(
            bookreservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookreservationLayout.createSequentialGroup()
                .addGroup(bookreservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookreservationLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookreservationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(26, 26, 26)))
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );

        run.SearchMethod(jTable1,0,"All");

        parent.add(bookreservation, "card3");

        viewreservation.setBackground(new java.awt.Color(255, 255, 255));
        viewreservation.setPreferredSize(new java.awt.Dimension(1016, 748));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel32.setText("View Reservations");

        jPanel9.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book name", "Date reserved"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setFocusable(false);
        run.centerText3(jTable4);
        run.setheadertoBold(jTable4);
        jTable4.setRowHeight(30);
        jTable4.setShowGrid(true);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(100);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setMinWidth(200);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable4.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Book Reservation");
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewreservationLayout = new javax.swing.GroupLayout(viewreservation);
        viewreservation.setLayout(viewreservationLayout);
        viewreservationLayout.setHorizontalGroup(
            viewreservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewreservationLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(viewreservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewreservationLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewreservationLayout.setVerticalGroup(
            viewreservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewreservationLayout.createSequentialGroup()
                .addGroup(viewreservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewreservationLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewreservationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6)
                        .addGap(26, 26, 26)))
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        run.SearchMethod(jTable1,0,"All");

        parent.add(viewreservation, "card3");

        manageAccount.setPreferredSize(new java.awt.Dimension(1016, 748));
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
        jButton21.setVerifyInputWhenFocusTarget(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 0, 0));
        jLabel48.setText("Invalid code!");

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

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel57.setText("Verification");

        choice2.insert("Change password",0);
        choice2.insert("Edit information",1);
        choice2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        javax.swing.GroupLayout verificationLayout = new javax.swing.GroupLayout(verification);
        verification.setLayout(verificationLayout);
        verificationLayout.setHorizontalGroup(
            verificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verificationLayout.createSequentialGroup()
                .addGroup(verificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(verificationLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
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
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        verificationLayout.setVerticalGroup(
            verificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verificationLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(503, Short.MAX_VALUE))
        );

        manageAccount.add(verification, "card2");

        editInformation.setBackground(new java.awt.Color(255, 255, 255));
        editInformation.setPreferredSize(new java.awt.Dimension(1016, 768));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setText("Firstname");

        jTextField18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel54.setText("Lastname");

        jButton22.setBackground(new java.awt.Color(51, 0, 0));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Save");
        jButton22.setBorderPainted(false);
        jButton22.setVerifyInputWhenFocusTarget(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jTextField19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        choice19.insert("Male",1);
        choice19.insert("Female",2);
        choice19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel60.setText("Gender");

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

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel58.setText("Edit Information");

        jButton23.setBackground(new java.awt.Color(51, 0, 0));
        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Cancel");
        jButton23.setBorderPainted(false);
        jButton23.setVerifyInputWhenFocusTarget(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
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
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel60)
                                .addComponent(jLabel54)
                                .addComponent(jTextField19))))
                    .addGroup(editInformationLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editInformationLayout.setVerticalGroup(
            editInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editInformationLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(430, Short.MAX_VALUE))
        );

        manageAccount.add(editInformation, "card2");

        inputNewPass.setBackground(new java.awt.Color(255, 255, 255));
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
        jButton18.setVerifyInputWhenFocusTarget(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel59.setText("Change Password");

        jButton24.setBackground(new java.awt.Color(51, 0, 0));
        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Cancel");
        jButton24.setBorderPainted(false);
        jButton24.setVerifyInputWhenFocusTarget(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
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
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputNewPassLayout.setVerticalGroup(
            inputNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputNewPassLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(489, Short.MAX_VALUE))
        );

        manageAccount.add(inputNewPass, "card2");

        parent.add(manageAccount, "card10");

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setPreferredSize(new java.awt.Dimension(1016, 748));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel31.setText("Dashboard");

        jPanel8.setBackground(new java.awt.Color(102, 0, 0));

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

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book name", "Date borrowed", "Due date", "Payable"
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
        run.centerText1(jTable3);
        run.setheadertoBold(jTable3);
        jTable3.setRowHeight(30);
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setShowGrid(true);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        jTable3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(100);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable3.getColumnModel().getColumn(2).setMinWidth(150);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(2).setMaxWidth(150);
            jTable3.getColumnModel().getColumn(3).setMinWidth(150);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable3.getColumnModel().getColumn(4).setMinWidth(100);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Cash Balance");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Borrowed books");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel31))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3))
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );

        run.SearchMethod(jTable1,0,"All");

        parent.add(dashboard, "card3");

        rateBook.setBackground(new java.awt.Color(255, 255, 255));
        rateBook.setPreferredSize(new java.awt.Dimension(1016, 748));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel33.setText("Rate book");

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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Bookname: ");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel10.setText("/ 5.0");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Rating");

        jButton25.setBackground(new java.awt.Color(51, 0, 0));
        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Enter");
        jButton25.setBorderPainted(false);
        jButton25.setVerifyInputWhenFocusTarget(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(51, 0, 0));
        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Cancel");
        jButton26.setBorderPainted(false);
        jButton26.setVerifyInputWhenFocusTarget(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rateBookLayout = new javax.swing.GroupLayout(rateBook);
        rateBook.setLayout(rateBookLayout);
        rateBookLayout.setHorizontalGroup(
            rateBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rateBookLayout.createSequentialGroup()
                .addGroup(rateBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rateBookLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel33))
                    .addGroup(rateBookLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(rateBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rateBookLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(rateBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(rateBookLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel9)
                                    .addGroup(rateBookLayout.createSequentialGroup()
                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        rateBookLayout.setVerticalGroup(
            rateBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rateBookLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rateBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rateBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(507, 507, 507))
        );

        run.SearchMethod(jTable1,0,"All");

        parent.add(rateBook, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Wanna close the program?", "Exit", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        run.notification(jButton8,USERNAME);
        jTextField1.setText("");
        choice3.select(0);
        int selectedItem = (choice1.getSelectedIndex()==0) ? 0:1;
        run.SearchMethod(jTextField1,jTable1,selectedItem,choice3.getSelectedItem());
        changepanel(parent, browseBook);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        verification();
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        sendCode();
        jButton20.setText("Resend");
        JOptionPane.showMessageDialog(null,"The code was sent to your gmail.","Sent",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        verification();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        manageAccountSqlClass run = new manageAccountSqlClass();
        String firstname = jTextField18.getText();
        String lastname = jTextField19.getText();
        String gender = choice19.getItem(choice19.getSelectedIndex());
        run.save(USERNAME,firstname,lastname,gender);
        jLabel48.setVisible(false);
        jButton20.setText("Get code");
        erase(jTextField18,jTextField19,jTextField16,choice19);
        changepanel(manageAccount,verification);
        setText();
        JOptionPane.showMessageDialog(null,"Saved","Saved",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        changepanel(manageAccount,verification);
        erase(jTextField18,jTextField19,jTextField16,choice19);
        jButton20.setText("Get code");
        jLabel48.setVisible(false);
    }//GEN-LAST:event_jButton23ActionPerformed

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

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        changepanel(manageAccount,verification);
        erase(jTextField16,jTextField17,jPasswordField2);
        jButton20.setText("Get code");
        jLabel48.setVisible(false);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice1ItemStateChanged
        int selectedItem = (choice1.getSelectedIndex()==0) ? 0:1;
        String choice = choice3.getSelectedItem();
        run.SearchMethod(jTable1,selectedItem,choice);
    }//GEN-LAST:event_choice1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        run.SearchMethod(jTextField2,jTable2,0,"All");
        run.notification(jButton8,USERNAME);
        changepanel(parent,bookreservation);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Open Gmail?", "Redirect", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {
                JOptionPane.showMessageDialog(null,"View the message at\n"+USERNAME,"note",JOptionPane.INFORMATION_MESSAGE);
                Desktop.getDesktop().browse(new URL("https://mail.google.com/mail/u/0/#inbox").toURI());
                run.removenotification(jButton8,USERNAME);
            }
            catch (IOException | URISyntaxException e) { }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        run.notification(jButton8,USERNAME);
        run.getCashBalance(jLabel5,USERNAME);
        run.getBorrowedBooks(jTable3,id);
        changepanel(parent,dashboard);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        run.notification(jButton8,USERNAME);
        erase(jTextField16,jTextField17,jPasswordField2);
        jLabel48.setVisible(false);
        jButton20.setText("Get code");
        changepanel(parent,manageAccount);
        changepanel(manageAccount,verification);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        run.viewreservedbook(jTable4,id);
        changepanel(parent,viewreservation);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        run.SearchMethod(jTextField2,jTable2,0,"All");
        changepanel(parent,bookreservation);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        if (JOptionPane.showConfirmDialog(null, "Cancel reservation?", "confirmation", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            int bookid = Integer.parseInt(jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 0).toString());
            run.cancelreservation(id,bookid);
            run.viewreservedbook(jTable4,id);
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void choice3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice3ItemStateChanged
        int selectedItem = (choice1.getSelectedIndex()==0) ? 0:1;
        String choice = choice3.getSelectedItem();
        run.SearchMethod(jTable1,selectedItem,choice);
    }//GEN-LAST:event_choice3ItemStateChanged

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int bookid = Integer.parseInt(jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 0).toString());
        String bookname = run.getbookName(bookid);
        bookname = (bookname.length() > 60) ? bookname.substring(0,60)+"..." : bookname;
        if(run.checkIfRated(USERNAME, bookname)) {
            jLabel9.setText("Bookname: "+bookname);
            changepanel(parent,rateBook);
        }
        else {
            JOptionPane.showMessageDialog(null,"You already rate the book","Error message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        try {
            double input = Double.parseDouble(jTextField3.getText());
            if(input >= 0 && input <= 5) {
                if (JOptionPane.showConfirmDialog(null, "Rate book?", "confirmation", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    int bookid = Integer.parseInt(jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 0).toString());
                    run.rateBook(input,bookid,USERNAME);
                    jTextField3.setText("");
                    changepanel(parent,dashboard);
                    JOptionPane.showMessageDialog(null,"Book rated","Done",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Rate must be 0.0 - 5.0","Error message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Invalid input","Error message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jTextField3.setText("");
        changepanel(parent,dashboard);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        if (JOptionPane.showConfirmDialog(null, "Reserve book?", "confirmation", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            String datetoday = month[date[1]]+" "+date[2]+" "+date[0];
            String Studname = name[0]+" "+name[1];
            int bookid = Integer.parseInt(jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0).toString());
            if(run.checkduplicate(id,bookid)) {
                run.reservebook(bookid,id,Studname,datetoday);
            }
            else {
                JOptionPane.showMessageDialog(null,"You already reserve this book","Error message",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

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
                new MainInterface(USERNAME,name,id).setVisible(true);
            }
        });
    }
    
    private void sendCode() {             
        String user = this.USERNAME;
        loginClass run = new loginClass();
        run.setCode(user,"This is your code for verification: ");
    } 
    
    private void setText() {   
        String[] info = new String[3];
        getInfo(info);
        jLabel1.setText(info[0]+" "+info[1]);
    }
    
    private void erase(JTextField a,JTextField b,Choice c,Choice d) {   
        a.setText("");
        b.setText("");
        c.select(0);
        d.select(0);
    }
    
    private void changepanel(JPanel parent, JPanel subpanel) {
        parent.removeAll();
        parent.add(subpanel);
        parent.repaint();
        parent.revalidate();
    }
    
    private void erase(JTextField a,JTextField b) {   
        a.setText("");
        b.setText("");
    }
    
    private void erase(JComboBox a,JTextField b) {   
        ((JTextField)a.getEditor().getEditorComponent()).setText("");
        b.setText("");
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
    
    private void getInfo(String[] arr) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from staffaccountinfo where username = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setString(1,USERNAME);
            
            result = prestmt.executeQuery();
            result.next();
            arr[0] = result.getString("firstname");
            arr[1] = result.getString("lastname");
            arr[2] = result.getString("gender");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
    }
    
    private String getEmail(int ID) {  
        String email;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindatabase","root","root");
            String cmd = "select * from userAccountinfo where student_ID = ?";
            prestmt = conn.prepareStatement(cmd);
            prestmt.setInt(1,ID);
            
            result = prestmt.executeQuery();
            result.next();
            email = result.getString("username");
            return email;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closemySQL();
        }
        return "0";
    } 
    
    private void verification() {
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
    
    private void closemySQL() {
        if (result != null) {
            try {
                result.close();
            } catch (SQLException sqlEx) {
            }
            result = null;
        }
        if (prestmt != null) {
            try {
                prestmt.close();
            } catch (SQLException sqlEx) {
            }
            prestmt = null;
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException sqlEx) {
            }
            conn = null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buttons;
    private javax.swing.JPanel bookreservation;
    private javax.swing.JPanel browseBook;
    private java.awt.Choice choice1;
    private java.awt.Choice choice19;
    private java.awt.Choice choice2;
    private java.awt.Choice choice3;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel editInformation;
    private javax.swing.JPanel inputNewPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel manageAccount;
    private javax.swing.JPanel parent;
    private javax.swing.JPanel rateBook;
    private javax.swing.JPanel verification;
    private javax.swing.JPanel viewreservation;
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
