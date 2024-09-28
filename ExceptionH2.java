class ExceptionH2
{
public static void main(String []args)
{
try
{
System.out.println(5/0);
}
catch(NullPointerException n1)
{
}
finally 
{
System.out.println("finally block is always executed");  
}

String s1=null;
try
{
System.out.println(s1.length());
}
catch(Exception e1)
{

}
//catch(Exception e2)
{
}
finally 
{  
System.out.println("finally block is always executed");  
}  
}
}