import java.util.*; 
public class Lab4_Pb3
{
static Scanner console = new Scanner(System.in);
public static void main(String[]args)
{
Scanner console = new Scanner(System.in);
System.out.println("Enter a number");
double number = console.nextDouble();
if (number > 0) {
System.out.println("The number is positive.");
} else if (number < 0) {
System.out.println("The number is negative.");
} else 
System.out.println("The number is zero.");
}
}
