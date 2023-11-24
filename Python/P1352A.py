# A - Sum of Round Numbers

def isRound(n):
    if(n >= 1 and n <= 9): return True
    temp = n
    while(int(temp / 10) != 0):
        if(temp % 10 != 0): return False
        temp /= 10
    return True

def getSummands(n):
    list = []
    temp = n
    i = 0
    while(int(temp / 10) != 0):
        if(temp % 10 != 0): list.insert(0, int((temp % 10) * pow(10, i)))
        temp = int(temp / 10)
        i += 1
    list.insert(0, n - n % int(pow(10, i)))
    return list

t = int(input())
for i in range(t):
    n = int(input())
    if(isRound(n)): print(1, "\n", n)
    else:
        summands = getSummands(n)
        print(len(summands))
        for summand in summands: print(summand, end=" ")
        print()