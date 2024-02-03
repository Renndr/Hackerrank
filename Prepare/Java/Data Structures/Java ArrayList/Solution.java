import java.util.*;

public class Solution {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Number of lines
        int lines = scan.nextInt();
        
        // 2D Array
        List<List<Integer>> arr = new ArrayList<>();
        
        // Fill the 2D Array
        for (int i = 0; i < lines; i++) {
            arr.add(new ArrayList<>());
            int n = scan.nextInt();

            for (int j = 0; j < n; j++) {
                arr.get(i).add(j, scan.nextInt());
            }
        }
        
        // Number of queries
        int queries = scan.nextInt();
        
        for (int i = 0; i < queries; i++) {

            // Get the row and column
            int row = scan.nextInt();
            int column = scan.nextInt();
            
            try{
                System.out.println(arr.get(row - 1).get(column - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
                scan.nextLine();
            }
        }
        
        // Close scanner
        scan.close();
    }
}