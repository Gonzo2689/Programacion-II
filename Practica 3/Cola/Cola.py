class Cola:
    def __init__(self, n):
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = -1
        self.n = n
        self.contador = 0

    def insert(self, e):
        if not self.isFull():
            self.fin = (self.fin + 1) % self.n
            self.arreglo[self.fin] = e
            self.contador += 1
        else:
            print("La cola está llena.")

    def remove(self):
        if not self.isEmpty():
            elemento = self.arreglo[self.inicio]
            self.inicio = (self.inicio + 1) % self.n
            self.contador -= 1
            return elemento
        else:
            print("La cola está vacía.")
            return None

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.inicio]
        else:
            print("La cola está vacía.")
            return None

    def isEmpty(self):
        return self.contador == 0

    def isFull(self):
        return self.contador == self.n

    def size(self):
        return self.contador


cola = Cola(5)
cola.insert(10)
cola.insert(20)
print(cola.remove())  
print(cola.peek())    
