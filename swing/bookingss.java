package swing;


import AWT.ty;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

public class bookingss implements ActionListener {
    JFrame f;
    JButton b1,b2,b3;
    JTextField t1, t2, t3;
    JComboBox<String> ch;

    JRadioButton c1, c2, c3, c4;
    ButtonGroup cb;


    JLabel l1, l2, l19, l20, l14, l4, l5, l6, l7, l8;


    public bookingss() {
        f = new JFrame("Ground Booking");

        l1 = new JLabel("Select the ground type");
        l1.setBounds(40, 150, 150, 30);
        f.add(l1);

        String[] s ={"Ground 1", "Ground 2", "Tennis Court", "Basketball Court"};


        cb = new ButtonGroup();
        c1 = new JRadioButton("Ground 1");
        c2 = new JRadioButton("Ground 2");
        c3 = new JRadioButton("Tennis Court");
        c4 = new JRadioButton("Basketball Court");
        c1.setBounds(200, 150, 120, 30);
        c2.setBounds(320, 150, 120, 30);
        c3.setBounds(440, 150, 120, 30);
        c4.setBounds(560, 150, 120, 30);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        cb.add(c1);
        cb.add(c2);
        cb.add(c3);
        cb.add(c4);

        l19 = new JLabel("Login");
        l19.setBounds(40, 60, 120, 30);
        f.add(l19);

        l20 = new JLabel("");
        l20.setBounds(100, 500, 500, 50);
        f.add(l20);

        t1 = new JTextField();
        t1.setBounds(200, 60, 120, 30);
        f.add(t1);

        l14 = new JLabel("Enter your Phone Number");
        l14.setBounds(40, 105, 150, 30);
        f.add(l14);

        t2 = new JTextField();
        t2.setBounds(200, 105, 120, 30);
        f.add(t2);

        l5 = new JLabel("Select Your Slot");
        l5.setBounds(40, 195, 120, 30);
        f.add(l5);


        String[] ss = {"6.00 A.M. to 7.00 A.M.","7.00 A.M. to 8.00 A.M.", "8.00 A.M. to 9.00 A.M.","9.00 A.M. to 10.00 A.M.","10.00 A.M. to 11.00 A.M.",
                "11.00 A.M. to 12.00 P.M.","12.00 P.M. to 1.00 P.M.","1.00 P.M. to 2.00 P.M.","2.00 P.M. to 3.00 P.M.","3.00 P.M. to 4.00 P.M.",
                "4.00 P.M. to 5.00 P.M.","5.00 P.M. to 6.00 P.M.","6.00 P.M. to 7.00 P.M.","7.00 P.M. to 8.00 P.M."};
        ch = new JComboBox<> (ss);
        ch.setBounds(200, 195, 150, 30);

        f.add(ch);

        l6 = new JLabel("Enter the Date");
        l6.setBounds(40, 240, 120, 30);
        f.add(l6);

        t3 = new JTextField();
        t3.setBounds(200, 240, 120, 30);
        f.add(t3);

        l7 = new JLabel("For any queries : ");
        l7.setBounds(40, 300, 120, 30);
        f.add(l7);

        l8 = new JLabel("Contact : 9999999999 or email : info.booking@gmail.com");
        l8.setBounds(40, 320, 330, 30);
        f.add(l8);


        b1 = new JButton("Confirm Booking");
        b1.setBounds(300, 400, 150, 30);
        b1.addActionListener(this);
        b1.setForeground(Color.red);
        f.add(b1);

        b2 = new JButton("Submit");
        b2.setBounds(300,550,150,30);
        b2.setForeground(Color.red);
        b2.addActionListener(this);
        f.add(b2);


        f.setBounds(380,0,800, 800);
        // f.setBackground(Color.CYAN);
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
        String s1 = null;
      if(c1.isSelected())
      {
           s1 = c1.getText();
      }
      else if(c2.isSelected())
        {
            s1 = c2.getText();
        }else if(c3.isSelected())
        {
            s1 = c3.getText();
        }else if(c4.isSelected())
        {
            s1 = c4.getText();
        }
        String s5= (String) ch.getSelectedItem();
        String s6 = t3.getText();
        if (e.getSource() == b1 ) {
            l20.setText("You have booked " + s1 + " for date: " + s6+ " and time: " + s5);


        }
        if(e.getSource()==b2)
        {
            JOptionPane.showMessageDialog(null,"Thank You");
            f.setVisible(false);
        }
    }


    public static void main(String[] args) {
        bookingss m1 = new bookingss();


    }
}
