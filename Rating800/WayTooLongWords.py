n = int(input())

while n > 0:
    t = str(input())
    if len(t) > 10:
        newT = t[0] + str(len(t) - 2) + t[len(t) - 1]
        print(newT)
    else:
        print(t)
    n-= 1
