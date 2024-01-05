import java.util.*;

class Result{
    
    public static void converter (int a){
        String value = String.valueOf(a);
        if(value.getClass() == String.class){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer.");
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        scanner.close();
        
        Result.converter(b);
    }
}