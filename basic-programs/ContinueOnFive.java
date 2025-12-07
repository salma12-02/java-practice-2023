import java.util.*;
public class CBInWhile
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int num = 12;
  int sum = 0;
  while (num >= 0)
  {
   if (num % 5 == 0) 
   {
    num++;
    continue;
   }
   System.out.print(num + " ");
   sum = sum + num;
   num = num - 2;
  }
  System.out.println();
  System.out.print("sum = " + sum);
 }
 
}  
