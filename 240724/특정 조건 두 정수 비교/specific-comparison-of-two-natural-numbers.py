arr = input().split()

n1 = int(arr[0])
n2 = int(arr[1])

if n1 < n2:
    print(1,end=" ")
else:
    print(0,end=" ")

if n1==n2:
    print(1)
else:
    print(0)