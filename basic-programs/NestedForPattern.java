import java.util.*;
public class ForInFor
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int i, j;
  for (i = 1; i <= 5; i++) 
  { 
   for (j = 1; j <= i; j++)
   System.out.printf("%3d", j);
    //System.out.print("*");
    System.out.println();
  }
 }

}
