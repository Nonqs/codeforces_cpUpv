cn = True
c = 0
a = []
a2= []
while cn == True:
    n = input().split()
    if not n:
        cn = False
    else:
        a.append(int(n[0]))
        a2.append(int(n[1]))

a = sorted(a)
a2 = sorted(a2)

for i in range(len(a)):
    c += abs(a[i] - a2[i])
    
print(c)

#Part 2

t = 0
for x in a:
    t += a2.count(x) * x
    
print(t)