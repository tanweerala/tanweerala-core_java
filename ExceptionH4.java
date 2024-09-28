import java.io.*;
class ExceptionH4
{
public static void main(String []args) 
{
 System.out.println("A");
try
{
 throw new IOException("printer Not Found!!!!!!!!!!!!");
}
catch(IOException e1)
{
 System.out.println(e1.getMessage());
}

}
}