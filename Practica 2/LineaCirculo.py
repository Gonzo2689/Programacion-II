import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x}, {self.y})"
    
    def getX(self) -> float:
        return self.x
    
    def getY(self) -> float:
        return self.y

class Linea:
    def __init__(self, p1: Punto, p2: Punto):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Línea entre {self.p1} y {self.p2}"
    
    def dibujaLinea(self):
        x = [self.p1.getX(), self.p2.getX()]
        y = [self.p1.getY(), self.p2.getY()]
        plt.plot(x, y, marker='o', linestyle='-', color='r', label="Línea")
        plt.xlabel("Eje X")
        plt.ylabel("Eje Y")
        plt.legend()
        plt.grid(True)
        plt.show()

class Circulo:
    def __init__(self, centro: Punto, radio: float):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo en {self.centro} con radio {self.radio}"
    
    def dibujaCirculo(self):
        centro = (self.centro.getX(), self.centro.getY())
        radio = self.radio
        
        fig, ax = plt.subplots()
        circulo = plt.Circle(centro, radio, color='b', fill=False, linewidth=2)
        
        ax.add_patch(circulo)

        ax.set_xlim(centro[0] - radio - 2, centro[0] + radio + 2)
        ax.set_ylim(centro[1] - radio - 2, centro[1] + radio + 2)

        ax.set_aspect('equal')
        ax.set_xlabel("Eje X")
        ax.set_ylabel("Eje Y")
        plt.grid(True)
        plt.title("Dibujo del Círculo")
        plt.show()

p1 = Punto(1, 5)
p2 = Punto(7, 4)
linea = Linea(p1, p2)
print(linea)
linea.dibujaLinea()

p = Punto(7, 6)
circulo = Circulo(p, 4)
print(circulo)
circulo.dibujaCirculo()
