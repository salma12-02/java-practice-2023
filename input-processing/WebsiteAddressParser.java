import java.util.*;
public class question2
{
public static void main(String [] args)
{
Scanner console = new Scanner(System.in);
System.out.printf("Enter the website address:%n");
String str1, str2;
str1 = console.next();
str2 = str1.substring (4, 9);
str2 = str2.toUpperCase();
System.out.printf("you consult %s website",str1);
}
}
