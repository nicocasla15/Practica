def mingle(stringp,stringq):
    newString = ""
    for i in range(len(stringp)):
        newString += stringp[i] + stringq[i]
    return newString
    
stringp = "abcde"
stringq = "pqrst"
print(mingle(stringp,stringq))