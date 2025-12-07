import java.util.*;
public class ch5p1sentinel
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int number;
  int sum = 0;
  int count = 0;
  System.out.println("Enter a positive integer, enging wih -999: ");
  number = console.nextInt();
  while (number != -999)
  {
   sum = sum + number;
   count++;
   number = console.nextInt();
  }
  System.out.printf("The sum of %d numbers = %d%n", count, sum);
  if (count != 0)
  System.out.printf("The average = %d%n", (sum / count));
  else 
  System.out.println("NO INPUT");
 }

}
