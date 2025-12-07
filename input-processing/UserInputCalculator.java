import java.util.Scanner;                  //a

public class tut3_ex1
 {
public static void main(String []args)
  {
Scanner console = new Scanner(System.in);   //b

final int SECRET = 11;                      //c
final double RATE = 12.5;

int num1, num2, newNum;                     //d
String name;
double hoursWorked, wages;

System.out.println("Enter two numbers");     //e
num1 = console.nextInt();
num2 = console.nextInt();

System.out.println("The value of num1 =" + num1 + "The value of num2 =" + num2);   //f

newNum = num1 * 2 + num2;                     //g

newNum = newNum + SECRET;                     //h
System.out.println("The value of newNum =" + newNum);

System.out.println("Enter your last name");    //i
name = console.next();

System.out.println("Enter your worked hours (between 0 and 70)");    //j
hoursWorked = console.nextDouble();

wages = RATE * hoursWorked;                     //k

System.out.println("Name:" + name);             //l
System.out.println("pay rate: $" + RATE);             
System.out.println("Hours Worked:" + hoursWorked);             
System.out.println("Salary:" + wages);             
     }
  }



