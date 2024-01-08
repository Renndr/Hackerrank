#!/bin/python3

def solve(number):
    
    if number % 2 == 0 and (6 > number or number > 20):
        print("Not Weird")
    else:
        print("Weird")
    

if __name__ == '__main__':
    N = int(input().strip())
    solve(N)