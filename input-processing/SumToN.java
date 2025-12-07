import java.util.*;
public class ch5p2practice2
{ 
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int num, n;
  int sum = 0;
  System.out.println("I will type the sum of all natural numbers between 1 &...?");
  n = console.nextInt();
  for (num = 1; num <= n; num++)
  {
   if (num <= n)
   sum = sum + num;
  } 
  System.out.printf("The sum of the natural numbers between 1 & %d = %d ", n ,sum);
 }

}
