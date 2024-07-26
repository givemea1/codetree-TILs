n = int(input())
s=0
for i in range(n):
    num=int(input())
    if num % 2 !=0 and num%3==0:
        s+=num
print(s)