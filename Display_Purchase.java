import java.io.*;
import javax.swing.*;
import java.awt.*;
public class Display_Purchase extends javax.swing.JFrame {

    public Display_Purchase() {
        initComponents();
    }
    private void initComponents() {
        jTextField11 = new   JTextField();
        jButton14 = new  JButton();
        jButton15 = new   JButton();
        jTextField12 = new   JTextField();
        jTextField13 = new   JTextField();
        jButton16 = new   JButton();
        jButton17 = new   JButton();
        jButton3 = new   JButton();
        jButton4 = new   JButton();
        jTextField1 = new   JTextField();
        jTextField2 = new   JTextField();
        jButton18 = new   JButton();
        jLabel6 = new   JLabel();
        jPanel5 = new   JPanel();
        jTextField6 = new   JTextField();
        jButton9 = new   JButton();
        jButton10 = new   JButton();
        jButton11 = new   JButton();
        jTextField7 = new   JTextField();
        jTextField8 = new   JTextField();
        jTextField9 = new   JTextField();
        jButton1 = new   JButton();
        jLabel4 = new   JLabel();
        jToggleButton1 = new   JToggleButton();
        jPanel1 = new   JPanel();
        jScrollPane1 = new   JScrollPane();
        jTable1 = new   JTable();
        jButton2 = new   JButton();
        jTabbedPane1 = new   JTabbedPane();
        jPanel2 = new   JPanel();
        jLabel1 = new   JLabel();
        jLabel2 = new   JLabel();
        jLabel3 = new   JLabel();
        jTextField3 = new   JTextField();
        jTextField4 = new   JTextField();
        jTextField5 = new   JTextField();
        jButton5 = new   JButton();
        jButton6 = new   JButton();
        jButton7 = new   JButton();
        jTextField14 = new   JTextField();
        jLabel7 = new   JLabel();
        jPanel4 = new   JPanel();
        jScrollPane2 = new   JScrollPane();
        jTable2 = new   JTable();
        jButton12 = new   JButton();
        jButton13 = new   JButton();
        jTextField10 = new   JTextField();

        jLabel5 = new   JLabel();
        jButton8 = new   JButton();

        jButton1.setText("jButton1");

        jLabel4.setText("jLabel4");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(  WindowConstants.EXIT_ON_CLOSE);
        setTitle("Display Main Menu");

        jPanel1.setBackground(new   Color(51, 51, 51));
        jPanel1.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(0, 100, 100)));
        jTable1.setBackground(new   Color(204, 204, 204));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(0, 100, 100)));
        jTable1.setForeground(null);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [100][4],
                new String [] {
                        "Index No.", "Item", "Qty.", "Unit Price"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
        }


        jTabbedPane1.setBackground(new java.awt.Color(51, 153, 255));
        jTabbedPane1.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 220, 255)));
        jTabbedPane1.setForeground(new   Color(51, 190, 255));
        jTabbedPane1.setTabPlacement(  JTabbedPane.LEFT);

        jPanel2.setBackground(new   Color(204, 204, 204));

        jLabel1.setBackground(new   Color(51, 51, 51));
        jLabel1.setFont(new   Font("Arial", 1, 14));
        jLabel1.setForeground(null);
        jLabel1.setText("Item");
        jLabel1.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(255, 255, 255), new   Color(51, 173, 255)));

        jButton6.setFont(new   Font("Arial", 1, 14));
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent  event) {
                jButton6ActionPerformed(event);
            }
        });

        jButton7.setBackground(new   Color(51, 51, 51));
        jButton7.setFont(new   Font("Arial", 1, 14));
        jButton7.setForeground(null);
        jButton7.setText("Clear");
        jButton7.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 153, 255)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jButton7ActionPerformed( event);
            }
        });

        jTextField14.setBackground(new   Color(255, 255, 255));
        jTextField14.setForeground(null);
        jTextField14.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 173, 255)));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField14ActionPerformed( event);
            }
        });

        jLabel7.setBackground(new   Color(255, 255, 255));
        jLabel7.setFont(new   Font("Arial", 1, 14));
        jLabel7.setForeground(null);
        jLabel7.setText("Item");
        jLabel7.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 173, 255)));

        jLabel2.setBackground(new   Color(51, 51, 51));
        jLabel2.setFont(new   Font("Arial", 1, 14));
        jLabel2.setForeground(null);
        jLabel2.setText("Qty.");
        jLabel2.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 173, 255)));

        jButton2.setBackground(new Color(51, 51, 51));
        jButton2.setFont(new   Font("Arial", 1, 24));
        jButton2.setForeground(null);
        jButton2.setText("Display");
        jButton2.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new   Color(0, 0, 0), new   Color(51, 153, 255), null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jButton2ActionPerformed( event);
            }
        });

        jLabel3.setBackground(new   Color(51, 51, 51));
        jLabel3.setFont(new   Font("Arial", 1, 14));
        jLabel3.setForeground(null);
        jLabel3.setText("Price");
        jLabel3.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 163, 255)));

        jTextField3.setBackground(new Color(255, 255, 255));
        jTextField3.setForeground(null);
        jTextField3.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 173, 255)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField3ActionPerformed( event);
            }
        });

        jButton5.setBackground(new   Color(51, 51, 51));
        jButton5.setFont(new   Font("Arial", 1, 14));
        jButton5.setForeground(null);
        jButton5.setText("Add");
        jButton5.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 153, 255)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jButton5ActionPerformed( event);
            }
        });

        jTextField4.setBackground(new Color(255, 255, 255));
        jTextField4.setForeground(null);
        jTextField4.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 173, 255)));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField4ActionPerformed( event);
            }
        });

        jTextField5.setBackground(new Color(255, 255, 255));
        jTextField5.setForeground(null);
        jTextField5.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 173, 255)));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField5ActionPerformed( event);
            }
        });

        jTabbedPane1.addTab("Add/Delete", jPanel2);

        jPanel4.setBackground(new Color(204, 204, 204));
        jPanel4.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 190, 255)));
        jPanel4.setForeground(new Color(255, 255, 255));

        jTable2.setBackground(new Color(200, 200, 200));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [100][4],
                new String [] {
                        "Index Num", "Item", "Qty.", "Unit Price"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            Class[] types = new Class [] {
                    Integer.class, String.class, Double.class, Double.class
            };
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                        .addGroup(  GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(25, 26, 27)
                                .addComponent(jLabel7,   GroupLayout.PREFERRED_SIZE, 56,   GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(  LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jTextField14)
                                                .addGap(33, 34, 35)
                                                .addComponent(jButton6)
                                                .addGap(36, 37, 38))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(17, 18, 19)
                                                .addComponent(jTextField4,   GroupLayout.PREFERRED_SIZE, 115,   GroupLayout.PREFERRED_SIZE)
                                                .addGap(236, 237, 238))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGroup(jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(17, 18, 19)
                                                                .addComponent(jTextField5,   GroupLayout.PREFERRED_SIZE, 115,   GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(jButton5,   GroupLayout.PREFERRED_SIZE, 55,   GroupLayout.PREFERRED_SIZE)
                                                                .addGap(55, 55, 55)
                                                                .addComponent(jButton7,   GroupLayout.PREFERRED_SIZE, 55,   GroupLayout.PREFERRED_SIZE)))
                                                .addGap(115, 115, 115))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(15, 15, 15)
                                                .addComponent(jTextField3,   GroupLayout.PREFERRED_SIZE, 270,   GroupLayout.PREFERRED_SIZE)
                                                .addGap(85, 85, 85))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField5,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton5)
                                        .addComponent(jButton7))
                                .addContainerGap(166, Short.MAX_VALUE))
                        .addGroup(  GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jTextField14,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6))
                                .addGap(86, 86, 86))
        );

        jButton12.setText("No. of items");

        jButton13.setText("Cash");

        jTextField10.setEditable(false);
        jTextField10.setBackground(new   Color(51, 51, 51));
        jTextField10.setForeground(new   Color(255, 255, 255));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField10ActionPerformed( event);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setBackground(new   Color(51, 51, 51));
        jTextField11.setForeground(new   Color(255, 255, 255));

        jButton14.setText("Total Price");

        jButton15.setText("Change");

        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jButton17.setFont(new   Font("Arial", 1, 18));
        jButton17.setText("Clear");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jButton17ActionPerformed( event);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setBackground(new   Color(51, 51, 51));
        jTextField12.setForeground(new   Color(255, 255, 255));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField12ActionPerformed( event);
            }
        });

        jTextField13.setEditable(false);
        jTextField13.setBackground(new   Color(51, 51, 51));
        jTextField13.setForeground(new   Color(255, 255, 255));

        jButton16.setFont(new   Font("Arial", 1, 18));
        jButton16.setText("Pay");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jButton16ActionPerformed( event);
            }
        });

        jButton3.setBackground(new   Color(51, 153, 255));
        jButton3.setFont(new   Font("Arial", 1, 10));
        jButton3.setForeground(new   Color(255, 255, 255));
        jButton3.setText("Index No.");
        jButton3.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 153, 255)));

        jButton4.setBackground(new   Color(51, 153, 255));
        jButton4.setFont(new   Font("Arial", 1, 12));
        jButton4.setForeground(new   Color(255, 255, 255));
        jButton4.setText("Qty.");

        jTextField1.setBackground(new   Color(51, 51, 51));
        jTextField1.setForeground(new   Color(255, 255, 255));
        jTextField1.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 173, 255)));

        jTextField2.setBackground(new   Color(51, 51, 51));
        jTextField2.setForeground(new   Color(255, 255, 255));
        jTextField2.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 173, 255)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField2ActionPerformed( event);
            }
        });

        jButton18.setBackground(new   Color(51, 153, 255));
        jButton18.setFont(new   Font("Arial", 1, 24));
        jButton18.setForeground(new   Color(255, 255, 255));
        jButton18.setText("Purchase");
        jButton18.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 153, 255)));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jButton18ActionPerformed( event);
            }
        });

        jLabel6.setFont(new   Font("Arial", 1, 24));
        jLabel6.setText("Item(s) Purchased");

        GroupLayout jPanel4Layout = new   GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(jButton16)
                                                .addGap(119, 119, 119)
                                                .addComponent(jButton17))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton13,   GroupLayout.PREFERRED_SIZE, 91,   GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton12))
                                                .addPreferredGap(  LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField11,   GroupLayout.PREFERRED_SIZE, 73,   GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField10,   GroupLayout.PREFERRED_SIZE, 73,   GroupLayout.PREFERRED_SIZE))
                                                .addGap(39, 39, 39)
                                                .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jButton14)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField12,   GroupLayout.PREFERRED_SIZE, 94,   GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jButton15,   GroupLayout.PREFERRED_SIZE, 83,   GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField13,   GroupLayout.PREFERRED_SIZE, 94,   GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(jButton3)
                                                .addPreferredGap(  LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField1,   GroupLayout.PREFERRED_SIZE, 81,   GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(jButton4,   GroupLayout.PREFERRED_SIZE, 81,   GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jTextField2,   GroupLayout.PREFERRED_SIZE, 81,   GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(178, 178, 178)
                                                .addComponent(jButton18,   GroupLayout.PREFERRED_SIZE, 142,   GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(  GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                                        .addGroup(  GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel6,   GroupLayout.PREFERRED_SIZE, 255,   GroupLayout.PREFERRED_SIZE)
                                                .addGap(118, 118, 118))
                                        .addGroup(  GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jScrollPane2,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                        .addGroup(  GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton3)
                                                                .addComponent(jButton4))
                                                        .addComponent(jTextField1,   GroupLayout.Alignment.TRAILING,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(  LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton18,   GroupLayout.PREFERRED_SIZE, 40,   GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jTextField2,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6,   GroupLayout.DEFAULT_SIZE,   GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(  LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2,   GroupLayout.PREFERRED_SIZE, 171,   GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField10,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton12)
                                        .addComponent(jButton14)
                                        .addComponent(jTextField12,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton13)
                                        .addComponent(jTextField11,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton15)
                                        .addComponent(jTextField13,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton16)
                                        .addComponent(jButton17))
                                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab(" Purchase", jPanel4);

        jPanel5.setBackground(new   Color(204, 204, 204));
        jPanel5.setBorder(  BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new   Color(0, 0, 0), new   Color(51, 173, 255)));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField6ActionPerformed( event);
            }
        });

        jButton9.setText("Change Item Name");

        jButton10.setText("Qty.");

        jButton11.setText("Price");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField7ActionPerformed( event);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField8ActionPerformed( event);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(  java.awt.event.ActionEvent  event) {
                jTextField9ActionPerformed( event);
            }
        });

        jLabel5.setText("Item");

        jButton8.setText("Save Changes");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent  event) {
                jButton8ActionPerformed( event);
            }
        });

        GroupLayout jPanel5Layout = new   GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel5Layout.createParallelGroup(  GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel5,   GroupLayout.PREFERRED_SIZE, 42,   GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(  LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField6,   GroupLayout.PREFERRED_SIZE, 259,   GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(  GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton11,   GroupLayout.DEFAULT_SIZE,   GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton10,   GroupLayout.Alignment.TRAILING,   GroupLayout.DEFAULT_SIZE,   GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton9,   GroupLayout.Alignment.TRAILING,   GroupLayout.DEFAULT_SIZE,   GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(  LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField8)
                                                        .addComponent(jTextField9)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jTextField7,   GroupLayout.PREFERRED_SIZE, 208,   GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap(108, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jButton8,   GroupLayout.PREFERRED_SIZE, 154,   GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel5Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField6,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel5Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton9)
                                        .addComponent(jTextField7,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel5Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton10)
                                        .addComponent(jTextField8,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel5Layout.createParallelGroup(  GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton11)
                                        .addComponent(jTextField9,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(jButton8,   GroupLayout.PREFERRED_SIZE, 71,   GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Update", jPanel5);

        GroupLayout jPanel1Layout = new   GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(135, 135, 135)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 185, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1,   GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jTabbedPane1,   GroupLayout.PREFERRED_SIZE, 569,   GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1,   GroupLayout.PREFERRED_SIZE, 265,   GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(jButton2,   GroupLayout.PREFERRED_SIZE, 43,   GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTabbedPane1,   GroupLayout.PREFERRED_SIZE, 485,   GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new   GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1,   GroupLayout.PREFERRED_SIZE,   GroupLayout.DEFAULT_SIZE,   GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(  GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1,   GroupLayout.DEFAULT_SIZE,   GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent  event) {
        // Display Button

        try {
            for (int r = 0; r < 100; r++) { //initializing row
                for (int c = 0; c < 4; c++) { //initializing column
                    jTable1.setValueAt(null, r, c);
                }
            }

            BufferedReader rdfile = new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\Warehouse Management system\\src\\items.txt"));

            String[] item = new String[100];
            String[] temp;

            int x = 0;  //read item
            while ((item[x] = rdfile.readLine()) != null) {
                temp = item[x].split("\t");
                jTable1.setValueAt((1000 + x + 1), x, 0);
                for (int j = 1; j < 4; j++) {
                    jTable1.setValueAt(temp[j - 1], x, j);
                }
                x++;
            }
            rdfile.close();
        } catch (IOException e) {
        }

    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent  event) {
        //Purchase Button

        try {
            BufferedReader rdfile = new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\Warehouse Management system\\src\\items.txt"));
            String[] itemline = new String[100];
            String str;
            double price, total;
            int qty = 0, qty_prv = 0, qty_new = 0;
            boolean found = false, edited = false;
            int idx = (Integer.parseInt(jTextField1.getText())) - 1001;

            for (int x = 0; (str = rdfile.readLine()) != null; x++) {
                itemline[x] = str;
            }
            rdfile.close();

            int r = Row.getRow();
            for (int i = 0; itemline[i] != null; i++) {
                if (idx == i) {
                    found = true;
                    String[] temp = itemline[i].split("\t");
                    qty = Integer.parseInt(jTextField2.getText());
                    qty_prv = Integer.parseInt(temp[1]);
                    if ((qty > qty_prv) && (qty_prv != 0)) {
                        JOptionPane.showMessageDialog(null, "Item Shortage!", "Oops!", JOptionPane.WARNING_MESSAGE);
                    }
                    if (qty_prv == 0) {
                        JOptionPane.showMessageDialog(null, "Out of Stock!", "Oops!", JOptionPane.WARNING_MESSAGE);
                    }
                    if ((qty <= qty_prv) && (qty_prv != 0)) {
                        qty_new = qty_prv - qty;
                        itemline[i] = temp[0] + "\t" + qty_new + "\t" + temp[2];
                        jTable2.setValueAt(qty, r, 0);
                        jTable2.setValueAt(temp[0], r, 1);
                        jTable2.setValueAt(Double.parseDouble(temp[2]), r, 2);
                        price = Double.parseDouble(temp[2]);
                        total = qty * price;
                        jTable2.setValueAt(total, r, 3);
                        r++;
                        edited = true;
                    }
                }

            }

            if (!found) {
                JOptionPane.showMessageDialog(null, jTextField1.getText() + ": Item Not Available!", "Oops!", JOptionPane.ERROR_MESSAGE);
            }
            if (edited) {
                PrintWriter wrfile = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\Warehouse Management system\\src\\items.txt"));
                for (int i = 0; itemline[i] != null; i++) {
                    wrfile.println(itemline[i]);
                }
                jButton16.setEnabled(true);
                wrfile.close();
                Row.setRow();
            }
            jTextField1.setText("");
            jTextField2.setText("");

        } catch (IOException e) {
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input may be invalid!", "Sorry!", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
            jTextField2.setText("");
        }
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent  event) {
        jButton18ActionPerformed( event);
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent  event) {
        //Clear Button(Purchase)

        for (int r = 0; r < 100; r++) //initializing row
        {
            for (int c = 0; c < 4; c++) //initializing column
            {
                jTable2.setValueAt(null, r, c);
            }
        }
        jButton16.setEnabled(true);
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        Row.setRow(0);
        jButton18.setEnabled(true);
    }

    private void jButton16ActionPerformed(java.awt.event.ActionEvent  event) {
        //Pay Button(Purchase)

        try {
            int itms = 0, tmp;
            for (int r = 0; jTable2.getValueAt(r, 0) != null; r++) {
                tmp = Integer.parseInt("" + jTable2.getValueAt(r, 0));
                itms += tmp;
            }
            jTextField10.setText("" + itms);
            double total = 0, tmp2;
            for (int r = 0; jTable2.getValueAt(r, 3) != null; r++) {
                tmp2 = Double.parseDouble("" + jTable2.getValueAt(r, 3));
                total += tmp2;
            }
            jTextField12.setText("" + total);


            double cash, change;
            do {
                cash = Double.parseDouble(JOptionPane.showInputDialog("Cash Payment:"));
                if (cash < total) {
                    JOptionPane.showMessageDialog(null, "Insufficient Cash!", null, JOptionPane.WARNING_MESSAGE);
                }
            } while (cash < total);
            jTextField11.setText("" + cash);
            jTextField13.setText("" + (cash - total));
            jButton18.setEnabled(false);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid!", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent  event) {
    }
    private void jTextField10ActionPerformed(java.awt.event.ActionEvent  event) {
    }
    private void jTextField14ActionPerformed(java.awt.event.ActionEvent  event) {
        jButton6ActionPerformed( event);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent  event) {
        //Clear Button(Add/Delete)
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent  event) {
        //Delete Button

        try {
            if (jTextField14.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Enter item!", "Oops Wait...!", JOptionPane.ERROR_MESSAGE);
            else {
                BufferedReader rdfile = new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\Warehouse Management system\\src\\items.txt"));

                String[] itemline = new String[100];
                String[] temp;
                String delete = jTextField14.getText();
                boolean found = false;

                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    temp = itemline[x].split("\t");

                    if (delete.equals(temp[0])) {
                        x = x + 0;
                        found = true;
                    } else
                        x++;

                }
                rdfile.close();

                PrintWriter wrfile = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\Warehouse Management system\\src\\items.txt"));
                for (int j = 0; itemline[j] != null; j++)
                    wrfile.println(itemline[j]);

                wrfile.close();

                if (!found)
                    JOptionPane.showMessageDialog(null, "Item is already not in the list!", "Ooops!", JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Succesfully Deleted!", "Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
                jTextField14.setText("");
            }
        } catch (IOException e) {}
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent  event) {
        // Add Button

        try {
            if (jTextField3.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter item!", "Oops Wait...!", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedReader rdfile = new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\Warehouse Management system\\src\\items.txt"));

                String[] itemline = new String[100];
                String prod = "";
                int qty = 0;
                double price = 0.0;
                boolean found = false;

                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    x++;
                }
                rdfile.close();

                if (!(x >= 100)) {
                    prod = jTextField3.getText();

                    for (int j = 0; itemline[j] != null; j++) {      //check whether item is in the list already
                        String[] temp = itemline[j].split("\t");

                        if (prod.equals(temp[0])) {
                            found = true;
                        }
                    }

                    if (found) {
                        JOptionPane.showMessageDialog(null, "Item already exist!\nSuggestion: Update Item", "", JOptionPane.WARNING_MESSAGE);
                    } else {
                        qty = Integer.parseInt(jTextField4.getText());
                        price = Double.parseDouble(jTextField5.getText());

                        itemline[x] = prod + "\t" + qty + "\t" + price;

                        PrintWriter wrfile = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\Warehouse Management system\\src\\items.txt"));

                        for (int j = 0; itemline[j] != null; j++) {
                            wrfile.println(itemline[j]);
                        }

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Succesfully Added!", " Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Inventory Full!", "Warning!", JOptionPane.WARNING_MESSAGE);
                }
            }

            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");

        } catch (IOException e) {
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Some input may be invalid!", "Warning!", JOptionPane.WARNING_MESSAGE);

            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
        }
    }

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent  event) {
    }
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent  event) {
    }
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent  event) {
    }
    private void jTextField6ActionPerformed(java.awt.event.ActionEvent  event) {
    }
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent  event) {
        jButton8ActionPerformed( event);
    }
    private void jTextField8ActionPerformed(java.awt.event.ActionEvent  event) {
        jButton8ActionPerformed( event);
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent  event) {
        // Save Changes(Update)
        try{
            if( jTextField6.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Enter item!", "Ooops Wait...!", JOptionPane.ERROR_MESSAGE);
            else{
                BufferedReader rdfile= new BufferedReader( new FileReader("C:\\Users\\USER\\Desktop\\Warehouse Management system\\src\\items.txt"));
                String[] itemline= new String[100];
                String temp[];
                String search= "", prod="", Qty="", Price="";
                search= jTextField6.getText();
                int qty=0, x=0; double price=0.0;
                boolean found= false;

                prod= jTextField7.getText();
                Qty= jTextField8.getText();
                Price= jTextField9.getText();
                if( (!(prod.equals(""))) || (!(Qty.equals(""))) || (!(Price.equals(""))) ){
                    while(( itemline[x]= rdfile.readLine()) != null){
                        temp= itemline[x].split("\t");
                        if( search.equals( temp[0])){
                            if( prod.equals(""))
                                prod= temp[0];
                            if( Qty.equals(""))
                                qty= Integer.parseInt(temp[1]);
                            else
                                qty= Integer.parseInt( Qty )+ Integer.parseInt(temp[1]);

                            if( Price.equals(""))
                                price= Double.parseDouble(temp[2]);
                            else
                                price= Double.parseDouble( Price);
                            itemline[x]= prod+"\t"+qty+"\t"+price;
                            found= true;
                        }
                        x++;

                    }
                    rdfile.close();

                    if( found ){
                        PrintWriter wrfile= new PrintWriter( new FileWriter("C:\\Users\\USER\\Desktop\\Warehouse Management system\\src\\items.txt"));
                        for( int j=0; itemline[j] != null; j++)
                            wrfile.println( itemline[j]);
                        wrfile.close();
                        JOptionPane.showMessageDialog(null, "Saved changes!");
                    } else
                        JOptionPane.showMessageDialog(null, "Wrong item name, not found!");
                    jTextField6.setText("");
                    jTextField7.setText("");
                    jTextField8.setText("");
                    jTextField9.setText("");
                } else
                    JOptionPane.showMessageDialog( null, "Found no changes!");
            }
        }catch(IOException e){} catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid inputs were made!");

            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
        }
    }

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent  event) {
        jButton8ActionPerformed( event);
    }
    private   JButton jButton1;
    private   JButton jButton10;
    private   JButton jButton11;
    private   JButton jButton12;
    private   JButton jButton13;
    private   JButton jButton14;
    private   JButton jButton15;
    private   JButton jButton16;
    private   JButton jButton17;
    private   JButton jButton18;
    private   JButton jButton2;
    private   JButton jButton3;
    private   JButton jButton4;
    private   JButton jButton5;
    private   JButton jButton6;
    private   JButton jButton7;
    private   JButton jButton8;
    private   JButton jButton9;
    private   JLabel jLabel1;
    private   JLabel jLabel2;
    private   JLabel jLabel3;
    private   JLabel jLabel4;
    private   JLabel jLabel5;
    private   JLabel jLabel6;
    private   JLabel jLabel7;
    private   JPanel jPanel1;
    private   JPanel jPanel2;
    private   JPanel jPanel4;
    private   JPanel jPanel5;
    private   JScrollPane jScrollPane1;
    private   JScrollPane jScrollPane2;
    private   JTabbedPane jTabbedPane1;
    private   JTable jTable1;
    private   JTable jTable2;
    private   JTextField jTextField1;
    private   JTextField jTextField10;
    private   JTextField jTextField11;
    private   JTextField jTextField12;
    private   JTextField jTextField13;
    private   JTextField jTextField14;
    private   JTextField jTextField2;
    private   JTextField jTextField3;
    private   JTextField jTextField4;
    private   JTextField jTextField5;
    private   JTextField jTextField6;
    private   JTextField jTextField7;
    private   JTextField jTextField8;
    private   JTextField jTextField9;
    private   JToggleButton jToggleButton1;
    //Declaring the variables
    public static void main(String args[]) {
        try {
            for (  UIManager.LookAndFeelInfo info :   UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Display_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (  UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /*
         * Create and display the form
         */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display_Purchase().setVisible(true);
            }
        });
    }
}
