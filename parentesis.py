def pare(string):
    count = 0
    par = 0
    for i in string:
        if i == "(":
            count += 1
        elif i == ")":
            count -= 1
            if count < 0:
                par += 1
                count += 1

    return count+par

string = ")("
print(pare(string))