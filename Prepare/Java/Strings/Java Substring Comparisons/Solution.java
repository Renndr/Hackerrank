import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        int largestK = k;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 0; k <= s.length(); i++){
            
            if(s.substring(i,k).compareTo(smallest) < 0){
                smallest = s.substring(i,k);
            }
            k++;
        }
        
        for(int i = 0; largestK <= s.length(); i++){
            
            if(s.substring(i,largestK).compareTo(largest) > 0){
                largest = s.substring(i,largestK);
            }
            largestK++;
        }
         
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}