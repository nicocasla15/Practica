def stringCompression(string):
    count = 0
    s = ""
    
    for i in range(len(string)):
      prim = string[i]
      sec = string[i-1]

      if prim != sec:
        s += prim  
    return s   

string = "aaabaabbbccc"
print(stringCompression(string))