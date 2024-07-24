a = input().split()
b = input().split()

m1 = int(a[0])
e1= int(a[1])

m2= int(b[0])
e2= int(b[1])

if m1 == m2:
    if e1>e2:
        print('A')
    else:
        print('B')
elif m1>m2:
    print('A')
else:
    print('B')