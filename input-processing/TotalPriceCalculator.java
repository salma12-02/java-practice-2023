import java.util.*;
public class CalculatingThePrice
{
public static void main(String [] args)
{
Scanner console = new Scanner(System.in);
double product1, product2, product3;
System.out.printf("Enter the first product price:%n");
product1 = console.nextDouble();
System.out.printf("Enter the second product price:%n");
product2 = console.nextDouble();
System.out.printf("Enter the third product price:%n");
product3 = console.nextDouble();
final double tax;
tax = 0.1;
double TotalPrice;
TotalPrice = product1 + product2 + product3;
double Tax;
Tax = TotalPrice * (0.1);
double TotalPriceWithTax;
TotalPriceWithTax = Tax + TotalPrice +1;
System.out.printf("The total price with tax is: %.2f",TotalPriceWithTax);
}
}
