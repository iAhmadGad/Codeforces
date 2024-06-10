# A - Remove Smallest

t = int(input())
while t:
    n = input()
    a = [int(i) for i in input().split()]
    a.sort()
    b = True
    for i in range(1, len(a)):
        if abs(a[i] - a[i - 1]) > 1:
            b = False
            print("NO")
            break
    if b:
        print("YES")
    t -= 1
