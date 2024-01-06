#!/bin/python3

import math
import os
import random
import re
import sys

def weirdTest(number):
    if number % 2 != 0 or (number >= 6 and number <= 20):
        print("Weird")
    else:
        print("Not Weird")
    

if __name__ == '__main__':
    n = int(input().strip())
    weirdTest(n)