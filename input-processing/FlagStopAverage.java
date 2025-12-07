import java.util.*;
public class FlagBoolean
{
public static void main(String [] args)
{
Scanner console = new Scanner (System.in);
boolean stop;
char answer;
int value, sum, count;
double avg;
sum = 0;
count = 0;
stop = false;
while (!stop)
{
System.out.print("Enter a value: ");
value = console.nextInt();
count++;
sum = sum + value;
System.out.print("Do you want to stop?? if yes, type Y.");
answer = console.next().charAt(0);
if (answer == 'Y' || answer == 'y')
stop = true;
}
avg = (double)sum / count;
System.out.println("The average of all the values you entered is: " + avg);
}
}
