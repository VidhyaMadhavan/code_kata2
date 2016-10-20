import java.io.*;
import java.lang.*;
class alphabet
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char ch;
System.out.println("Enter any alphabetic:");
ch=(char)br.read();
if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
{
System.out.println("Entered character is alphabet");
}
else
{
System.out.println("Invalid input");
}
}
}
