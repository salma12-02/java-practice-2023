import java.util.*;
public class StudentsGrades {
public static void main(String [] args) {
Scanner console = new Scanner (System.in);
double grade;
System.out.println("Enter your student's grades");
grade = console.nextDouble();
if (grade >= 60)
System.out.println("Success");
else
System.out.println("Fail");
}
}
