import java.util.*;
public class Lab3_pb4
{

static Scanner console = new Scanner(System.in);
public static void main(String[]args)
{

System.out.print("Enter a four-digit positive integer: ");
int number = console.nextInt();
int digit1 = number / 1000; // Extract thousands place digit
int digit2 = (number % 1000) / 100; // Extract hundreds place digit
int digit3 = (number % 100) / 10; // Extract tens place digit
int digit4 = number % 10; // Extract ones place digit

System.out.println(digit1);
System.out.println(digit2);
System.out.println(digit3);
System.out.println(digit4);
}
}
