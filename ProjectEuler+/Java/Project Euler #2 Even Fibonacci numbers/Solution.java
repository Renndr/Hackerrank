import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void euler(long n) {
        System.out.println(fibonacciSumOfEvens(n));
    }

    private static long fibonacciSumOfEvens(long n) {
        long fibonacci1 = 1;
        long fibonacci2 = 1;
        long sum = 0;

        while (fibonacci2 <= n) {
            if (fibonacci2 % 2 == 0) {
                sum += fibonacci2;
            }

            long temp = fibonacci1;
            fibonacci1 = fibonacci2;
            fibonacci2 = temp + fibonacci2;
        }

        return sum;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());
                Result.euler(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}