import java.util.*;
import java.io.*;
public class Lab13_pb 
{ 
 public static void main(String [] args) throws FileNotFoundException 
 {
  PrintWriter outFile = new PrintWriter ("myOutFile.txt");
  // Declare appropriate variables
  int number;
  int minNum;
  int sumN;
  double averageN;
  int numCount = 0;
  int [] A = new int [100];
  numCount = ReadList (A);
  PrintList(A, numCount);
  
  minNum = Smallest(A, numCount);
  System.out.println("Smallest number is " + minNum);
  
  sumN = SumOfN(A, numCount);
  System.out.println("Sum of numbers: " + sumN);
  
  averageN = Average(A, numCount);
  System.out.println("Average of numbers " + averageN);
  
  // Write Smallest, sumN, and average to myOutFile.dat
  outFile.printf("Smallest Number: %-6d%nSum of Numbers: %-10d%n Average of Numbers: %-10.2f%n", minNum, sumN, averageN);
  outFile.close();
 }
 // Method to read from Numbers.txt
 public static int ReadList(int [] dataList) throws FileNotFoundException 
 {
  Scanner inFile = new Scanner(new FileReader("Numbers.txt"));
  int numCount = 0;
  int num;
  while (inFile.hasNext()) {
  dataList [numCount] = inFile.nextInt();
  numCount++;
 }
 inFile.close();
 return numCount;
 }
 // End of ReadList
 public static void PrintList (int [] dataList, int count) 
 {
  int index;
  for (index = 0; index < count; index++)
  System.out.println(dataList [index]);
 }
 // End of PrinList
 public static int Smallest(int [] dataList, int count)
 {
  int minN = dataList [0];
  int index;
  for (index = 1; index < count; index++)
  {
   if (minN >  dataList[index])
   minN = dataList [index];
  }
  return minN;
 }
 // End of Smallest
 public static int SumOfN (int [] dataList, int count)
 {
  int sum = 0;
  int index;
  for (index = 0; index < count; index++)
  {
   sum += dataList [index];
  }
  return sum;
 }
 // End of SumOfN
 public static double Average (int [] dataList, int count)
 {
  double avg;
  avg = SumOfN(dataList, count) / (double)count;
  return avg;
 }
 // End of SumOfN
}
// End of program

 
