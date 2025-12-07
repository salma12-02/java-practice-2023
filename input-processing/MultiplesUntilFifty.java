import java.util.*;
public class Multi {
public static void main(String [] args) {
Scanner console = new Scanner(System.in);
int num, result;
int count = 1;
System.out.println("Enter a number: ");
num = console.nextInt();
System.out.printf("The first 5 multiples of %d = \n", num);
while (count <= 5) {
result = num * count;
if (result >= 50)
break;
else { 
System.out.println(result);
count++; }
}
}
}
