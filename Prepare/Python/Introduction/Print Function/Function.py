def sequence(n):
       
    values = ""
    for i in range(1, n+1):
        values += str(i)
    
    print(values)
    
if __name__ == '__main__':
    n = int(input())
    sequence(n)