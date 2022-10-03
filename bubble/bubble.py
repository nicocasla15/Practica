def bubble(num):
    n = len(num)
    for i in range(n-1):
        for j in range(n-i-1):
            if num[j] > num[j+1]:
                numero = num[j]
                num[j] = num[j+1]
                num[j+1] = numero 
    return num

num = [4,5,9,3,8,6,7,10,2,1]
print(bubble(num))