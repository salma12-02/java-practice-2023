import java.util.*;
public class AGE {
public static void main(String [] args) {
Scanner console = new Scanner (System.in);
int age;
System.out.println("Enter your age: ");
age = console.nextInt();
if (age >= 65)
System.out.println("You're in catogory A");
else if (age > 18 && age < 65)
System.out.println("You're in catogory B");
else if (age > 0 && age < 18)
System.out.println("You're in catogory C");
else if (age <= 0)
System.out.println("You're in catogory D");
}
}
