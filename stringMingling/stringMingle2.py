def mingle(stringp,stringq):
    newString = ""
    for i in range(len(stringp)):
        newString += stringq[-i-1] + stringp[-i-1]
    for i in range(len(stringp)):
        if stringp[i] == "a":
            print("La letra " +stringp[i]+ " aparece por primera vez en la posicion: "+str(i))
            
    return newString
    
stringp = "abcde"
stringq = "pqrst"
print(mingle(stringp,stringq))