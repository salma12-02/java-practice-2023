import java.util.*;
public class GradeInSwitch
{
public static void main(String [] args)
{
Scanner console = new Scanner(System.in);
char grade;

System.out.println("Enter your grade in letters: ");
grade = console.next().charAt(0);

switch (grade)
{
case 'A':
System.out.println("Pass");
break;
case 'B':
System.out.println("Pass");
break;
case 'C':
System.out.println("Pass");
case 'D':
System.out.println("Pass");
case 'E':
System.out.println("Fail");
break;
default:
System.out.println("Worng grade");
}
}
}

