def mingle(stringp,stringq):
    newString = ""
    if len(stringp) > len(stringq):
        n = len(stringp)
    else:
        n = len(stringq)

    for i in range(n):
        if i >= len(stringp):
            newString += stringq[i]
        elif i < len(stringp):
            newString += stringp[i] + stringq[i]

    
    for i in range(len(stringp)):
        if stringp[i] == "a":
            print("La letra " +stringp[i]+ " aparece por primera vez en la posicion: "+str(i))
            
    return newString
    
stringp = "abc"
stringq = "pqrst"
n = 0
print(mingle(stringp,stringq))