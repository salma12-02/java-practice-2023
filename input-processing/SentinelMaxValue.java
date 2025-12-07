import java.util.*;
public class sentiMax
{
 public static void main(String [] args)
 { 
  Scanner console = new Scanner(System.in);
  int number;
  int max;
  System.out.println("Enter a set of numbers, -1 to stop: ");
  number = console.nextInt();
  max = number;
  while (number != -1)
  { 
   if (number > max)
   max = number;
   number = console.nextInt();
  }
  if (max != -1)
  System.out.printf("The biggest number is %d \n", max);
  else 
  System.out.println("Enter a set of numbers again: ");
 }
}
