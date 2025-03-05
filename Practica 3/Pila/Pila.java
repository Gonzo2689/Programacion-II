package pila;
public class Pila {
    private long[] arreglo;
    private int top;
    private int n;

    public Pila(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.top = -1;
    }

    public void push(long e) {
        if (!isFull()) {
            top++;
            arreglo[top] = e;
        } else {
            System.out.println("La pila está llena.");
        }
    }

    public long pop() {
        if (!isEmpty()) {
            return arreglo[top--];
        } else {
            System.out.println("La pila está vacía.");
            return -1;
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return arreglo[top];
        } else {
            System.out.println("La pila está vacía.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == n - 1;
    }

    public static void main(String[] args) {
        Pila pila = new Pila(5);
        pila.push(10);
        pila.push(20);
        System.out.println(pila.pop());   // 20
        System.out.println(pila.peek());  // 10
    }
}
