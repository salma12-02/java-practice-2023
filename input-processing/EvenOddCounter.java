import java.util.*;
public class EvenAndOdd
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int counter, n, num;
  int zeros = 0;
  int odds = 0;
  int evens = 0;
  System.out.println("How many integers do you have? ");
  n = console.nextInt();
  for (counter = 1; counter <= n; counter++)
  {
   System.out.println("Enter a number: ");
   num = console.nextInt(); 
   if (num == 0)
   zeros++;
   else if (num % 2 == 0)
   evens++;
   else
   odds++;
  }
  System.out.printf("There are %d even numbers, and %d odd numbers and %d zeros...", evens, odds, zeros);
 }
 
}  
