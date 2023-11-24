# A - Cheap Travel

n, m, a, b = [int(i) for i in input().split()]

if(n * a > n / m * b):
    specialTickets = int(n / m)
    tickets = n % m
    if(tickets * a > b):
        specialTickets += 1
        tickets = 0
else:
    specialTickets = 0
    tickets = n

finalTickets = specialTickets * b + tickets * a

print(finalTickets)
