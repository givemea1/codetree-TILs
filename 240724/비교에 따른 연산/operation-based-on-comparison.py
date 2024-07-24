arr = input().split()

n1 = int(arr[0])
n2 = int(arr[1])

if n1 > n2 :
    print(n1*n2)
else:
    print(n2//n1)