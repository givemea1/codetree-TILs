s=0
cnt=0
for i in range(10):
    n = int(input())

    if 0<=n<=200:
        s+=n
        cnt+=1
print("%d %.1f"%(s,s/cnt))