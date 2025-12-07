import java.util.*;
public class GradeInIf
{
public static void main(String [] args)
{
Scanner console = new Scanner(System.in);
double grade;
System.out.println("Enter your grade: ");
grade = console.nextDouble();
if (grade > 90.00 && grade < 100.00)
System.out.println("You've got an A");
else if (grade > 80.00 && grade < 90.00)
System.out.println("You've got a B");
else if (grade > 70.00 && grade < 80.00)
System.out.println("You've got a C");
else if (grade > 100)
System.out.println("Wronge grade ... try agai");
else
System.out.println("You've got an F");
}
}
