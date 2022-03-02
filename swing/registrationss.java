package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;


import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

class registrationss implements ActionListener {
    JFrame f;
    JButton b1;
    JTextField t1, t2, t3, t4;
    JPasswordField t6, t7;

    JLabel l1, l2, l3, l4, l5, l6, l7;


    registrationss() {
        f = new JFrame("REGISTRATION FORM");

        l1 = new JLabel("Enter your Name:");
        l1.setBounds(40, 60, 120, 30);
        l1.setFont(new java.awt.Font("Arial Black", 1, 12));
        f.add(l1);

        t1 = new JTextField();
        t1.setFont(new java.awt.Font("Arial Black", 1, 12));
        t1.setBounds(250, 60, 120, 30);
        f.add(t1);

        l2 = new JLabel("Enter your Phone Number:");
        l2.setFont(new java.awt.Font("Arial Black", 1, 12));
        l2.setBounds(40, 105, 200, 30);
        f.add(l2);

        t2 = new JTextField();
        t2.setFont(new java.awt.Font("Arial Black", 1, 12));
        t2.setBounds(250, 105, 120, 30);
        f.add(t2);

        l3 = new JLabel("Enter your Email-id:");
        l3.setFont(new java.awt.Font("Arial Black", 1, 12));
        l3.setBounds(40, 150, 150, 30);
        f.add(l3);

        t3 = new JTextField();
        t3.setFont(new java.awt.Font("Arial Black", 1, 12));
        t3.setBounds(250, 150, 120, 30);
        f.add(t3);

        l4 = new JLabel("Username:");
        l4.setFont(new java.awt.Font("Arial Black", 1, 12));
        l4.setBounds(40, 195, 120, 30);
        f.add(l4);

        t4 = new JTextField();
        t4.setFont(new java.awt.Font("Arial Black", 1, 12));
        t4.setBounds(250, 195, 120, 30);
        f.add(t4);


        l5 = new JLabel("Password must contain atleast 8 characters including atleast 1 uppercase,1 number and 1 special character ");
        l5.setBounds(20, 230, 600, 30);
        l5.setForeground(Color.red);
        f.add(l5);

        l6 = new JLabel("Password:");
        l6.setFont(new java.awt.Font("Arial Black", 1, 12));
        l6.setBounds(40, 270, 120, 30);
        f.add(l6);


        t6 = new JPasswordField();
        t6.setFont(new java.awt.Font("Arial Black", 1, 12));
        t6.setBounds(250, 270, 120, 30);
        f.add(t6);


        l7 = new JLabel("Confirm Password");
        l7.setFont(new java.awt.Font("Arial Black", 1, 12));
        l7.setBounds(40, 315, 150, 30);
        f.add(l7);

        t7 = new JPasswordField();
        t7.setFont(new java.awt.Font("Arial Black", 1, 12));
        t7.setBounds(250, 315, 120, 30);
        f.add(t7);



        b1 = new JButton("REGISTER->");
        b1.setFont(new java.awt.Font("Arial Black", 1, 12));
        b1.setBounds(180, 400, 120, 30);
        b1.addActionListener(this);
        b1.setForeground(Color.red);
        f.add(b1);


        f.setBounds(380,0,800, 800);
        // f.setBackground(Color.CYAN);
        f.setLayout(null);
        f.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (!l1.getText().equals("") && !l2.getText().equals("") && !l3.getText().equals("") && !l4.getText().equals("") && !t6.getText().equals("") && !t7.getText().equals(""))

            {
                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = t3.getText();
                String s4 = t4.getText();
                String s5 = t7.getText();


                JDBCss hehe = new JDBCss();
                String input = "Insert into login values('" + s4 + "','" + s5 + "','" + s1 + "','" + s2 + "','" + s3 + "')";
                try {
                    hehe.state.executeUpdate(input);

                    new loginss();
                    // f.setVisible(false);
                } catch (Exception ee) {
                    System.out.println(ee);
                }
                if(e.getSource()==b1)
                {
                    new loginss();
                    f.setVisible(false);
                }

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please Enter all the Details");
            }
        }


    }




    public static void main(String[] args) {
        new registrationss();


    }
}