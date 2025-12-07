import java.util.*;
public class Lab12_pb1 {
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static void main(String[] args) {
        String input = "My Name";
        int vowelCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                vowelCount++; 
            }
        }
        
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
