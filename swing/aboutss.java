package swing;

import AWT.page2;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

public class aboutss implements ActionListener{

    JLabel l1,l2,l3,l14,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton b2;

    JFrame f;


    public aboutss(){
        f = new JFrame("ABOUT");

        JLabel w=new JLabel("ABOUT THE CLUB");
        w.setFont(new java.awt.Font("TimesRoman", 3, 24));
        w.setBounds(300,30, 550, 50);
        w.setBackground(Color.white);
        f.add(w);

        l2=new JLabel("The Bombay Gymkhana, established in 1875,is one of the premiere gentlemen clubs in the city of Mumbai,");
        l2.setFont(new java.awt.Font("TimesRoman",2,15));
        l2.setBounds(20,80,900,30);
        f.add(l2);

        l4=new JLabel("India. Bombay Gymkhana Rugby Club (rugby union) are tenants.");
        l4.setFont(new java.awt.Font("TimesRoman",2,15));
        l4.setBounds(20,110,900,30);
        f.add(l4);

        l5=new JLabel("It is located in the Fort area of South Mumbai area and was originally built as a British-only club, designed by");
        l5.setFont(new java.awt.Font("TimesRoman",2,15));
        l5.setBounds(20,140,920,30);
        f.add(l5);

        l7=new JLabel("English architect, Claude Batley.");
        l7.setFont(new java.awt.Font("TimesRoman",2,15));
        l7.setBounds(20,170,900,30);
        f.add(l7);

        l9=new JLabel("Objectives");
        l9.setFont(new java.awt.Font("TimesRoman",3,20));
        l9.setBounds(300,220,200,40);
        f.add(l9);

        l10=new JLabel("The Sports club is committed to provide a healthy sporting habit among the students. It helps to learn teamwork");
        l10.setFont(new java.awt.Font("TimesRoman",2,15));
        l10.setBounds(20,260,950,40);
        f.add(l10);

        l11=new JLabel("at work, coordination among diverse cultural & ethnic groups and mainly infuses discipline & instills the value");
        l11.setFont(new java.awt.Font("TimesRoman",2,15));
        l11.setBounds(20,300,950,40);
        f.add(l11);


        l12=new JLabel("system in one individual. Value of time, precision & competitiveness are the major learning points apart from ");
        l12.setFont(new java.awt.Font("TimesRoman",2,15));
        l12.setBounds(20,330,950,40);
        f.add(l12);

        l13=new JLabel("communication, coordination & teamwork.");
        l13.setFont(new java.awt.Font("TimesRoman",2,15));
        l13.setBounds(20,370,900,40);
        f.add(l13);

        l1=new JLabel("Mahatma Gandhi Road, Opp Fashion Street, Azad Maidan, Fort, Mumbai, Maharashtra 400001.");
        l1.setFont(new java.awt.Font("TimesRoman",3,15));
        l1.setBounds(20,500,950,30);
        f.add(l1);

        l3=new JLabel("Contact:7977228358");
        l3.setFont(new java.awt.Font("TimesRoman",3,15));
        l3.setBounds(20,530,800,30);
        f.add(l3);

        l8=new JLabel("Email:sports@gmail.com");
        l8.setFont(new java.awt.Font("TimesRoman",3,15));
        l8.setBounds(20,560,900,40);
        f.add(l8);

        b2=new JButton("Back");
        b2.setFont(new java.awt.Font("Dialog", 4,20));
        b2.setBounds(350,700,100,40);
        b2.addActionListener(this);
        f.add(b2);

        f.setBounds(380,0,850, 800);
        f.setBackground(Color.white);
        f.setLayout(null);
        f.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b2)
        {
            new page2ss();
            f.setVisible(false);
        }


    }




    public static void main(String[] args) {
        aboutss m1 = new aboutss();

    }

}
