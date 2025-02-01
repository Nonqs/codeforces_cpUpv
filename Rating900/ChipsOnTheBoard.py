t = int(input())

while t > 0:
    n = int(input())
    
    arr = input().split(" ")
    a = [int(token) for token in arr]
    
    arr = input().split(" ")
    b = [int(token) for token in arr]
    
    minA = 0
    minB = 0
    
    for i in range(n):
        if minA == 0 or minA > a[i]:
            minA = a[i]
        if minB == 0 or minB > b[i]:
            minB = b[i]

    sumA = 0
    sumB = 0
    
    for i in range(n):
        sumA += a[i] + minB
        sumB += b[i] + minA
    
    print(min(sumA,sumB))
  
    t-=1