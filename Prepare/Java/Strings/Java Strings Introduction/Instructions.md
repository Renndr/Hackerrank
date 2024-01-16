# Java Strings Exercise

This exercise is designed to test your understanding of Java Strings.

A sample String declaration:

```java
String myString = "Hello World!";
```

The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the `String.length()` method.

Given two strings of lowercase English letters, `a` and `b`, perform the following operations:

1. Sum the lengths of `a` and `b`.
2. Determine if `a` is lexicographically larger than `b` (i.e., does `a` come before `b` in the dictionary?).
3. Capitalize the first letter in `a` and `b` and print them on a single line, separated by a space.

## Input Format

The first line contains a string `a`.
The second line contains another string `b`.
The strings are comprised of only lowercase English letters.

## Output Format

There are three lines of output:

1. For the first line, sum the lengths of `a` and `b`.
2. For the second line, write "Yes" if `a` is lexicographically greater than `b`; otherwise, print "No".
3. For the third line, capitalize the first letter in both `a` and `b` and print them on a single line, separated by a space.

## Sample Input 0

```
hello
java
```

## Sample Output 0

```
9
No
Hello Java
```

## Explanation 0

String `a` is "hello," and `b` is "java".

`a` has a length of 5, and `b` has a length of 4; the sum of their lengths is 9.
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, `a` is not greater than `b`, and the answer is No.

When you capitalize the first letter of both `a` and `b` and then print them separated by a space, you get "Hello Java".
```