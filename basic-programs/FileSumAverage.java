import java.io.*;
import java.util.*;
public class FileInputOutput
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner inFile = new Scanner(new FileReader("inputData.txt"));
      PrintWriter outFile = new PrintWriter("outputData.txt");
      int sumNum=0;
      double averageNum;
      int numCount=0;
      while(inFile.hasNext()){
      sumNum += inFile.nextInt();
         numCount++;
      }
      averageNum = sumNum/(double)numCount;
      System.out.println("Sum of numbers: "+ sumNum);
      System.out.println("Average of numbers: "+ averageNum);
      outFile.printf(" Sum of Numbers: %-10d%n " + " Average of Numbers: %-10.2f%n", sumNum, averageNum);
      inFile.close();
      outFile.close();
   }
}
