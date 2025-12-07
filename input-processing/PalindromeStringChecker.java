import java.io.*;
import java.util.*;
public class PalindromeString {
   public static void main(String[] args)  {
   Scanner keyboard = new Scanner(System.in);
   String myString;
   System.out.println("Enter a string: ");
   myString = keyboard.nextLine();
   if(isPalindrome(myString))
   System.out.printf("String: %s  is palindrome.", myString);
   else
   System.out.printf("String: %s  is not palindrome.", myString);
   }
   public static boolean isPalindrome(String str)  {
   int len = str.length();                   
   int i, j, mid;
   j = len - 1; 
   mid = (len -1)/2;
   for (i = 0; i <= mid; i++)  {
   if (str.charAt(i) !=  str.charAt(j))
   return false;
   j--;
      }
      return true;
      } 
      }                            
