def pairExists(x, y, z):
    return sum(sorted([x, y, z])[1:]) >= 10

t = int(input())
while t:
    a, b, c = [int(i) for i in input().split()]
    print("YES" if pairExists(a, b, c) else "NO")
    t -= 1
