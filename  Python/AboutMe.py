import random
import sys

print("commands available:")
print("name\tgroup\tmood")
mood = ["happy", "nervous", "starving", "tired", "motivated"]
while True:
    command = raw_input()
    if command == "name":
        print('Musa')
    elif command == "group":
        print ('11-903')
    elif command == "mood":
        print  (random.choice(mood))
