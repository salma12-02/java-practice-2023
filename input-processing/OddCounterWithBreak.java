import java.util.*;
public class BreakInWhile
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int num;
  int counter = 0;
  System.out.println("Enter a set of integers, -1 to stop: ");
  num = console.nextInt();
  while (num != -1)   
  {
   if (num < 0)
   break;
   if (num % 2 == 1)
   counter++;
   num = console.nextInt();
  }    
  System.out.printf("There are %d odd numbers in this set: ", counter); 
 
 }
 
}
