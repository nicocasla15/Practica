def stringCompression(string):
    count = 1
    s = ""
    
    for i in range(len(string)):
        if i == 0:
          s += string[i]
        elif count > 1 and string[i] != string[i-1]:
          s += str(count)
          s += string[i]
          count = 1
        elif string[i] != string[i-1]:
          s += string[i]
        else:
          count += 1
    if count > 1:
          s+= str(count)
    return s

string = "abbcccdeefggghiiaa"
print(stringCompression(string))