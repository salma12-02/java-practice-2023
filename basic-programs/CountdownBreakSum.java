import java.util.*;
public class BCInWhile
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int num = 12;
  int sum = 0;
  while (num >= 0)
  {
   if (num % 5 == 0)
   break;
   System.out.print(num + " ");
   sum = sum + num;
   num = num - 1;
  }
  System.out.println();
  System.out.print("sum = " + sum);
 }
 
}  
