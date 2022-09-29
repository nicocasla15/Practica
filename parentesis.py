<<<<<<< HEAD
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

string = ")()((("
=======
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
>>>>>>> 16e302cc9e45b7454d7aee15551c7bede6a7d705
print(pare(string))