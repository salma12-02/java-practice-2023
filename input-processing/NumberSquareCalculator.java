import java.io.*;
import java.util.*;
public class Squaring {
public static void main(String [] args) {
Scanner console = new Scanner(System.in);
int n, Rsqu;
System.out.println("Enter a number: ");
n = console.nextInt();
Rsqu = CalculateSquare(n); 
System.out.printf("The square of %d = %d", n, Rsqu); }
public static int CalculateSquare (int n) { 
int Rsqu = n*n;
return Rsqu; }
}
