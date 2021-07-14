txt = input("Please enter your grades: ")
t = txt.split(" ")
l = list(map(int, t))
averageGrade = (sum(l) / len(l))

if (averageGrade<60):  

        print("Your grade is an F.") 
        print("Pay attention in class!") 

elif (averageGrade<66):  

        print("Your grade is a D.") 
        print("You can do this! Ask for help!") 

elif (averageGrade<70):  

        print("Your grade is a D+.") 
        print("Try Harder, you can do it!") 

elif (averageGrade<77):  

        print("Your grade is a C.") 
        print("You are doing well, but i know you can do better!") 

elif (averageGrade<80):  

        print("Your grade is a C+.") 
        print("Push a little more and you'll be well off!")  

elif (averageGrade<87):  

        print("Your grade is a B.")  
        print("You are doing well!")  

elif (averageGrade<90):  

        print("Your grade is a B+.")  
        print("Push a litter farther and you'll be amongst the greats!")  

elif (averageGrade<=100):  

        print("Your grade is a A!")        
        print("You are among the greatest of this county!")  

 