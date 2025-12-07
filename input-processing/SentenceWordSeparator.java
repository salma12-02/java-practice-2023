import java.io.*;
import java.util.*;
public class sentence
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in); 
  String str;
  System.out.println("Enter a sentence: ");
  str = console.nextLine();
  SaperateWordsInLines(str);
 }
 public static void SaperateWordsInLines(String str)
 {
  int size, i;
  size = str.length();
  for(i = 0; i < size; i++)
  if (str.charAt(i) == ' ')
  System.out.println();
  else
  System.out.print(str.charAt(i));
 }
 
}
