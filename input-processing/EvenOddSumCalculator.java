import java.util.*;
public class sums 
{ 
 public static void main(String [] args)
 { 
  Scanner console = new Scanner(System.in);
  int N;
  int number;
  int counter = 0;
  int sumOdd = 0;
  int sumEven = 0;
  System.out.println("Enter number of integers: ");
  N = console.nextInt();
  System.out.printf("Enter %2d integers: ", N);
  while (counter < N)
  {
   number = console.nextInt();
   if (number % 2 == 0)
   sumEven = sumEven + number;
   else
   sumOdd = sumOdd + number;
  counter++;
  } 
  System.out.printf("The sum of all even numbers is = %d \n", sumEven);
  System.out.printf("The sum of all odd numbers is = %d", sumOdd); 
 }
}
