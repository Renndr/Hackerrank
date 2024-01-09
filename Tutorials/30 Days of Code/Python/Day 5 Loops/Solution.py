#!/bin/python3

import math
import os
import random
import re
import sys

class Solution:
    
    def loops(number):
        
        for n in range(1, 11):
            print(str(number) + " x " + str(n) + " = " + str(number * n))
            
            

if __name__ == '__main__':
    n = int(input().strip())
    Solution.loops(n)