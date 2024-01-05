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

    public static void largestPrime(Long n) {
        System.out.println(maxPrimeFactor(n));
    }

    private static Long maxPrimeFactor(long n) {
        List<Long> factors = new ArrayList<>();
        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        return factors.get(factors.size() - 1);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Result.largestPrime(1L);
    }
}