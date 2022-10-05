def busquedaBinaria(num):
    cont = 0
    l = 0
    r = len(num) -1
    
    while l <= r:
        m = int((l+r)/2)
        cont +=1
        
        if num[m] < numABuscar:
            l = m+1
        elif num[m] > numABuscar:
            r = m-1
        elif num[m] == numABuscar:
            print(cont)
            return m


def busquedaExhaustiva(num):
    cont = 0
    for i in range(len(num)):
        cont += 1
        if num[i] == 66:
            print(cont)
            return i


num = [1,3,5,6,7,8,9,44,66]
numABuscar = 66
print(busquedaBinaria(num))
print(busquedaExhaustiva(num))