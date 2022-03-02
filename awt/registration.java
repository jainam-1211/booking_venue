import java.awt.*;
import java.awt.Color;
import java.awt.Font;


import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

public class registration implements ActionListener{
	Frame f;
	Button b1;
	TextField t1,t2, t3,t4,t5;
	
	Label l1,l2,l3,l14,l4,l5,l6;
	

	
	public registration(){
	f = new Frame("REGISTRATION FORM");

	

        
	l1=new Label("Enter your Name:");
	l1.setBounds(40,60,120,30);
l1.setFont(new java.awt.Font("Arial Black",1,12));
	f.add(l1);

	t1=new TextField();
t1.setFont(new java.awt.Font("Arial Black",1,12));
	t1.setBounds(200,60,120,30);
	f.add(t1);

	l2=new Label("Enter your Phone Number:");
l2.setFont(new java.awt.Font("Arial Black",1,12));
	l2.setBounds(40,105,160,30);
	f.add(l2);

	t2=new TextField();
t2.setFont(new java.awt.Font("Arial Black",1,12));
	t2.setBounds(200,105,120,30);
	f.add(t2);

l3=new Label("Enter your Email-id:");
l3.setFont(new java.awt.Font("Arial Black",1,12));
	l3.setBounds(40,150,150,30);
	f.add(l3);

	t3=new TextField();
t3.setFont(new java.awt.Font("Arial Black",1,12));
	t3.setBounds(200,150,120,30);
	f.add(t3);


	l4=new Label("Enter a Password:");
l4.setFont(new java.awt.Font("Arial Black",1,12));
	l4.setBounds(40,195,120,30);
	f.add(l4);

	l6=new Label("Password must contain atleast 8 characters including atleast 1 uppercase,1 number and 1 special character ");
	l6.setBounds(20,230,600,30);
l6.setForeground(Color.red);
	f.add(l6);


t4=new TextField();
t4.setFont(new java.awt.Font("Arial Black",1,12));
	t4.setBounds(200,195,120,30);
	f.add(t4);

	

	l5=new Label("Confirm Password:");
l5.setFont(new java.awt.Font("Arial Black",1,12));
	l5.setBounds(40,270,120,30);
	f.add(l5);


	t5=new TextField();
t5.setFont(new java.awt.Font("Arial Black",1,12));
	t5.setBounds(200,270,120,30);
	f.add(t5);

      

	b1=new Button("REGISTER->");
b1.setFont(new java.awt.Font("Arial Black",1,12));
	b1.setBounds(180,400,120,30); 
	b1.addActionListener(this); 
        b1.setForeground(Color.red);
	f.add(b1);
        

    
	f.setSize(700,700);
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
    public void actionPerformed(ActionEvent e){
	 
	} 




	public static void main(String[] args) {
		registration m1 = new registration();

	}

}
