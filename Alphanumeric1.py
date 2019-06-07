num=input()
x=y=0
for i in num:
  if i.isalpha():
    x+=1
  elif i.isnumeric():
    y+=1
if x>=1 and y>=1:
  print("Yes")
else:
  print("No")
