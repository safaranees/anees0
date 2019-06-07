specialcharacter=input()
count=0
for i in specialcharacter:
        if (i.isdigit()!=True and i.isalpha()!=True):
                count+=1
print(count)
