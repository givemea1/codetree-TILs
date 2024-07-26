n = int(input())

for i in range(1,n):
    if i % 10 == 3 or i%10 == 6 or i % 10 == 9:
        print(0, end=" ")
    elif i // 10 == 3 or i // 10 == 6 or i//10 == 9:
        print(0, end=" ")
    else:
        print(i,end=" ")