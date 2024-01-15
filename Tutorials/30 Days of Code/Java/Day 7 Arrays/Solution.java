import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    
    public static void reversedList(List<Integer> list, int n) {
        
        List<Integer> reversed = new ArrayList<Integer>();
        
        for(int i = n-1; i >= 0; i--){
            reversed.add(list.get(i));
        }
        
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int number : reversed){
            stringBuilder.append(number).append(" ");
        }
        
        System.out.println(stringBuilder.toString());
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        
        Result.reversedList(arr, n);
    }
}

//Solution 2

/*class Result {
    
    public static void reversedList(List<Integer> list, int n) {
        
        List<Integer> reversed = new ArrayList<Integer>();
        
        for(int i = n-1; i >= 0; i--){
            reversed.add(list.get(i));
        }
        
        StringJoiner joiner = new StringJoiner(" ");
        reversed.forEach(number -> joiner.add(String.valueOf(number)));
        
        System.out.println(joiner);
    }
} */

//Solution 3

/*
 * public class Result {

    public static void reversedList(List<Integer> list, int n) {
        List<Integer> reversed = new ArrayList<>(list.subList(0, n));
        List<Integer> sublist = list.subList(0, n);
        reversed.addAll(sublist);
        StringJoiner joiner = new StringJoiner(" ");
        reversed.forEach(number -> joiner.add(String.valueOf(number)));
        System.out.println(joiner.toString());
    }
}
 */

//Solution 4

/*class Result {
    
    public static void reversedList(List<Integer> list, int n) {
        
        Collections.reverse(list);
    
        StringJoiner joiner = new StringJoiner(" ");
        list.forEach(number -> joiner.add(String.valueOf(number)));
        
        System.out.println(joiner);
    }
} */