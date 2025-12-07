import java.util.*;
public class GradeAvarage 
{
public static void main (String [] args)
{
Scanner console = new Scanner(System.in);
int limit, number, sum, counter;
System.out.println("Enter the number of integers in the list: ");
limit = console.nextInt();
sum = 0;
counter = 0;
System.out.println("Enter " + limit + " integers: ");
while (counter < limit)
{
number = console.nextInt();
sum = sum + number;
counter++;
}
System.out.printf("The sum of the %d numbers = %d%n", limit, sum);
System.out.printf("The avarage = %d%n", (sum / counter));
}
}
