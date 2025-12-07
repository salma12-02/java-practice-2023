import java.util.*;
public class Lab6_pb2
{
public static void main(String [] args)
{
Scanner console = new Scanner(System.in);
int an, minBS=0, minBC=0, curB;
char at;

System.out.println("Enter your account number: ");
an = console.nextInt();

System.out.println("Enter your account type (Enter S for saving account and C for checking account): ");
at = console.next().charAt(0);

if (at == 'S') {
System.out.println("Enter the minimum balance that your saving account should have: ");
minBS = console.nextInt();
 
} else if (at == 'C') {
System.out.println("Enter the minimum balance that your checking account should have: ");
minBC = console.nextInt();
}
System.out.println("Enter your current balance: ");
curB = console.nextInt();
 
if (minBS < curB) {
System.out.println("There is a service charge of $10.00 for your saving account because your balance is less than the minimum balance");
 
} else if (minBC < curB) {
System.out.println("There is a service charge of $25.00 for your checking account because your balance is less than the minimum balance");
 
} else if (minBS > curB) {
System.out.println("Your account is receving a 4% interest");
 
} else if (minBC > curB) {
System.out.println("Your account is receving a 5% interest");
 
} else if (curB > 5000 && minBC < curB) {
System.out.println("Your account is receving a 3% interest");
}
}
}
