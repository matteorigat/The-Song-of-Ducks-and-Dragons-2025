
# https://everybody.codes/event/2025/quests/4


# part 1
import sys

filename = "file.txt"
with open(filename) as f:
    l = [int(line.strip()) for line in f if line.strip()]

rot = 2025
mult = 1

for i in range(1, len(l)):
    mult *= l[i-1]/l[i]

print(mult * rot) # 11571



# part 2
import sys
import math

filename = "file.txt"
with open(filename) as f:
    l = [int(line.strip()) for line in f if line.strip()]

finalrot = 10000000000000
mult = 1

for i in range(1, len(l)):
    mult *= l[i-1]/l[i]

print(math.ceil(finalrot/mult)) # 2642706131079



#part 3
import sys

filename = "file.txt"
with open(filename) as f:
    left = []
    right = []
    for line in f:
        if  "|" in line:
            left.append(int(line.split("|")[0].strip()))
            right.append(int(line.split("|")[1].strip()))
        else:
            left.append(int(line.strip()))
            right.append(int(line.strip()))

rot = 100
mult = 1

for i in range(1, len(left)):
    mult *= right[i-1]/left[i]

print(rot * mult) # 288155272712