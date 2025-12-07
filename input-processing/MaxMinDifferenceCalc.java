import java.util.*;
public class lab5pb1
{
public static void main(String [] args)
{
Scanner console = new Scanner (System.in);
System.out.println("Enter three integers: ");
int num1;
num1 = console.nextInt();
int num2;
num2 = console.nextInt();
int num3;
num3 = console.nextInt();
int max, min;

if (num1 > num2 && num1 > num3 && num2 > num3) {
max = num1;
min = num3;  
System.out.println("The difference between the maximum and minimum values is: " + (max - min));

} else if (num2 > num1 && num2 > num3 && num1 > num3) {
max = num2;
min = num3;
System.out.println("The difference between the maximum and minimum values is: " + (max - min));

} else if (num3 > num2 && num3 > num1 && num2 > num1) {
max = num3;
min = num1;
System.out.println("The difference between the maximum and minimum values is: " + (max - min));

} else if (num1 > num2 && num1 > num3 && num3 > num2) {
max = num1;
min = num2;
System.out.println("The difference between the maximum and minimum values is: " + (max - min));

} else if (num2 > num1 && num2 > num3 && num3 > num1) {
max = num2;
min = num1;
System.out.println("The difference between the maximum and minimum values is: " + (max - min));

} else if (num3 > num2 && num3 > num1 && num1 > num2){
max = num3;
min = num2;
System.out.println("The difference between the maximum and minimum values is: " + (max - min));
}
}
} 
