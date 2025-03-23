import math

def getDiscriminante(a, b, c):
    return b * b - 4 * a * c

def getRaiz1(a, b, c):
    return (-b + math.sqrt(getDiscriminante(a, b, c))) / (2 * a)

def getRaiz2(a, b, c):
    return (-b - math.sqrt(getDiscriminante(a, b, c))) / (2 * a)

def resolver(a, b, c):
    discriminante = getDiscriminante(a, b, c)

    if discriminante > 0:
        r1 = getRaiz1(a, b, c)
        r2 = getRaiz2(a, b, c)
        print("La ecuación tiene dos raíces: " + str(r1) + " y " + str(r2))
    elif discriminante == 0:
        r = getRaiz1(a, b, c)
        print("La ecuación tiene una raíz: " + str(r))
    else:
        print("La ecuación no tiene raíces reales")

def main():
    print("Ingrese a, b, c: ")
    entrada = input()
    a, b, c = map(float, entrada.split())

    resolver(a, b, c)

if __name__ == "__main__":
    main()
