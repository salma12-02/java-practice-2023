import java.util.*;
public class Lab3_pb3
{

static Scanner console = new Scanner(System.in);
public static void main(String[]args)
{

int h,min,sec;
System.out.println("Enter the time in h, min, and sec");
h = console.nextInt();
min = console.nextInt();
sec = console.nextInt();
int totalTime = h * 3600 + min * 60 + sec;
System.out.println("The time in seconds is: " + totalTime);
}

}
