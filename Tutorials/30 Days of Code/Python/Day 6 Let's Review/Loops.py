def indexed(s):
    even = ""
    odd = ""
    
    for i in range(0, len(s)):
        
        if i % 2 == 0:
            even += s[i]
        else:
            odd += s[i]
            
    print(even + " " + odd)

if __name__ == '__main__':
    n = int(input())
    i = 0
    
    while i < n:
        s = input()
        indexed(s)
        i += 1