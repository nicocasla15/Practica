def busquedaBinaria(num):
    cont = 0
    izquierda = 0
    derecha = len(num) -1
    
    while izquierda <= derecha:
        medio = int((izquierda+derecha)/2)
        cont +=1
        
        if num[medio] < numABuscar:
            izquierda = medio+1
        elif num[medio] > numABuscar:
            derecha = medio-1
        elif num[medio] == numABuscar:
            print(cont)
            return medio


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