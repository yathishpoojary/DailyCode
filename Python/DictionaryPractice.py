# Simple Contact Book

contacts = {}

while True:
    print("\n Options: 1-Add, 2-Search, 3-Exit, 4-Delete")
    choice = int(input("Enter your choice: "))

    if choice ==1:
        name = input("Enter the name")
        phone = int(input("Enter the phone number"))
        contacts[name]= phone
        print(f"Added {name} with the phone {phone} number")

    elif choice == 2:
        name = input("Enter the name")
        if(name in contacts):
         print(f" {name} number is {contacts[name]}")
        else:
         print("name not found")
    elif choice == 3:
        break






