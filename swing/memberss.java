package swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class memberss implements ActionListener{
    JFrame f;
    JButton b1,b2;
    JRadioButton c1, c2, c3;
    ButtonGroup group;
    JLabel l1,l2,l3,l14,l4,l5,l6,l20;

    public memberss(){
        f = new JFrame("MEMBERSHIP FORM");

        JLabel w=new JLabel("Membership Drive");
        w.setFont(new java.awt.Font("TimesRoman", 3, 36));
        w.setBounds(250,30, 400, 100);
        //w.setBackground(Color.cyan);
        f.add(w);

        group = new ButtonGroup();
        c1 = new JRadioButton("1 Year");
        c1.setFont(new java.awt.Font("Arial Black",Font.BOLD,20));
        c2 = new JRadioButton("5 Years");
        c2.setFont(new java.awt.Font("Arial Black",Font.BOLD,20));
        c3 = new JRadioButton("Life-time");
        c3.setFont(new java.awt.Font("Arial Black",Font.BOLD,20));
        group.add(c1);
        group.add(c2);
        group.add(c3);


        c1.setBounds(200,150,100,30);
        c2.setBounds(200,250,140,30);
        c3.setBounds(200,350,140,30);

        f.add(c1);
        f.add(c2);
        f.add(c3);


        l1=new JLabel("AMOUNT : 5000" );
        l1.setBounds(200,200,200,30);
        l1.setFont(new java.awt.Font("Arial Black",2,20));
        f.add(l1);



        l2=new JLabel("AMOUNT : 12000");
        l2.setFont(new java.awt.Font("Arial Black",2,20));
        l2.setBounds(200,300,200,30);
        f.add(l2);

        l3=new JLabel("AMOUNT : 100000");
        l3.setFont(new java.awt.Font("Arial Black",2,20));
        l3.setBounds(200,400,220,30);
        f.add(l3);

        l20 = new JLabel("");
        l20.setBounds(100, 600, 500, 50);
        f.add(l20);


        b1=new JButton("Perks");
        b1.setFont(new java.awt.Font("Arial Black",1,20));
        b1.setBounds(200,450,120,30);
        b1.addActionListener(this);
        //b1.setBackground(Color.yellow);
        b1.setForeground(Color.red);
        f.add(b1);

        b2=new JButton("Confirm");
        b2.setFont(new java.awt.Font("Arial Black",1,20));
        b2.setBounds(200,550,180,30);
        b2.addActionListener(this);
        //b2.setBackground(Color.yellow);
        b2.setForeground(Color.red);
        f.add(b2);

        f.setBounds(380,0,800, 800);
        //f.setBackground(Color.CYAN);
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
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1)
        {
            new perksss();
            f.setVisible(false);
        }
        if (e.getSource() == b2 && c1.isSelected()){
            String str = l1.getText();
            l20.setText("You have purchased membership for " +str);
            JOptionPane.showMessageDialog(null, "Thank You");
        }
        if (e.getSource() == b2 && c2.isSelected()){
            String str = l2.getText();
            l20.setText("You have purchased membership for " +str);
            JOptionPane.showMessageDialog(null, "Thank You");
        }
        if (e.getSource() == b2 && c3.isSelected()){
            String str = l3.getText();
            l20.setText("You have purchased membership for " +str);
            JOptionPane.showMessageDialog(null, "Thank You");
        }
    }

    public static void main(String[] args) {
        memberss m1 = new memberss();
    }
}