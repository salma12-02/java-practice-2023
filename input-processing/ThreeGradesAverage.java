import java.util.*;
public class Average1 {
public static void main(String [] args) {
Scanner console = new Scanner(System.in);
double grade1, grade2, grade3;
System.out.printf("Enter the first grade:%n");
grade1 = console.nextDouble();
System.out.printf("Enter the second grade:%n");
grade2 = console.nextDouble();
System.out.printf("Enter the third grade:%n");
grade3 = console.nextDouble();
final double gradeNum = 3;
double yourAve;
yourAve = (grade1 + grade2 + grade3)/ gradeNum;
System.out.printf("The average grade is: %.2f ", yourAve);
}
}
