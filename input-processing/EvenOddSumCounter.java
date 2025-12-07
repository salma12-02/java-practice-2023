import java.util.*;
public class Lab9_pb2
{
public static void main(String [] args)
{
Scanner console = new Scanner(System.in);
int num;
int sumeven=0;
int sumodd=0;
int counter;
int N;
System.out.println("Please enter how many integers you have");
N = console.nextInt();
counter = 1;
while (counter <= N)
{
System.out.println("Enter "+N+" integers");
num=console.nextInt();
if (num % 2 == 0)
sumeven = sumeven + num;
else
sumodd = sumodd + num;
counter++;
}
System.out.println("Even sum is: "+sumeven);
System.out.println("Odd sum is: "+sumodd);
}
}
