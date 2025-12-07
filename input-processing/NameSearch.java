import java.util.*;
public class Array7_Str
{
 public static void main(String [] args)
 {
  Scanner console = new Scanner(System.in);
  String fuser;
  boolean isEx = false;
  String [] names = new String [4];
  names [0] = "Ahmed";
  names [1] = "Khalid";
  names [2] = "Omar";
  names [3] = "Laith";
  System.out.println("Enter a name: ");
  fuser = console.nextLine();
  for (int i = 0; i < names.length; i++) 
  {
   if (fuser.equals(names [i])) {
   isEx = true;
   break; }
   }
  if (isEx == true) 
  System.out.println("Name Found.");
  
  else 
  System.out.println("Name Not Found."); 
 }
}
