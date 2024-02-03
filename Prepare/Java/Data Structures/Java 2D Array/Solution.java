import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    
    private int maxSum = Integer.MIN_VALUE;

    public void LargestSum(List<List<Integer>> arr) {
        // Calculate the sum of each hourglass
        hourglassSum(arr);

        // Print the largest sum
        System.out.println(maxSum);
    }

    private void hourglassSum(List<List<Integer>> arr) {
        // Calculate number of rows and columns
        int rows = arr.size();
        int columns = arr.get(0).size();

        for (int i = 0; i < rows - 2; i++) {

            for (int j = 0; j < columns -2; j++){
                // Calculate the sum of the current hourglass
                int tempSum = 0;

                // Hourglass top
                tempSum += arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);

                // Hourglass middle
                tempSum += arr.get(i + 1).get(j + 1);

                // Hourglass bottom
                tempSum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                
                if(tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }
        }
    } 
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    
        Result result = new Result();
        result.LargestSum(arr);
    }
}