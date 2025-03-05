public class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;
    private int contador;

    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
        this.contador = 0;
    }

    public void insert(long e) {
        if (!isFull()) {
            fin = (fin + 1) % n;
            arreglo[fin] = e;
            contador++;
        } else {
            System.out.println("La cola está llena.");
        }
    }

    public long remove() {
        if (!isEmpty()) {
            long elemento = arreglo[inicio];
            inicio = (inicio + 1) % n;
            contador--;
            return elemento;
        } else {
            System.out.println("La cola está vacía.");
            return -1;
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return arreglo[inicio];
        } else {
            System.out.println("La cola está vacía.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return contador == 0;
    }

    public boolean isFull() {
        return contador == n;
    }

    public int size() {
        return contador;
    }

    public static void main(String[] args) {
        Cola cola = new Cola(5);
        cola.insert(10);
        cola.insert(20);
        System.out.println(cola.remove());  
        System.out.println(cola.peek());    
    }
}
