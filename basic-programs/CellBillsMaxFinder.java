import java.util.*;
public class Array3 
{
 public static void main(String [] args)
 { 
  Scanner console = new Scanner(System.in);
double [] cellBills = new double [6];
   cellBills[0] = 45.24;
   cellBills[1] = 54.67;
   cellBills[2] = 42.55;
   cellBills[3] = 44.61;
   cellBills[4] = 65.29;
   cellBills[5] = 49.75;
   int maxIndex = 0;   
   for ( int i = 1; i < cellBills.length; i++ ) {
    if ( cellBills[i] > cellBills[maxIndex] )
      maxIndex = i;  
   }
   System.out.printf("Maximum value is: %6.2f, found at index %2d%n%n", cellBills[maxIndex], maxIndex);
 }
} 
