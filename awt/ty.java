import java.awt.*;
import java.awt.Color;
import java.awt.Font;

public class ty{
ty(){
Frame f=new Frame();
Label l1=new Label("THANK YOU");
l1.setFont(new java.awt.Font("Arial Black",1,80));
//l1.setBounds(200,200,250,400);
l1.setAlignment(l1.CENTER);
f.add(l1);
l1.setSize(800,800);
f.setSize(800,800);
	
	f.setLayout(null);
	f.setVisible(true);
}
public static void main(String args[])
{
ty t=new ty();
}
}