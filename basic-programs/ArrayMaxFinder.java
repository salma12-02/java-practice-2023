import java.util.*;
public class Array6_MAXI
{
 public static void main(String [] args)
 {
  int i;
  int[] nums = {28, 86, 84, 74, 92, 15, 8};
  int max = nums [0];
  for (i = 1; i < nums.length; i++)
  {
   if (nums [i] > max)
   max = nums [i];
  }
  System.out.printf("The maximum value is = %d", max);
 }
}
