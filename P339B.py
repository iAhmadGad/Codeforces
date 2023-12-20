# B - Xenia and Ringroad

n, m = [int(i) for i in input().split()]
time = 0
a = [int(i) for i in input().split()]
a.insert(0, 1)
for i in range(len(a) - 1):
    if(a[i] < a[i + 1]):
        time += a[i + 1] - a[i]
    elif(a[i] > a[i + 1]):
        time += n - a[i]
        time += a[i + 1]
print(time)