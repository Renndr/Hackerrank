import java.util.Scanner;
import java.io.*;
import java.math.*;

class Result {
    
    public static String checkPrime (BigInteger n) {
      return n.isProbablePrime(10) ? "prime" : "not prime";
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        BigInteger n = scan.nextBigInteger();
        
        System.out.println(Result.checkPrime(n));
    }
}