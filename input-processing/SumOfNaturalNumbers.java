import java.util.*;
public class NaturalNums
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int sum = 0;
  int num, i, n;
  System.out.println("How many numbers will you enter? ");
  n = console.nextInt();
  for (i = 0; i < n; i++)
  {
   System.out.println("Enter a number: ");
   num = console.nextInt();
   if (num >= 0)
   sum = sum + num;
  }
 System.out.printf("The sum of -all and only- natural numbers is %d", sum);

 }
 
}
