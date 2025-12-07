import java.util.*;
public class Score {
public static void main(String [] args) {
Scanner console = new Scanner(System.in);
int count = 0;
int num;
do {
System.out.println("Enter valid test score greater than zero or equal zero and less than 100: ");
num = console.nextInt();
if (num < 0) {
System.out.println("Incorect test score value. Try again.");
count++; }
else if (num > 100) {
System.out.println("Incorect test score value. Try again.");
count++; }
else {
System.out.println("correct test score");
break; }
} while (count <= 3);
if (count > 3)
System.out.println("you have exceeded the number of attempts. The test score you have entered is not vaild");
}
}
