import java.io.*;

class Result {
    
    public static void consecutiveNumbers(int n){
        
        String binary = Integer.toBinaryString(n);
             
        int value = 0;
        int temp = 0;
                
        for(int i = 0; i <= binary.length()-1; i++){
            
            if(binary.charAt(i) == '1'){
                temp ++;
                value = Math.max(value, temp);
            }else {
                temp = 0;
            }
        }
        System.out.println(value);
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        Result.consecutiveNumbers(n);
    }
}