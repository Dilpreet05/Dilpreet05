COVERAGE = 350


print("--- Paint Calculator --- ")
length = float(input("\nEnter the length : "))
width = float(input("Enter the width : "))
height = float(input("Enter the height : "))
DOOR = int(input("\nHow many doors : "))
WINDOW = int(input("How mant windows : "))

totalSqFt = (length * height * 2 + width * height * 2 - (DOOR*20) - (WINDOW*15))
print("A room that is", length, "ft. long,", width, "ft. wide, and", height, "ft. tall, with", DOOR, "doors and ", WINDOW, "has a total of", totalSqFt, "square feet.")
print("You will need", (totalSqFt/COVERAGE), "gallons of paint.")