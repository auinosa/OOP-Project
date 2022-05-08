/**
 *
 * @author Sona Khachatryan
 */

    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.io.*;
    import javax.swing.*;
    import java.awt.*;

    public class Inventory extends JFrame {
        public Inventory() {
            initComponents();
        }
        private JButton button1;
        private JButton button3;
        private JButton button5;
        private JLabel label1;
        private JLabel label2;
        private JPanel panel1;
        private JPanel panel2;

        private void initComponents() {

            button1 = new JButton();
            button3 = new JButton();
            button5 = new JButton();
            label1 = new JLabel();
            label2 = new JLabel();
            panel1 = new JPanel();
            panel2 = new JPanel();

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setTitle("Inventory_Project");
            setBackground(new Color(219,244,255));//#DBF4FF, light blue1
            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

            panel1.setBackground(new Color(0xD2E9F3));//#D2E9F3, light blue2, 210,233,243

            button1.setBackground(new Color(0xF1F2F4));// greyish 241,242,244
            button1.setFont(new Font("DialogInput",Font.PLAIN,23));
            button1.setText("Search");
            button1.setBorder(null); //
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            button3.setBackground(new Color(0xF1F2F4));// greyish 241,242,244
            button3.setFont(new Font("DialogInput",Font.PLAIN,23));
            button3.setText("Display");
            button3.setBorder(null); //
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            button5.setBackground(new Color(0xF1F2F4));// greyish 241,242,244
            button5.setFont(new Font("DialogInput",Font.PLAIN,17));
            button5.setText("Exit");
            button5.setBorder(null); //
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            }

        }




