import java.io.*;
import java.util.*;
public class EvenOdd 
{ 
 static Scanner console = new Scanner(System.in);
 public static void main(String [] args)
 {
  double n; // I wrote double in case the user entered a double number, and if the user entered an integer that's fine because double can take integer
  System.out.println("Enter a number: ");
  n = console.nextDouble();
  CheckEvenOdd(n); 
 }
 public static void CheckEvenOdd(double n)
 {
  if (n % 2 == 0)
  System.out.printf("%.1f is even.", n);
  else 
  System.out.printf("%.1f is odd.", n);
 }
   
}
 
