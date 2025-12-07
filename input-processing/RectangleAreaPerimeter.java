import java.util.*;

public class Lab3_pb1
{

static Scanner console = new Scanner(System.in);
public static void main(String[]args)
{

System.out.println("Enter the length");
double length = console.nextDouble();
System.out.println("Enter the width");
double width = console.nextDouble();
double area = length * width;
double perimeter = 2*(length + width);
System.out.println("The area is:"+ area);
System.out.println("The perimeter is:"+ perimeter);
}

}
