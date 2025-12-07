import java.util.*;
public class OneToHun {
public static void main(String [] args) {
Scanner console = new Scanner(System.in);
int counter;
System.out.println("Numbers from 1 to 100 not divisable by 5: ");
for(counter = 1; counter <= 100; counter++) {
if (counter / 5 == 0)
continue;
else
System.out.println(counter); }
}
}
