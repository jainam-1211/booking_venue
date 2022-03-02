import java.awt.*;
import java.awt.Color;
import java.awt.Font;


import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

public class perks implements ActionListener{
	
	Label l1,l2,l3,l14,l4,l5,l6,l7;
	

	Frame f;

	
	public perks(){
	f = new Frame("PERKS");
       
        Label w=new Label("PERKS OF BEING A MEMBER",Label.CENTER); 
        w.setFont(new java.awt.Font("TimesRoman", 3, 24));
        w.setBounds(100,30, 550, 50);
        w.setBackground(Color.white);
        f.add(w);

	l1=new Label("1. Healthy Body Healthy Mind");
        l1.setFont(new java.awt.Font("Arial Black",3,20));
	l1.setBounds(20,80,700,60);
	f.add(l1);

	
        l2=new Label("2. Teaches Temperament");
        l2.setFont(new java.awt.Font("Arial Black",3,20));
	l2.setBounds(20,140,700,50);
	f.add(l2);

        l3=new Label("3. Teaches Discipline");
        l3.setFont(new java.awt.Font("Arial Black",3,20));
	l3.setBounds(20,200,700,50);
	f.add(l3);
        
        l4=new Label("4. Life Skills");
        l4.setFont(new java.awt.Font("Arial Black",3,20));
	l4.setBounds(20,260,700,50);
	f.add(l4);

        l5=new Label("5. Career Skills");
        l5.setFont(new java.awt.Font("Arial Black",3,20));
	l5.setBounds(20,320,700,50);
	f.add(l5);
      
        l6=new Label("6. Dealing with Disappointment");
        l6.setFont(new java.awt.Font("Arial Black",3,20));
	l6.setBounds(20,380,700,50);
	f.add(l6);
      
        l7=new Label("7. Spirit of Higher Achievement");
        l7.setFont(new java.awt.Font("Arial Black",3,20));
	l7.setBounds(20,440,700,50);
	f.add(l7);
        
        

    
	f.setSize(800,800);
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
    public void actionPerformed(ActionEvent e){
	 
	} 




	public static void main(String[] args) {
		perks m1 = new perks();

	}

}