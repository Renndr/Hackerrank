import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        if(a.length() != b.length()){
            return false;
        }
        
        char[] aChar = a.toLowerCase().toCharArray();
        char[] bChar = b.toLowerCase().toCharArray();

        int count = 0;

        for (int i = 0; i < aChar.length; i++) {

            for (int j = 0; j < bChar.length; j++) {
                if (aChar[i] == bChar[j]) {
                    count++;
                    bChar[j] = '0';
                    break;
                }
            }
        }

        if (count == aChar.length) {
            return true;
        } else {
            return false;
        }
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}