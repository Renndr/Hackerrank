import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Integer one = scan.nextInt();
        double two = scan.nextDouble();
        
        scan.nextLine(); //Clear the buffer
        
        String three = scan.nextLine();
        scan.close();
        
        System.out.println(4 + one);
        System.out.println(4.0 + two);
        System.out.println("HackerRank " + three);
    }
}
