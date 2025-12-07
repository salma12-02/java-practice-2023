import java.util.*;
public class Lab7_pb1 
{
public static void main (String [] args)
{
Scanner console = new Scanner(System.in);
System.out.println("Enter the number of integers: ");
int N;
N = console.nextInt();
int sumEven;
sumEven = 0;
int sumOdd; 
sumOdd = 0;

System.out.println("Enter the integers");
int count;
count = 1;
int num;

while (N >= count) {
num = console.nextInt();
if (num % 2 == 0)
sumEven = num + sumEven;
else 
sumOdd = num + sumOdd;
count = count + 1;
}
System.out.println("The sum of even numbers is " + sumEven);

System.out.println("The sum of odd numbers is " + sumOdd);

}
}
