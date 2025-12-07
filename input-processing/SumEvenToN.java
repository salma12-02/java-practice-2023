import java.util.*;
public class ch5p2practice3
{ 
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int n, num;
  int sum = 0;
  System.out.println("I will add all the even numbers from 1 to...?");
  n = console.nextInt();
  for(num = 1; num <= n; num++)
  {
   if (num % 2 == 0)
   sum = sum + num;
  }
  System.out.printf("The sum of all even numbers between 1 and %d = %d", n, sum);
 }
 
}
