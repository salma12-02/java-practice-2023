import java.util.*;
public class NameReverseFor 
{
 public static void main (String [] args)
 {
  Scanner console = new Scanner(System.in);
  String str1;
  int index;
  char ch;
  System.out.println("Enter a word: ");
  str1 = console.next();
  for (index = str1.length()-1; index>= 0; index--)
  {
   ch = str1.charAt(index);
   System.out.print(ch);   
  }
  System.out.println(); 
 }
}
