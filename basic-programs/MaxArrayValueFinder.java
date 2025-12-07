import java.text.NumberFormat;
public class MaxArrayValue {
 public static void main( String [] args ) {
   double [] cellBills = new double [6];
   cellBills[0] = 45.24;
   cellBills[1] = 54.67;
   cellBills[2] = 42.55;
   cellBills[3] = 44.61;
   cellBills[4] = 65.29;
   cellBills[5] = 49.75;
   int maxIndex = 0;   // initialize to index of first element
   for ( int i = 1; i < cellBills.length; i++ ) {
    if ( cellBills[i] > cellBills[maxIndex] )
      maxIndex = i;  // save index of maximum value
   }
   System.out.printf("Maximum value is: %6.2f, found at index %2d%n%n", cellBills[maxIndex], maxIndex);
 }
}
