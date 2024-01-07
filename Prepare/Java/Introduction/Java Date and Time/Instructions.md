# The Calendar Class

The `Calendar` class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on. It also facilitates the manipulation of calendar fields, such as obtaining the date of the next week.

## Task

You are given a date, and your task is to complete the method `findDay`, which returns the day of the week for that date. To simplify your task, a portion of the code has been provided in the editor.

## Example

The method should return "WEDNESDAY" as the day on that date.

![Example Image](example_image.png)

## Function Description

Complete the `findDay` function in the editor below.

`findDay` has the following parameters:

- `int month`: the month of the date.
- `int day`: the day of the date.
- `int year`: the year of the date.

Returns:

- `string`: the day of the week in capital letters.

## Input Format

A single line of input containing the space-separated month, day, and year, respectively, in the `MM DD YYYY` format.

## Constraints

## Sample Input

```
08 05 2015
```

## Sample Output

```
WEDNESDAY
```

## Explanation

The day on August 5th, 2015, was WEDNESDAY.