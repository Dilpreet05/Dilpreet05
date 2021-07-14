x = 0
y = 0

while(x < 6):
        y=0
        while(y < 11):
                print("*", end = "")
                y+=1

        
        print("")
        x+=1



width = int(input("\nPlease enter a width value from 1 to 25 : "))
height = int(input("Please enter a height value from 1 to 11 : "))

count1 = 0
count2 = 0

while (height > count2):

        count1 = 0

        while (width > count1):

                print("*", end = "")
                count1+=1

        print("")
        count2+=1