import java.util.*;
public class VOWELSforLoop
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  String str1;
  int index;
  char ch;
  int counter = 0;
  System.out.println("Enter a word: ");
  str1 = console.next();
  str1 = str1.toLowerCase();
  for(index = 0; index < str1.length(); index++)
  {
   ch = str1.charAt(index);
   switch (ch) 
   {
   case 'a':
   case 'e':
   case 'i':
   case 'o':
   case 'u':
   counter++;
   }
  }
  System.out.println("The number of vowels: "+ counter);
 
 } 
}
