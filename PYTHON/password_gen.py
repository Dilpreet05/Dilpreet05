import random

chars = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*"

pass_len = int(input("How long would you like the password : "))
pass_amount = int(input("how many passwords would you like to create : "))
for i in range(0, pass_amount):
        password = ""
        for x in range(0, pass_len):
                pass_char = random.choice(chars)
                password+=pass_char
        print(password)