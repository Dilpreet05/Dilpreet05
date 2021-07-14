x = int(input("Enter an integer : "))

y = int(input("Enter another : "))

print("You entered are", x,"and", y, end = ".\n\n")

if x > 0:
        print("The number", x, "is positive.")
else: 
        print("The number", x, "is negative")

if y > 0:
        print("The number", y, "is positive.", end = "\n\n")
else: 
        print("The number", y, "is negative.", end = "\n\n")


if x % 2 == 0:
        print("The number", x, "is even.")
else: 
        print("The number", x, "is odd.")

if y % 2 == 0:
        print("The number", y, "is even.", end = "\n\n")
else: 
        print("The number", y, "is odd.", end = "\n\n")


if x > y:
        print("The number", x, "is larger than", y, end = ".\n")
else:
        print("The number", y, "is larger than", x, end = ".\n")


if x % y != 0 or y % x != 0:
        print("The numbers are not divisible")
else:
        if x % y == 0:
                print("The number", x, "is divisible by", y, end = ".\n")
                print(x, "/", y, "=", (x/y))

        if y % x == 0:
                print("The number", y, "is divisible by", x, end = ".\n")
                print(y, "/", x, "=", (y/x))


