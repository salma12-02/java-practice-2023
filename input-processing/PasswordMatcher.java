import java.util.*;
public class lab5pb2
{
public static void main(String [] args)
{
Scanner console = new Scanner (System.in);
String str1, str2;
System.out.println("Enter your password: ");
str1 = console.next();

System.out.println("Enter your password again: ");
str2 = console.next();

if (str1.equals(str2)) {
System.out.println("You are now registered as a new user.");
} else 
System.out.println("Sorry, passwords do not match.");
}
}
