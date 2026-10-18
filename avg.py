n=int(input("how many numbers? "))
n1=0
s=0
for i in range(n):
    n1=int(input(f"enter {i+1}th number: "))
    s+=n1
avg=s/n
print("average of given numbers: ",avg)
