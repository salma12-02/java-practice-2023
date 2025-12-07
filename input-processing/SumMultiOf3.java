import java.io.*;
import java.util.*;
public class Method
{ 
 public static void main(String [] args)
 { 
  Scanner console = new Scanner(System.in);
  int lower, upper;
  System.out.println("Enter two integer values: ");
  lower = console.nextInt();
  upper = console.nextInt();
  multipleThree(lower, upper);
 }
 public static int multipleThree(int lower, int upper)
 {
  int sum = 0;
  int c;
  for(c = lower; c <= upper; c++)
  {
   if (c % 3 == 0)  
   sum = sum + c;
  }
  System.out.printf("The sum of the number between %d and %d which are multiple of 3 is %d", lower, upper, sum);
  return sum;
}   
}
