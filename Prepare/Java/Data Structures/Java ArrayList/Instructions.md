[]: # Title: Java Arraylist
[]: # Check: https://www.hackerrank.com/challenges/java-arraylist/problem

### Problem Statement

Sometimes it's better to use dynamic size arrays. Java's ArrayList can provide you this feature. Try to solve this problem using ArrayList.

You are given `n` lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in position `k` of `line`.

Take your input from `System.in`.

### Input Format
The first line has an integer `n`. In each of the next `n` lines there will be an integer denoting the number of integers on that line, followed by space-separated integers. In the next line, there will be an integer `q` denoting the number of queries. Each query will consist of two integers `i` and `j`.

### Constraints
- Each number will fit in a signed integer.
- Total number of integers in `n` lines will not exceed `10^6`.

### Output Format
For each query, output the number located in position `j` of `i` line. If there is no such position, just print "ERROR!"

### Sample Input

```
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
```

### Sample Output

```
74
52
37
ERROR!
ERROR!
```

### Explanation

The diagram below is the representation of the data:

```java
1: 41 77 74 22 44
2: 37 34 36 52
3: 20 22 33
4:
5:
```

The first query is for the line number 1 and the position 3, which is 74.
The second query is for the line number 3 and the position 4, which is 52.
The third query is for the line number 3 and the position 1, which is 37.
The fourth query is for the line number 4 and the position 3, and since there is no such position, the output is "ERROR!".
The fifth query is for the line number 5 and the position 5, and since there is no such position, the output is "ERROR!".

---