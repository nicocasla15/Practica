def pare(string):
    count = 0
    for i in string:
        if i == "(":
            count += 1
        elif i == ")":
            count -= 1
    return abs(count)

string = "()()"
print(pare(string))