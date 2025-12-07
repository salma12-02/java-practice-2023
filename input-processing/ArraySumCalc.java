import java.util.*;
public class Array5_Sum
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  int arraySize, i, num;
  int sum = 0;
  System.out.println("Enter the array size: ");
  arraySize = console.nextInt();
  int ARA [] = new int [arraySize];
  System.out.printf("Enter %d numbers: \n", arraySize);
  for(i = 0; i < ARA.length; i++) {
  num = console.nextInt();
  sum = sum + num;  }
  System.out.println("The sum = " + sum); 
 }
}
