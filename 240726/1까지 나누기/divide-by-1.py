n = int(input())

count =1 
while True:
    n = n//count
    if n <1:
        break
    count+=1
print(count)