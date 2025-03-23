import math

class Ecuaciones:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def getDiscriminante(self):
        return self.b * self.b - 4 * self.a * self.c

    def getRaiz1(self):
        return (-self.b + math.sqrt(self.getDiscriminante())) / (2 * self.a)

    def getRaiz2(self):
        return (-self.b - math.sqrt(self.getDiscriminante())) / (2 * self.a)

    def resolver(self):
        d = self.getDiscriminante()
        if d > 0:
            print("La ecuacion tiene dos raices: %.6f y %.6f" % (self.getRaiz1(), self.getRaiz2()))
        elif d == 0:
            print("La ecuacion tiene una raiz: %.6f" % self.getRaiz1())
        else:
            print("La ecuacion no tiene raices reales")

def main():
    print("Ingrese a, b, c: ")
    entrada = input()
    a, b, c = map(float, entrada.split())

    e1 = Ecuaciones(a, b, c)
    e1.resolver()

if __name__ == "__main__":
    main()
