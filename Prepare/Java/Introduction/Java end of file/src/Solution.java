import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int n = 1;
        while (sc.hasNext()) {
            String p = sc.nextLine();
            System.out.println(n + " " + p);
            n++;
        }
    }
}      