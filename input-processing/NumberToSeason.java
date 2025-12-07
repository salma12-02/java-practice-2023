import java.util.*;
public class DoWhileNumSeason
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int num;
  System.out.println("Enter a number between 1 & 4: ");
  num = console.nextInt();
  if (num < 1 || num > 4)
  {
   System.out.println("AGAIN..Enter a number between 1 & 4: ");
   num = console.nextInt();
  }
  do 
  {
   if (num == 1)
   System.out.println("1 is Fall");
   else if (num == 2)
   System.out.println("2 is Winter");
   else if (num == 3)   
   System.out.println("3 is Spring");
   else if (num == 4)
   System.out.println("4 is Summer");
  } while (num < 1 || num > 4); 

}
}
