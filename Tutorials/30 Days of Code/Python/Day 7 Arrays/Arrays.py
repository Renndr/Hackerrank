def checkPhoneBook(name, book):
    if name in book:
        print(f"{name}={book[name]}")
    else:
        print("Not found")

if __name__ == '__main__':
    n = int(input().strip())
    
    phoneBook = {}
    
    for _ in range(n):
        entry = input().split()
        phoneBook[entry[0]] = entry[1]
    
    try:
        for _ in range(n):
            name_to_check = input().strip()
            checkPhoneBook(name_to_check, phoneBook)
    except Exception:
        pass