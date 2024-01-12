# Objective
Today we will expand our knowledge of strings, combining it with what we have already learned about loops. Check out the Tutorial tab for learning materials and an instructional video.

## Task
Given a string, s, of length n that is indexed from 0 to n-1, print its even-indexed and odd-indexed characters as space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

## Example
Print `abc def`.

## Input Format
The first line contains an integer, t (the number of test cases). Each line of the subsequent lines contains a string, s.

## Constraints

## Output Format
For each string s (where t), print s's even-indexed characters, followed by a space, followed by s's odd-indexed characters.

## Sample Input
```
2
Hacker
Rank
```

## Sample Output
```
Hce akr
Rn ak
```

## Explanation
**Test Case 0:**
The even indices are 0, 2, and 4, and the odd indices are 1, 3, and 5. We then print a single line of space-separated strings; the first string contains the ordered characters from s's even indices (Hce), and the second string contains the ordered characters from s's odd indices (akr).

**Test Case 1:**
The even indices are 0 and 2, and the odd indices are 1 and 3. We then print a single line of space-separated strings; the first string contains the ordered characters from s's even indices (Rn), and the second string contains the ordered characters from s's odd indices (ak).