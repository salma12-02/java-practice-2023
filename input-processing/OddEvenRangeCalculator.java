import java.util.*;
public class BetSumOddCount
{
 public static void main(String [] args)
 { 
  Scanner console = new Scanner(System.in);
  int FirstNum, SecondNum, counter;
  int odd = 0;
  int sumEven = 0;
  System.out.println("Enter 2 integers, the first must be LESS than the second: ");
  FirstNum = console.nextInt();
  SecondNum = console.nextInt();
  if (FirstNum > SecondNum)
  System.out.println("The first must be LESS than the second: ");
  System.out.printf("All odd numbers between %d and %d are:\n ", FirstNum, SecondNum);
  counter = FirstNum;
  while (counter <= SecondNum)
  {
   if (counter % 2 == 1)
   System.out.println(counter);
   else
   sumEven = sumEven + counter;
   counter++;
  }
  System.out.println("The sum of all even numbers is = " + sumEven); 
 }
}
