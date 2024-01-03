import java.util.*;

class Result{
    
    public static void area (int breadth, int height){
        if(breadth > 0 && height >0){
            System.out.println(breadth * height);
        }
        else{
            System.out.println(new java.lang.Exception("Breadth and height must be positive"));
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.close();
        
        Result.area(b,h);
    }
}