arr = input().split()

c = arr[0]
n = int(arr[1])

if c=='A':
    for i in range(n):
        print(i,end=" ")
else:
    for i in range(n,0,-1):
        print(i, end=" ")