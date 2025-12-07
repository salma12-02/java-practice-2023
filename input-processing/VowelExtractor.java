import java.io.*;
import java.util.*;
public class Vowels2
{ 
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  String str;
  System.out.println("Enter a word: ");
  str = console.nextLine();
  OnlyVowles(str);
 }
 public static void OnlyVowles(String str)
 {
  int i, size;
  size = str.length();
  for (i = 0; i < size; i++)
  {
   if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o' || str.charAt(i) == 'E' || str.charAt(i) == 'e' || str.charAt(i) == 'U' || str.charAt(i) == 'u')
   System.out.print(str.charAt(i));
   else
   continue;
   }
 } 
}
