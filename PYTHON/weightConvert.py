weight = float(input("Weight: "))
type = str.lower(input("(K)g or (L)bs: "))
if (type == "k"):
        converted = weight/.45
        print("Weight in lbs: " + str(converted))
elif type == "l":
        converted = weight*.45
        print("Weight in kg: " + str(converted))
