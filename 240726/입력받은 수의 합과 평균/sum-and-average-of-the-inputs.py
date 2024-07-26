n = int(input())
s=0
for i in range(n):
    num = int(input())
    s+=num
print("%d %.1f"%(s,s/n))