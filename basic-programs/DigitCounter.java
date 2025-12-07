import java.util.*;
public class Lab12_pb2 {
    
    public static int numDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                count++; 
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String input = "I am 21 yo born in 2003";
        
        int digitCount = numDigits(input);
        
        System.out.println("Number of digits in the string: " + digitCount);
    }
}
