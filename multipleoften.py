number=int(input())
i=1
while number>0:
    if (number+i)%10==0:
        print(number+i)
        break
    else:
        number=number+i
