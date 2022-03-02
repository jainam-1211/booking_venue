package swing;

import AWT.member;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;


import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

public class perksss implements ActionListener {

    JLabel l1, l2, l3, l14, l4, l5, l6, l7;
    JButton b1;


    JFrame f;


    public perksss() {
        f = new JFrame("PERKS");

        JLabel w = new JLabel("PERKS OF BEING A MEMBER");
        w.setFont(new java.awt.Font("TimesRoman", 3, 24));
        w.setBounds(100, 30, 550, 50);
        w.setBackground(Color.white);
        f.add(w);

        l1 = new JLabel("1.Access to all the ground and courts.");
        l1.setFont(new java.awt.Font("Arial Black", 3, 20));
        l1.setBounds(20, 80, 700, 60);
        f.add(l1);


        l2 = new JLabel("2.Free gym membership.");
        l2.setFont(new java.awt.Font("Arial Black", 3, 20));
        l2.setBounds(20, 140, 700, 50);
        f.add(l2);

        l3 = new JLabel("3.Coaching assistance to all the sports.");
        l3.setFont(new java.awt.Font("Arial Black", 3, 20));
        l3.setBounds(20, 200, 700, 50);
        f.add(l3);

        l4 = new JLabel("4.Offers on ground booking for sports event and cooperate events.");
        l4.setFont(new java.awt.Font("Arial Black", 3, 20));
        l4.setBounds(20, 260, 950, 50);
        f.add(l4);

        l5 = new JLabel("5.Free issue of limited amount of kits.");
        l5.setFont(new java.awt.Font("Arial Black", 3, 20));
        l5.setBounds(20, 320, 700, 50);
        f.add(l5);

        l6 = new JLabel("6.You can arrange events like marriage ,birthday etc.");
        l6.setFont(new java.awt.Font("Arial Black", 3, 20));
        l6.setBounds(20, 380, 700, 50);
        f.add(l6);

        b1 = new JButton("Back");
        b1.setFont(new java.awt.Font("Dialog", 1, 24));
        b1.setBounds(320, 600, 170, 50);
        b1.addActionListener(this);
        f.add(b1);


        f.setBounds(380, 0, 950, 800);
        f.setBackground(Color.white);
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
        if (e.getSource() == b1) {
            new memberss();
            f.setVisible(false);
        }

    }


    public static void main(String[] args) {
        perksss m1 = new perksss();

    }
}

