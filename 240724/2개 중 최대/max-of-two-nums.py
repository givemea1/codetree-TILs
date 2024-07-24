arr = input().split()

n1 = int(arr[0])
n2 = int(arr[1])

m = n1 if n1>n2 else n2
print(m)