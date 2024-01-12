import java.util.*;

class Result {

    public static void indexed(String s) {
        char[] index = s.toCharArray();
        
        String even = "";
        String odd = "";
        
        for (int i = 0; i < index.length; i++) {

            if (i % 2 == 0) {
                even += Character.toString(index[i]);
            } else {
                odd += Character.toString(index[i]);
            }
        }
        String word = even + " " + odd;
        System.out.println(word);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int length = scan.nextInt();
        scan.nextLine();
        
        int i = 0;
        while(i < length){
            String s = scan.nextLine();
            Result.indexed(s);
            i++;
        }
        scan.close();
    }
}
