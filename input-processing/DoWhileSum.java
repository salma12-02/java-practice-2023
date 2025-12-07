import java.util.*;
public class Printing {
public static void main(String [] args) {
Scanner console = new Scanner(System.in);
int num;
int sum = 0;
do {
System.out.println("Enter a number, zero to stop: ");
num = console.nextInt();
sum = sum + num; }
while (num != 0);
System.out.println("The sum of all numbers you enterd = " + sum);
}
}
