import random
print("-- Rock Paper Scissors --\n")
user = str.lower(input("What do you pick? "))
game = ['rock', 'paper', 'scissors']
my_str = random.choice(game)
print(my_str)