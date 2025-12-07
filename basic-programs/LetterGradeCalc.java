import java.util.*;
public class Lab12_pb3 {
    
    public static char letterGrade(int grade) {
        if (grade < 0 || grade > 100) {
            return '*'; 
        } else if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    public static void main(String[] args) {
        int testGrade = 85;
        
        char gradeLetter = letterGrade(testGrade);
        
        System.out.println("The letter grade for " + testGrade + " is: " + gradeLetter);
    }
}
