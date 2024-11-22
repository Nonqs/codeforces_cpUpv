n = int(input())
t = input().split(" ")
a = [int(token) for token in t]
tL = a.count(0)
tR = a.count(1)
c = 0

while c < n:
    if a[c] == 0:
        tL -= 1
    else:
        tR -= 1

    if tL == 0 or tR == 0:
        break

    c+=1

print(c+1)