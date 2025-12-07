import java.util.*;
public class Lab1pb1Trying {
public static void main(String [] args) {
Scanner console = new Scanner(System.in);
int N, num, i;
int pro = 1;
int countFive = 0;
System.out.println("How many numbers r u gonna enter: ");
N = console.nextInt();
System.out.printf("Enter %d numbers:\n", N);
for (i = 0; i < N; i++) {
num = console.nextInt();
if (num % 2 == 1)
pro = pro * num;
else if (num % 5 == 0)
countFive++; }
System.out.println("product of all odd numbers = " + pro);
System.out.println("count of all numbers divisable by 5 = " + countFive);
}
}
