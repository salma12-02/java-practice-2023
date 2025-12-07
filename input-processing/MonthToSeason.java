import java.util.*;
public class Main 
{
public static void main (String [] args)
{
Scanner console = new Scanner (System.in);
int month;
String season;
System.out.println("Enter a month number: ");
month = console.nextInt();
if (month == 12 || month == 1 || month == 2)
season = "WINTER";
else if (month == 3 || month == 4 || month == 5)
season = "SPRING";
else if (month == 6 || month == 7 || month == 8)
season = "SUMMER";
else 
season = "FALL";
System.out.println(season);
}
}
