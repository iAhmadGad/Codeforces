# A - Sum

t = int(input())

for i in range(t):
    x = [int(j) for j in input().split()]
    x.sort()
    if(x[2] == x[0] + x[1]): print("YES")
    else: print("NO")
