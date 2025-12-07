import java.util.*;
public class aWord 
{ 
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  String str;
  char ch;
  int index = 0;
  System.out.println("Enter a single word: ");
  str = console.next();
  do
  {
   ch = str.charAt(index);
   System.out.println(ch);
   index++; 
  }
  while (index < str.length()); 
 }
 
}
