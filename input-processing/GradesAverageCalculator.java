import java.util.*;
public class AVA
{
public static void main(String [] args)
{
Scanner console = new Scanner(System.in);
int limit, sum, num, count;
System.out.println("How many grades are you going to enter?");
limit = console.nextInt();
sum = 0;
count = 0;
System.out.println("Enter " + limit + " grades: ");
while (count < limit)
{
num = console.nextInt();
sum = sum + num;
count++;
}
System.out.println("The average of the " + limit + " grades is: " + (sum/limit) );
}
}
