n = int(input())

if n%2==0:
    n = n//2
if n%2 != 0:
    n+=1
    n = n//2
print(n)