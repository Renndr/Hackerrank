import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int one = scanner.nextInt();
        double two = scanner.nextDouble();
        scanner.nextLine(); // clear the buffer after reading the number
        String three = scanner.nextLine();
        
        scanner.close();

        System.out.println("String: " + three);
        System.out.println("Double: " + two);
        System.out.println("Int: " + one);
        
    }
}