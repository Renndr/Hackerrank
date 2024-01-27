import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        String s = scan.nextLine();
        scan.close();
        
        // Write your code here.
        
        String[] tokens = s.trim().split("[\\s\\p{Punct}]+");
        
        int value = s.trim().isEmpty() ? 0 : tokens.length;
        
        System.out.println(value);
        
        for (String token : tokens){
            System.out.println(token);
        }
        
    }
}