import math

class Estadisticas:
    def __init__(self, datos):
        self.datos = datos

    def promedio(self):
        suma = 0
        for num in self.datos:
            suma += num
        return suma / len(self.datos)

    def desviacion(self):
        promedio = self.promedio()
        sumas = 0

        for num in self.datos:
            sumas += math.pow(num - promedio, 2)

        return math.sqrt(sumas / (len(self.datos) - 1))

    def mostrar(self):
        print("El promedio es %.5f" % self.promedio())
        print("La desviacion estandard es %.5f" % self.desviacion())

def main():
    entrada = input()
    numeros = list(map(float, entrada.split()))

    e1 = Estadisticas(numeros)
    e1.mostrar()

if __name__ == "__main__":
    main()
