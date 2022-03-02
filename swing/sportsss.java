package swing;

import AWT.ty;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

public class sportsss implements ActionListener {
    JFrame f;
    JButton b1, b2;
    JTextField t1, t2, t3;
    JComboBox <String> ch, ch1;

    JLabel l1, l2, l19, l14, l4, l5, l6, l7, l8;


    public sportsss() {
        f = new JFrame("ISSUING OF EQUIPMENTS");
        Color mainColor = new Color(218, 179, 255);
        Color con = new Color(181, 102, 255);

        l1 = new JLabel("Select Your Equipment");
        l1.setFont(new java.awt.Font("TimesRoman", 4, 18));
        l1.setBounds(40, 200, 200, 30);
        f.add(l1);

        String [] s = {"Cricket Kit", "Football", "Basketball", "Tennis Racket", "Hockey Kit"};
        ch = new JComboBox<>(s);
        ch.setBounds(300, 200, 120, 30);
        f.add(ch);


        l2 = new JLabel("Select number of days");
        l2.setFont(new java.awt.Font("TimesRoman", 4, 18));
        l2.setBounds(40, 300, 200, 30);
        f.add(l2);

        String [] ss = {"15 Days", "30 Days","60 Days", "120 Days"};
        ch1 = new JComboBox<>(ss);
        ch1.setBounds(300, 300, 120, 30);
        f.add(ch1);



        l6 = new JLabel("Enter the number of Equipment");
        l6.setFont(new java.awt.Font("TimesRoman", 4, 18));
        l6.setBounds(40, 400, 250, 30);
        f.add(l6);

        t3 = new JTextField();
        t3.setBounds(300, 400, 120, 30);
        f.add(t3);


        b1 = new JButton("Confirm");
        b1.setFont(new java.awt.Font("TimesRoman", 4, 18));
        b1.setBounds(290, 450, 120, 30);
        b1.addActionListener(this);
        // b1.setForeground(con);
        f.add(b1);

        b2 = new JButton("Submit");
        b2.setFont(new java.awt.Font("TimesRoman", 4, 18));
        b2.setBounds(290, 550, 120, 30);
        b2.addActionListener(this);
        // b2.setForeground(con);
        f.add(b2);

        l4 = new JLabel("");
        l4.setFont(new java.awt.Font("TimesRoman", 4, 18));
        l4.setBounds(300, 500, 500, 50);
        f.add(l4);


        f.setBounds(380,0,800, 800);
        //f.setBackground(mainColor);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = (String) ch.getSelectedItem();
        String s2 = (String) ch1.getSelectedItem();
        String s3 = t3.getText();
        if (e.getSource() == b1) {
            l4.setText("You have booked " + s3 + " " + s1 + " for " + s2);

        }
        if(e.getSource()==b2)
        {
            JOptionPane.showMessageDialog(null,"Thank You");
            f.setVisible(false);
        }
    }

    public static void main(String[] args) {
       sportsss s = new sportsss();

    }
}