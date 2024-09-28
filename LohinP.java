import javax.swing.*;
class LohinP extends JFrame
{
//JLabel  l1,l2,l3,l4;
//JTextField t1,t2;
//JButton b1,b2;
LohinP(String p1)
{
super(p1);
}
LohinP()
{
}
void setComponents()
{
//JLabel l1=new JLabel("Welcome Delhi");
//JTextField t1=new JTextField();
//setLayout(null);
//l1.setBounds(200,100,100,30);
//t1.setBounds(200,200,100,30);
//add(t1);
//add(l1);



 JLabel  l1=new JLabel("Welcome to Programming Language  Study");
 JLabel l2=new JLabel("USERNAME");
 JLabel l3=new JLabel("PASSWORD");
 JLabel  l4=new JLabel();

 JTextField t1=new JTextField();
 JTextField t2=new JTextField();

  JButton  c1=new JButton("Login");
  JButton c2=new JButton("Clear");

 setLayout(null);
 add(l1);
 add(l2);
 add(l3);
 add(l4);

 add(t1);
 add(t2);

 add(c1);
 add(c2);

 l1.setBounds(100,50,300,30);
 l2.setBounds(100,200,100,30);
 l3.setBounds(100,350,100,30);
 l4.setBounds(100,550,100,30);
 t1.setBounds(350,200,100,30);
 t2.setBounds(350,350,100,30);
 c1.setBounds(200,450,100,30);
 c2.setBounds(400,450,100,30);








}
public static void main (String [] args)

{
 LohinP p1=new LohinP("Welcome to Tanweer Alam");
 p1.setVisible(true);
 p1.setSize(700,700);
 p1.setComponents();
 p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
