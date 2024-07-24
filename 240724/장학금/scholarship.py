arr = input().split()

a = int(arr[0])
b = int(arr[1])

if a!=100 and b<90:
    print('C')
elif b>=95:
    print(100000)
else:
    print(50000)