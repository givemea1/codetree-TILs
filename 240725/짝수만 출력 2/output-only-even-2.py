arr = input().split()

a = int(arr[0])
b = int(arr[1])

for i in range(a,b-1,-1):
    if i % 2==0 :
        print(i, end=" ")