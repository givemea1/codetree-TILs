cnt1 = 0
cnt2 = 0

for i in range(10):
    n = int(input())
    if n % 3 == 0 and n % 5 == 0:
        cnt1+=1
        cnt2+=1
    elif n % 3 == 0:
        cnt1+=1
    elif n % 5 == 0:
        cnt2+=1
print(cnt1,cnt2,sep=" ")