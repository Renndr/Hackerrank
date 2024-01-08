def solve(a, b):
    integerDivision = round(a / b)
    floatDivision = a / b
    
    print(integerDivision)
    print(floatDivision)


if __name__ == '__main__':
    a = int(input())
    b = int(input())
    
    solve(a, b)