import java.awt.*;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

public class booking implements ActionListener {
    Frame f;
    Button b1;
    TextField t1, t2, t3;
    CheckboxGroup cb;
    Checkbox c1, c2, c3, c4;
    Choice ch;
    Label l1, l2, l19, l20, l14, l4, l5, l6, l7, l8;


    public booking() {
        f = new Frame("Ground Booking");

        l1 = new Label("Select the ground type");
        l1.setBounds(40, 150, 120, 30);
        f.add(l1);

        cb = new CheckboxGroup();
        c1 = new Checkbox("Ground 1", cb, false);
        c2 = new Checkbox("Ground 2", cb, true);
        c3 = new Checkbox("Tennis Court", cb, true);
        c4 = new Checkbox("Basketball Court", cb, true);
        c1.setBounds(200, 150, 70, 30);
        c2.setBounds(300, 150, 70, 30);
        c3.setBounds(400, 150, 100, 30);
        c4.setBounds(500, 150, 100, 30);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);

        l19 = new Label("Login");
        l19.setBounds(40, 60, 120, 30);
        f.add(l19);

        l20 = new Label("");
        l20.setBounds(100, 500, 500, 50);
        f.add(l20);

        t1 = new TextField();
        t1.setBounds(200, 60, 120, 30);
        f.add(t1);

        l14 = new Label("Enter your Phone Number");
        l14.setBounds(40, 105, 150, 30);
        f.add(l14);

        t2 = new TextField();
        t2.setBounds(200, 105, 120, 30);
        f.add(t2);

        l5 = new Label("Select Your Slot");
        l5.setBounds(40, 195, 120, 30);
        f.add(l5);

        ch = new Choice();
        ch.setBounds(200, 195, 150, 200);
        ch.add("6.00 A.M. to 7.00 A.M.");
        ch.add("7.00 A.M. to 8.00 A.M.");
        ch.add("8.00 A.M. to 9.00 A.M.");
        ch.add("9.00 A.M. to 10.00 A.M.");
        ch.add("10.00 A.M. to 11.00 A.M.");
        ch.add("11.00 A.M. to 12.00 P.M.");
        ch.add("12.00 P.M. to 1.00 P.M.");
        ch.add("1.00 P.M. to 2.00 P.M.");
        ch.add("2.00 P.M. to 3.00 P.M.");
        ch.add("3.00 P.M. to 4.00 P.M.");
        ch.add("4.00 P.M. to 5.00 P.M.");
        ch.add("5.00 P.M. to 6.00 P.M.");
        ch.add("6.00 P.M. to 7.00 P.M.");
        ch.add("7.00 P.M. to 8.00 P.M.");
        f.add(ch);

        l6 = new Label("Enter the Date");
        l6.setBounds(40, 240, 120, 30);
        f.add(l6);

        t3 = new TextField();
        t3.setBounds(200, 240, 120, 30);
        f.add(t3);

        l7 = new Label("For any queries : ");
        l7.setBounds(40, 300, 120, 30);
        f.add(l7);

        l8 = new Label("Contact : 99999999 or email : info.booking@gmail.com");
        l8.setBounds(40, 320, 300, 30);
        f.add(l8);


        b1 = new Button("Confirm Booking");
        b1.setBounds(180, 400, 120, 30);
        b1.addActionListener(this);
        b1.setForeground(Color.red);
        f.add(b1);


        f.setSize(700, 700);
        f.setBackground(Color.CYAN);
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
        String s1=cb.getSelectedCheckbox().getLabel();
        String s5=ch.getSelectedItem();
        String s6 = t3.getText();
        if (e.getSource() == b1 ) {
            l20.setText("You have booked " + s1 + " for date: " + s6+ " and time: " + s5);



        }
    }

    public static void main(String[] args) {
        booking m1 = new booking();


    }
}