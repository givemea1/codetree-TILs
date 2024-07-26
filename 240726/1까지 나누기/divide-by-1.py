n = int(input())

count =0
while True:
    count+=1
    n = n//count
    if n <1:
        break
    
print(count)