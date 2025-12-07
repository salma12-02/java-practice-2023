import java.io.*;
import java.util.*;
public class LargerNumberMethods
{
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double num1, num2;
      double maxNumber;
      System.out.println("Enter two numbers: ");
      num1 = keyboard.nextDouble();
      num2 = keyboard.nextDouble();
      maxNumber = larger(num1, num2);
      System.out.printf("The larger number is %.2f%n", maxNumber);
    }
    public static double larger(double x, double y){
       if (x >= y)
          return x;
       else
          return y;
   }
}             
 
