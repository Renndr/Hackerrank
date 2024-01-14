if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    singleLine = " ".join(map(str, reversed(arr)))

    print(singleLine)


# Another solution:
    
#     if __name__ == '__main__':
#     n = int(input().strip())

#     arr = list(map(int, input().rstrip().split()))
#     arr.reverse()
#     singleLine = ""
    
#     i = 0
    
#     for number in arr:
        
#         if i == len(arr):
#             singleLine += str(number)
#         else:
#             singleLine += str(number) + " "
        
#         i += 1
            
#     print(singleLine)