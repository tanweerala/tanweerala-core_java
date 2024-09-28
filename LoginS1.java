import javax.swing.*;
class LoginS1 extends JFrame
{
LoginS1( String ls)
{
  super(ls);
}
LoginS1()
{
}

public static void main(String [] args) 
{


LoginS1 ls=new LoginS1("Welcome to Tanweer Alam");
ls.setVisible(true);
ls.setSize(700,700);
ls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}