# A - Yet Another Two Integers Problem

t = int(input())
for i in range(t):
    a, b = [int(i) for i in input().split()]
    moves = 0
    if(a < b):
        x = b - a
        a += x - x % 10
        moves += (x - x % 10) / 10
    if(a > b):
        x = a - b
        a -= x - x % 10
        moves += (x - x % 10) / 10
    if(a == b): print(int(moves))
    else: print(int(moves + 1))