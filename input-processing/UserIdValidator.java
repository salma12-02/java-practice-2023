import java.util.*; 
public class Lab4_Pb4
{
static Scanner console = new Scanner(System.in);
public static void main(String[]args)
{
Scanner console = new Scanner(System.in);
System.out.println("Enter the user ID");
String userId = console.next();
if (userId.length() >= 6 && userId.length() <= 10) {
System.out.printf("User id:%s", userId);
} else 
System.out.println("Invalid user id.");
}
}
