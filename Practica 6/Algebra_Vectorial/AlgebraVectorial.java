package algebra_vectorial;
import java.util.Scanner;
public class AlgebraVectorial {
    private double[] a;
    private double[] b;

    public AlgebraVectorial(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }
    public boolean verificar(double[] suma, double[] resta) {
        double normaSuma = Math.sqrt(suma[0]*suma[0] + suma[1]*suma[1] + suma[2]*suma[2]);
        double normaResta = Math.sqrt(resta[0]*resta[0] + resta[1]*resta[1] + resta[2]*resta[2]);
        return Math.abs(normaSuma - normaResta) < 1e-6;
    }
    public boolean verificar(double[] ab, double[] ba, int dummy) {
        double norma1 = Math.sqrt(ab[0]*ab[0] + ab[1]*ab[1] + ab[2]*ab[2]);
        double norma2 = Math.sqrt(ba[0]*ba[0] + ba[1]*ba[1] + ba[2]*ba[2]);
        return Math.abs(norma1 - norma2) < 1e-6;
    }
    public boolean verificar() {
        double productoEscalar = a[0]*b[0] + a[1]*b[1] + a[2]*b[2];
        return Math.abs(productoEscalar) < 1e-6;
    }
    public boolean verificar(double[] suma) {
        double sumaCuadrado = suma[0]*suma[0] + suma[1]*suma[1] + suma[2]*suma[2];
        double normaA = a[0]*a[0] + a[1]*a[1] + a[2]*a[2];
        double normaB = b[0]*b[0] + b[1]*b[1] + b[2]*b[2];
        return Math.abs(sumaCuadrado - (normaA + normaB)) < 1e-6;
    }
    public boolean verificar(double escalar) {
        if (b[0] == 0 || b[1] == 0 || b[2] == 0) return false;
        double r1 = a[0]/b[0];
        double r2 = a[1]/b[1];
        double r3 = a[2]/b[2];
        return Math.abs(r1 - r2) < 1e-6 && Math.abs(r1 - r3) < 1e-6;
    }
    public boolean verificar(boolean paralelo) {
        double x = a[1]*b[2] - a[2]*b[1];
        double y = a[2]*b[0] - a[0]*b[2];
        double z = a[0]*b[1] - a[1]*b[0];
        return Math.abs(x) < 1e-6 && Math.abs(y) < 1e-6 && Math.abs(z) < 1e-6;
    }
    public String proyeccion() {
        double dot = a[0]*b[0] + a[1]*b[1] + a[2]*b[2];
        double normaB2 = b[0]*b[0] + b[1]*b[1] + b[2]*b[2];
        double escalar = dot / normaB2;
        return String.format("g) Proyeccion de a sobre b: (%.3f, %.3f, %.3f)", escalar*b[0], escalar*b[1], escalar*b[2]);
    }
    public String componente() {
        double dot = a[0]*b[0] + a[1]*b[1] + a[2]*b[2];
        double normaB = Math.sqrt(b[0]*b[0] + b[1]*b[1] + b[2]*b[2]);
        return String.format("h) Componente de a en b: %.3f", dot / normaB);
    }
   public void mostrar() {
    double[] suma = {a[0] + b[0], a[1] + b[1], a[2] + b[2]};
    double[] resta = {a[0] - b[0], a[1] - b[1], a[2] - b[2]};
    double[] ab = resta;
    double[] ba = {b[0] - a[0], b[1] - a[1], b[2] - a[2]};
    System.out.println("a) Perpendicular. Si el vector a es ortogonal o perpendicular a b: |a + b| = |a - b| es " + verificar(suma, resta));
    System.out.println("b) Perpendicular. Si el vector a es mutuamente ortogonal a b: |a - b| = |b - a| es " + verificar(ab, ba, 0));
    System.out.println("c) Perpendicular. Si el vector a es ortogonal a b: a * b = 0 es " + verificar());
    System.out.println("d) Perpendicular. Si el vector a es ortogonal a b: |a + b|^2 = |a|^2 + |b|^2 es " + verificar(suma));
    if (verificar(suma, resta) && verificar(ab, ba, 0) && verificar() && verificar(suma)) {
        System.out.println("Por lo tanto, los vectores a y b son perpendiculares.");
        System.out.println();
    } else {
        System.out.println("Por lo tanto, los vectores a y b NO son perpendiculares.");
        System.out.println();
    }
    System.out.println("e) Paralela. Si el vector a es paralela a b: a = rb es " + verificar(0.0));
    System.out.println("f) Paralela. Si el vector a es paralela a b: a X b = 0 es " + verificar(true));

    if (verificar(0.0) && verificar(true)) {
        System.out.println("Por lo tanto, los vectores a y b son paralelos.");
        System.out.println();
    } else {
        System.out.println("Por lo tanto, los vectores a y b NO son paralelos.");
        System.out.println();
    }
    System.out.println(proyeccion());
    System.out.println(componente());
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[3];
        double[] b = new double[3];

        System.out.println("Ingrese el vector a:");
        for (int i = 0; i < 3; i++) a[i] = sc.nextDouble();

        System.out.println("Ingrese el vector b:");
        for (int i = 0; i < 3; i++) b[i] = sc.nextDouble();

        AlgebraVectorial av = new AlgebraVectorial(a, b);
        av.mostrar();
    }
}
