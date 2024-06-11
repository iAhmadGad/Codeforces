n = int(input())

goals = {}

while n:
    team = input()
    try:
        goals[team] += 1
    except KeyError:
        goals.update({team: 0})
    n -= 1

print(max(goals, key=goals.get))
