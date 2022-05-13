import java.io.*;
import javax.swing.*;
public class SearchEngine extends javax.swing.JFrame {


    public SearchEngine() {
        Components();
    }

    private javax.swing.JButton button;
    private javax.swing.JLabel label;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jscrollpane2;
    private javax.swing.JTable table;
    private javax.swing.JTextField textField;

    private void Components() {

        jscrollpane2 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        textField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search");

        panel.setBackground(new java.awt.Color(137, 137, 140));

        label.setBackground(new java.awt.Color(219, 222, 229));
        label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label.setText("Item:");
        label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(45, 44, 45)));

        button.setBackground(new java.awt.Color(115, 112, 112));
        button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button.setText("Search");
        button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(50, 52, 54)));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(217, 225, 234));
        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [100][4] ,
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
        table.setEnabled(false);
        jScrollPane1.setViewportView(table);

        textField.setBackground(new java.awt.Color(158, 159, 161));
        textField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(77, 70, 75)));
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panel);
        panel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(button)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(label)
                                                        .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)))
                                .addGap(84, 84, 84)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        buttonActionPerformed(evt);
    }

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {

        try{
            if( textField.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Enter item!", "Wait...!", JOptionPane.ERROR_MESSAGE);
            else{
                for( int r=0; r<100; r++)
                    for( int c=0; c<4; c++)
                        table.setValueAt("", r, c);

                BufferedReader reader= new BufferedReader( new FileReader("C:\\Users\\USER\\Desktop\\Warehouse Management system\\src\\items.txt"));
                String[] line= new String[100];
                String search="",  target="";

                boolean same= false, found=false;

                int x=0, row=0;
                while( (line[x]= reader.readLine()) != null)
                    x++;

                reader.close();

                search= textField.getText();

                for( int k=0; line[k] != null; k++){
                    same= false;
                    target="";
                    for( int j=0; j < search.length(); j++)
                        target+= line[k].charAt(j);

                    if( search.equals(target))
                        same=true;

                    if( same){
                        String[] temp= line[k].split("\t");
                        table.setValueAt((1000+k+1), row, 0);
                        for( int i=1; i<4; i++)
                            table.setValueAt(temp[i-1], row,i);
                        row++;
                        found=true;
                    }
                }

                if( !found)
                    JOptionPane.showMessageDialog(null, "Item(s) not found!", "Ooops!", JOptionPane.ERROR_MESSAGE);

                textField.setText("");
            }
        }catch(IOException e){}

    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SearchEngine().setVisible(true);
            }
        });
    }



}
