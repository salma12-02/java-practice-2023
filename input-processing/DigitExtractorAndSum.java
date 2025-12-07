import java.util.*;
public class Lab9_pb1
{
public static void main(String [] args)
{
Scanner console = new Scanner(System.in);
int num;
int digit;
int sum = 0;
int power = 1;
System.out.print("Enter an integer: ");
num = console.nextInt();
System.out.println();
System.out.print("The digits of " + num + " are: ");
if (num < 0)
num = -num;
while (num / (int)(Math.pow(10, power)) > 10)
power++;
while (num > 0)
{
digit = num / (int)(Math.pow(10, power));
System.out.print(digit + " ");
sum = sum + digit;
num = num % (int)(Math.pow(10,power));
power--;
}
System.out.println();
System.out.println("The sum of the digits = " + sum);
}
}
