arr = input().split()

n1 = int(arr[0])
n2 = int(arr[1])
n3 = int(arr[2])
s = n1+n2+n3
print(s)
print(s // len(arr))

print(s-(s//len(arr)))