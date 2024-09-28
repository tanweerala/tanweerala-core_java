class ExceptionH3
{
public static void main(String []args)
{

int cb=10000;
int wb=14000;
try
{
if(cb<wb)
{
 throw new ArithmeticException("insufficient balance");
}
cb=cb-wb;
System.out.println("Transaction successful");
System.out.println("Current balance is:"+cb);
}
catch(ArithmeticException e1)
{
 System.out.println(e1.getMessage());
System.out.println("Current balance is:"+cb);
}

}
}