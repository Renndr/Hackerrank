import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        
        scan.close();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}