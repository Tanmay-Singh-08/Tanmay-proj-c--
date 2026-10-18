d={}
d[(1,2,3,4)]=8
d[(4,2,1)]=10
d[(1,2)]=12
Sum=0
for k in d:
    Sum+=d[k]
print(Sum)
print(d)
