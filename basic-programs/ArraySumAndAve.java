import java.util.*;
public class Array7_aveANDsum
{
 public static void main(String [] args)
 {
  double [] ele = {33.5, 98.1, 36.4, 84.0, 57.6};
  double ave, sum;
  sum = ele [0] + ele [1] + ele [2] + ele [3] + ele [4];
  ave = sum / 5;
  System.out.printf("The sum = %.1f and the average = %.1f", sum, ave);
 }
 
}
