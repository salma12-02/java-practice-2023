import java.util.*;
 public class Lab7_pb3 
 {
public static void main(String[] args) 
 {
 Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
 int firstNum;
 firstNum = scanner.nextInt();
 System.out.print("Enter the second number (greater than the first): ");
 int secondNum;
secondNum = scanner.nextInt();
 
 if (firstNum >= secondNum) {
 System.out.println("The second number must be greater than the first.");
 } else {
 int sumEven;
 sumEven = 0;
 int currentNum;
 currentNum = firstNum;
 System.out.println("Odd numbers between " + firstNum + " and " + secondNum + ":");
 while (currentNum <= secondNum) {
 
 if (currentNum % 2 != 0) {
 System.out.print(currentNum + " ");
 }
 else {
 sumEven = sumEven + currentNum;
 }
 currentNum = currentNum + 1 ;
 }
 System.out.println(); 
 
 System.out.println("Sum of even numbers between " + firstNum + " and " + secondNum + ": " + sumEven);
 }
 }
 }
