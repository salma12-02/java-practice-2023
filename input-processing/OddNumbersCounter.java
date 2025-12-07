import java.util.*;
public class TuT11_pb2_part2
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner (System.in);
  int number;
  int countOdd = 0;
  System.out.println("Enter a set of positive numbers, -1 to stop: ");
  number = console.nextInt();
  while (number != -1)
  { 
   if (number < 0)
   {
    System.out.println("negative numbers are not allowed...");
    break;
   }
   else if (number % 2 == 1)
   countOdd++;  
   number = console.nextInt();
  }
  System.out.printf("There are %d odd numbers", countOdd);
 }
}
