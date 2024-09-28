import javax.swing.*;
import java.awt.event.*;
class PageB extends JFrame
{

JLabel  l1,l2,l3,l4;
JTextField t1,t2;
JButton b1,b2;

PageB(String m1)
{
super(m1);
}
PageB()
{
}
void setComponents()
{
 l1=new JLabel("Welcome Delhi");
 l2=new JLabel("USERNAME");
 l3=new JLabel("PASSWORD");
 l4=new JLabel();

 t1=new JTextField();
 t2=new JTextField();

 b1=new JButton("Login");
 b1=new JButton("Clear");

 setLayout(null);
 add(l1);
 add(l2);
 add(l3);
 add(l4);

 add(t1);
 add(t2);

 add(b1);
 add(b2);

 l1.setBounds(100,50,300,30);
 l2.setBounds(100,200,100,30);
 l3.setBounds(100,350,100,30);
 l4.setBounds(100,550,100,30);
 t1.setBounds(350,200,100,30);
 t2.setBounds(350,350,100,30);
 b1.setBounds(200,450,100,30);
 b2.setBounds(400,450,100,30);
  
}
public static void main (String [] args)

{
PageB m1=new PageB("Welcome to Tanweer Alam");
 m1.setVisible(true);
 m1.setSize(700,700);
 m1.setComponents();
 m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}