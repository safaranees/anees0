binaryvalue=input()
b=0
for i in binaryvalue:
    if(0<=int(i)<=1):
        b+=1
if(int(len(binaryvalue))==b):
    print("yes")
else:
    print("no")
