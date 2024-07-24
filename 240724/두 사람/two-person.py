a = input().split()
b = input().split()

age1 = int(a[0])
gen1 = a[1]

age2 = int(b[0])
gen2 = b[1]

if((gen1=="M" and age1>=19) or (gen2=="M" and age2>=19) ):
    print(1)
else:
    print(0)