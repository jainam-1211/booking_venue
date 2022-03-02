import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

public class sports implements ActionListener{
	Frame f;
	Button b1,b2;
	TextField t1,t2, t3;
	CheckboxGroup cb;
	Checkbox c1, c2, c3, c4;
	Choice ch,ch1;
	Label l1,l2,l19,l14,l4,l5,l6,l7,l8;

	
	
	public sports(){
	f = new Frame("ISSUING OF EQUIPMENTS");
        Color mainColor = new Color(218,179,255);
        Color con = new Color(181,102,255);
	l1=new Label("Select Your Equipment");
	l1.setBounds(40,200,200,30);
	f.add(l1);

	ch=new Choice();
	ch.setBounds(250,200,120,200);
	ch.add("Cricket Kit");
	ch.add("Football");
	ch.add("Basketball");
	ch.add("Tennis Racket");
	ch.add("Hockey Kit");
	f.add(ch);

        l2=new Label("Select number of days");
	l2.setBounds(40,300,200,30);
	f.add(l2);

        ch1=new Choice();
	ch1.setBounds(250,300,120,200);
	ch1.add("15 Days");
	ch1.add("30 Days");
	ch1.add("60 Days");
	ch1.add("120 Days");
	f.add(ch1);

	l6=new Label("Enter the number of Equipment");
	l6.setBounds(40,400,200,30);
	f.add(l6);

	t3=new TextField();
	t3.setBounds(250,400,120,30);
	f.add(t3);

       
	b1=new Button("Submit");
	b1.setBounds(290,450,120,30); 
	b1.addActionListener(this); 
        b1.setForeground(con);
	f.add(b1);
        
        b2=new Button("Confirm");
	b2.setBounds(290,550,120,30); 
	b2.addActionListener(this); 
        b2.setForeground(con);
	f.add(b2);

        l4 = new Label("");
        l4.setBounds(300, 500, 500, 50);
        f.add(l4);  

         
	f.setSize(700,700);
	f.setBackground(mainColor);
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
	String s1=ch.getSelectedItem();
        String s2=ch1.getSelectedItem();
        String s3= t3.getText();
        if(e.getSource() == b1){
         l4.setText("You have booked " +s3 +" "+ s1+ " for "+s2);
	}
}
	public static void main(String[] args) {
		sports s = new sports();

	}
