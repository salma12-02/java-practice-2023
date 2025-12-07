import static java.lang.Math.*;
import static java.lang.Character.*;
public class Methods1
{ 
 public static void main(String [] args)
 {
  int x;
  double u, v;
  System.out.println("Uppercase a is " + toUpperCase('a'));
  u = 4.2;
  v = 3.0;
  System.out.printf("%.1f to the power of %.1f = %.2f\n", u, v, pow(u, v));  
  System.out.printf("5 to the power of 4 = %.2f\n", pow(5, 4));  
  u = u + Math.pow(3, 3);
  System.out.printf("u = %.2f\n", u);  
  x = -15;
  System.out.printf("The absolute value of %d = %d\n", x, abs(x));  
 }
}
