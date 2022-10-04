def busquedaBinaria(num):
    l = 0
    r = len(num) -1
    
    while l <= r:
        m = int((l+r)/2)
        
        if num[m] < numABuscar:
            l = m+1
        elif num[m] > numABuscar:
            r = m-1
        elif num[m] == numABuscar:
            return m
    return -1

num = [1,3,5,6,7,8,9,44,66]
numABuscar = 6
print(busquedaBinaria(num))