import java.util.*;
public class Lab12_pb4 {
    
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    
    public static void main(String[] args) {
        int num = 12345;
        
        int digitCount = countDigits(num);
        
        System.out.println("Number of digits in " + num + ": " + digitCount);
    }
}
