import java.io.*;
import java.util.*;
public class Vowles
{ 
 public static void main(String [] args)
 { 
 Scanner console = new Scanner(System.in);
  String str;
  System.out.println("Enter a word: ");
  str = console.nextLine();
  NonVowels(str);
 }
 public static void NonVowels(String str)
 {
  int i, size;
  size = str.length();
  for(i = 0; i < size; i++)
  {
   if (str.charAt(i) != 'A' && str.charAt(i) != 'a' && str.charAt(i) != 'o' && str.charAt(i) != 'O' && str.charAt(i) != 'E' && str.charAt(i) != 'e' && str.charAt(i) != 'I' && str.charAt(i) != 'i' && str.charAt(i) != 'u' && str.charAt(i) != 'U')
   System.out.print(str.charAt(i));
  }
 }
}
