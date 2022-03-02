package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.sql.*;


public class loginss extends JFrame implements ActionListener {
    JTextField name;
    JPasswordField pass;
    JButton b1, b2;
    JFrame f;
    JLabel label_invalid;

    loginss() {
        f = new JFrame();
        Color sub = new Color(0, 0, 0);
        Color sub2 = new Color(128, 128, 128);
        Color sub3 = new Color(218, 221, 219);
        Panel pan = new java.awt.Panel();
        pan.setBackground(new java.awt.Color(192, 205, 250));
        pan.setLayout(null);

        setLayout(new FlowLayout());
        this.setLayout(null);


        JLabel w = new JLabel("Welcome", JLabel.CENTER);
        w.setFont(new java.awt.Font("TimesRoman", 3, 54));
        w.setBounds(300, 100, 250, 80);
        //w.setForeground(sub);
        f.add(w);

        JLabel n = new JLabel("Username or Email", JLabel.CENTER);
        n.setFont(new java.awt.Font("Dialog", 5, 18));
        n.setBounds(215, 250, 200, 20);
        //n.setForeground(sub);
        f.add(n);


        JLabel p = new JLabel("Password", JLabel.CENTER);
        p.setFont(new java.awt.Font("Dialog", 5, 18));
        p.setBounds(215, 340, 135, 20);
        //p.setForeground(sub);
        f.add(p);

        name = new JTextField(20);
        name.setFont(new java.awt.Font("Dialog", 1, 18));
        name.setBounds(230, 280, 340, 30);
        name.setBackground(Color.white);
        f.add(name);

        pass = new JPasswordField(20);
        pass.setFont(new java.awt.Font("Dialog", 1, 18));

        pass.setBounds(230, 370, 340, 30);
        pass.setBackground(Color.white);
        f.add(pass);

        b1 = new JButton("LOG IN");
        b1.setFont(new java.awt.Font("Dialog", 1, 24));
        //b1.setBackground(sub);
        //b1.setForeground(Color.white);
        b1.setBounds(320, 420, 170, 50);
        b1.addActionListener(this);
        f.add(b1);

        JLabel nm = new JLabel("Not a member?");
        nm.setFont(new java.awt.Font("TimesRoman", 4, 18));
        nm.setBounds(250, 500, 130, 20);
        //nm.setForeground(sub);
        f.add(nm);

        label_invalid = new JLabel("Invalid Username or password");
        label_invalid.setBounds(350, 600, 180, 25);
        label_invalid.setForeground(Color.RED);
        f.add(label_invalid);
        label_invalid.setVisible(false);

        b2 = new JButton("Register");
        f.add(b2);
        b2.setFont(new java.awt.Font("Dialog", 4, 12));
//        b2.setBackground(sub3);
//        b2.setForeground(sub);
        b2.addActionListener(this);
        b2.setBounds(420, 495, 150, 30);
        //f.add(pan);

        f.setBounds(380, 0, 800, 800);
        f.setTitle("Sports Club Management");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {

            new registrationss();
            f.setVisible(false);

        }

        if (ae.getSource() == b1) {
            String username = name.getText();
            String password = pass.getText();

            JDBCss hehe = new JDBCss();
            String input = "Select * from login where username ='" + username + "'and password = '" + password + "'";

            try {

                ResultSet rs = hehe.state.executeQuery(input);
                if (rs.next()) {

                    new page2ss();
                    f.setVisible(false);
                } else {
                    label_invalid.setVisible(true);
                }
                hehe.connect.close();
                hehe.state.close();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void main (String args[])
    {
         loginss ml = new loginss();
        ml.setVisible(true);
        ml.setBounds(380, 0, 800, 800);
        ml.setTitle("Sports Club Management");
        new loginss();
    }
}