arr = input().split()

a = int(arr[0])
b = int(arr[1])

if a==100 and b>=95:
    print(100000)
elif a==100 and b>=90:
    print(50000)
else:
    print(0)