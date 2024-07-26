arr = input().split()

a = int(arr[0])
b = int(arr[1])
s=1
for i in range(a,b+1):
    s*=i

print(s)