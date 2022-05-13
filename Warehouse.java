
/**
 *
 * @author Sona Khachatryan
 */


import javax.swing.*;
import java.awt.*;

public class Warehouse extends javax.swing.JFrame {


    public Warehouse() {

        initComponents();
    }

    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;


    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Warehouse Management System");
        setBackground(new java.awt.Color(0xDBF4FF));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panel1.setBackground(new java.awt.Color(0xD2E9F3));

        button1.setBackground(new java.awt.Color(0xF1F2F4));
        button1.setFont(new java.awt.Font("DialogInput", Font.PLAIN,23));
        button1.setText("Search");
        button1.setBorder(null);
        button1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        button2.setBackground(new java.awt.Color(0xBCBCCD));
        button2.setFont(new java.awt.Font("DialogInput",Font.PLAIN,23));
        button2.setText("Display");
        button2.setBorder(null);
        button2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                button2ActionPerformed(e);
            }
        });

        button3.setBackground(new java.awt.Color(0xF1F2F4));
        button3.setFont(new java.awt.Font("DialogInput",Font.PLAIN,17));
        button3.setText("Exit");
        button3.setBorder(null);
        button3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {

                button3ActionPerformed(e);
            }
        });


        label1.setBackground(new java.awt.Color(0x9FABC2FF));
        label1.setFont(new java.awt.Font("DialogInput",Font.PLAIN,51));
        label1.setText("   MENU ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panel1);

        panel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(label1)
                .addGap(65, 65, 65)
                .addComponent(button1)
                .addGap(42, 42, 42)
                .addComponent(button2)
                .addGap(48, 48, 48)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );


        panel2.setBackground(new java.awt.Color(0x23395d));

        label2.setFont(new java.awt.Font("DialogInput",Font.PLAIN,47));
        label2.setForeground(new java.awt.Color(255, 255, 0));
        label2.setText("WAREHOUSE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panel2);

        panel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label2)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );


        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent e) {
        SearchEngine a =new SearchEngine();
        a.setVisible(true);
        a.setDefaultCloseOperation(SearchEngine.DISPOSE_ON_CLOSE);
    }

    private void button2ActionPerformed(java.awt.event.ActionEvent e) {
        Display_Purchase a =new Display_Purchase();
        a.setVisible(true);
        a.setDefaultCloseOperation(Display_Purchase.DISPOSE_ON_CLOSE); 
        
    }

    private void button3ActionPerformed(java.awt.event.ActionEvent e) {
 
       int exit =JOptionPane.showConfirmDialog(null, "DO YOU WANT TO EXIT?");
       if(exit ==0){
            JOptionPane.showMessageDialog(null, "Thank you!");
        System.exit(0);
    }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Warehouse().setVisible(true);
            }
        });
    }

}
