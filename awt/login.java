import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
class login extends Frame
{
    TextField name,pass;
    Button b1,b2;
   login()
    {
        Frame f= new Frame();
        Color sub = new Color(0,0,0);
        Color sub2 = new Color(128,128,128);
        Color sub3 = new Color(218,221,219);
        Panel pan = new java.awt.Panel();
        pan.setBackground(new java.awt.Color(192, 205, 250));
        pan.setLayout(null);

        setLayout(new FlowLayout());
        this.setLayout(null);

        
        Label w=new Label("Welcome",Label.CENTER); 
        w.setFont(new java.awt.Font("TimesRoman", 3, 54));
        w.setBounds(300, 100, 205, 80);
        w.setForeground(sub);
        this.add(w);

        Label n=new Label("Username or Email",Label.CENTER);
        n.setFont(new java.awt.Font("Dialog", 5, 18));
        n.setBounds(215, 250, 200, 20);
        n.setForeground(sub);
        this.add(n);  
       


        Label p=new Label("Password",Label.CENTER);
        p.setFont(new java.awt.Font("Dialog", 5, 18));
        p.setBounds(215, 340, 135, 20);
        p.setForeground(sub);
        this.add(p);

        name=new TextField(20);
        name.setFont(new java.awt.Font("Dialog", 1, 18));
        name.setBounds(230, 280, 340, 30);
        name.setBackground(Color.white);
        this.add(name);

        pass=new TextField(20);
        pass.setFont(new java.awt.Font("Dialog", 1, 18));
        pass.setEchoChar('*');
        pass.setBounds(230, 370, 340, 30);
        pass.setBackground(Color.white);
        this.add(pass);

        b1=new Button("LOG IN");
        this.add(b1);
        b1.setFont(new java.awt.Font("Dialog", 1, 24));
        b1.setBackground(sub);
        b1.setForeground(Color.white);
        b1.setBounds(320,420,170,50);

        Label nm=new Label("Not a member?"); 
        nm.setFont(new java.awt.Font("TimesRoman", 4, 18));
        nm.setBounds(300, 500, 115, 20);
        nm.setForeground(sub);
        this.add(nm);



        b2=new Button("Register");
        this.add(b2);
        b2.setFont(new java.awt.Font("Dialog", 4,12));
        b2.setBackground(sub3);
        b2.setForeground(sub);
        b2.setBounds(420,495,70,30);
        
        f.add(pan);
        
 
    }
    public static void main(String args[])
    {
        login ml=new login();
        ml.setVisible(true);
        ml.setSize(800,800);
        ml.setTitle("Sports Club Management");
    }
}