import java.io.*;
import java.util.*;
public class withoutSpace
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  String str;
  System.out.println("Enter a sentence: ");
  str = console.nextLine();
  NoSpace(str);
 }
 public static void NoSpace(String str)
 {
  int i;
  int tall = str.length();
  for(i = 0; i < tall ; i++)
  {
   if (str.charAt(i) == ' ')
   continue;
   else
   System.out.print(str.charAt(i));
  }
 }
