import java.util.*;
public class Lab8_pb1 
{
public static void main(String [] args)
{
Scanner console = new Scanner(System.in);
String str;
int i;
char ch;

System.out.println("Enter any word.");
str = console.next();
for (i = str.length()-1; i >= 0; i --) 
{
ch = str.charAt(i);
System.out.print(ch + " ");
}
}
}
