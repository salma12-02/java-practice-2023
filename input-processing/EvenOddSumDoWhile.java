import java.util.*;
public class NUMBERSinDoWhile
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
//a
  int FirNum, SecNum;
  int counter;
  int SumE = 0;
  int squ = 0;
  int SumSqu = 0;
  System.out.println("Enter 2 numbrs, the first must be less than the second: ");
  FirNum = console.nextInt();
  SecNum = console.nextInt();
  if (FirNum > SecNum)
  System.out.println("AGAIN!! the first MUST be less than the second: ");
//b - c
  counter = FirNum;
  do
  {
   if (counter % 2 == 0)
    SumE = SumE + counter;
    else
    {
     squ = counter * counter;
     SumSqu = SumSqu + squ;
    }
    counter++;

  }
  while (counter <= SecNum);
 System.out.println("The sum of all even numbers is = " + SumE);
 System.out.println("The sum of the squares all odd numbers = " + SumSqu);
 }
 
}
