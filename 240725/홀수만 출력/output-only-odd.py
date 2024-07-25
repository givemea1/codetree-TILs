arr = input().split()

a=int(arr[0])
b=int(arr[1])

for i in range(a,b+1):
    if i==1 :
        print(i, end=" ")
    if i%3==0:
        print(i, end=" ")