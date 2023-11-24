# A - Buy a Shovel

k, r = [int(i) for i in input().split()]
quantity = 1
cost = k

while(cost % 10 != 0 and (cost - r) % 10 != 0):
    cost += k
    quantity += 1

print(quantity)