import java.util.*;
 public class AllEvenNums
 {
  public static void main(String [] args)
  {
  Scanner console = new Scanner(System.in);
  int num = 0;
  int n;
  System.out.println("Till which number?");
  n = console.nextInt();
  while (num <= n)
   { 
    if (num % 2 == 0) {
    System.out.println(num); }
    num++;
   } 
  }
 }
