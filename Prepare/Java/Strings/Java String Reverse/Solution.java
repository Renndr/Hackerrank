import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        
        String reversed = "";
        
        List<Character> listToReverse = new ArrayList<>();
        
        for(int i = A.length()-1; i >= 0 ; i--){
            listToReverse.add(A.charAt(i));
        }
        
        for (Character ch: listToReverse){
            reversed += ch;
        }
        
        if(A.equals(reversed)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}