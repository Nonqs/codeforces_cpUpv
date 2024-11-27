for f in range(int(input())):
    n = int(input())
    tk = input().split(" ")
    a = [int(token) for token in tk]
    
    c = 0
    for i in range(n):
        if a[i] < 0:
            c += 1
            a[i] = -a[i]
            
    for i in range(c):
        a[i] = -a[i]
            
    if a == sorted(a):
        print("YES")
    else:
        print("NO")
             