import java.util.*; 
public class Lab4_Pb2
{
static Scanner console = new Scanner(System.in);
public static void main(String[]args)
{
Scanner console = new Scanner(System.in);
System.out.println("Enter the character");
char ch = console.next().charAt(0);
if (Character.isLowerCase(ch)) {
System.out.printf("The character %c is a lowercase", ch);
} else {
System.out.println("The character '" + ch + "' is an uppercase letter.");
}
}
}
