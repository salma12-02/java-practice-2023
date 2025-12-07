import java.util.*; 
public class Lab4_pb5
{
static Scanner console = new Scanner(System.in);
public static void main(String[]args)
{
Scanner console = new Scanner(System.in);
System.out.println("Enter the length of side 1: ");
double side1 = console.nextDouble();
System.out.println("Enter the length of side 2: ");
double side2 = console.nextDouble();
System.out.println("Enter the length of side 3: ");
double side3 = console.nextDouble();
if ((side1 * side1) == (side2 * side2) + (side3 * side3)) {
System.out.println("The triangle is a right triangle");
} else 
System.out.println("The triangle is not a right triangle");
}
}
