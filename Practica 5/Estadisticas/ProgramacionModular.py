import math

def promedio(datos):
    suma = 0
    for num in datos:
        suma += num
    return suma / len(datos)

def desviacion(datos):
    prom = promedio(datos)
    sumaCuadrados = 0

    for num in datos:
        sumaCuadrados += math.pow(num - prom, 2)

    return math.sqrt(sumaCuadrados / (len(datos) - 1))

def mostrarResultados(datos):
    prom = promedio(datos)
    desv = desviacion(datos)
    print("El promedio es %.5f" % prom)
    print("La desviación estándar es %.5f" % desv)

def main():
    entrada = input()
    datos = list(map(float, entrada.split()))

    
    mostrarResultados(datos)

if __name__ == "__main__":
    main()
