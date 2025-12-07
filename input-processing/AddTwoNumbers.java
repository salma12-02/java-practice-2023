import java.io.*;
import java.util.*;
public class Adding {
public static void main(String [] args) {
Scanner console = new Scanner(System.in);
int n1, n2, add, result;
System.out.println("Enter 2 numbers: ");
n1 = console.nextInt();
n2 = console.nextInt();
result = add(n1, n2);
System.out.printf("The sum of %d and %d = %d", n1, n2, result);
 }
public static int add(int n1, int n2)
 {
int result = n1 + n2;
return result; 
}
}
