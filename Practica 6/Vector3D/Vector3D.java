package vector3d;
public class Vector3D {
    private double x;
    private double y;
    private double z;
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D resultado(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }
    public Vector3D resultado(double escalar) {
        return new Vector3D(escalar * x, escalar * y, escalar * z);
    }
    public double resultado() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public Vector3D resultado(String tipo) {
        if (tipo.equalsIgnoreCase("normalizar")) {
            double mag = resultado();
            if (mag == 0) return new Vector3D(0, 0, 0);
            return new Vector3D(x / mag, y / mag, z / mag);
        }
        return null;
    }
    public double resultado(Vector3D other, boolean escalar) {
        return x * other.x + y * other.y + z * other.z;
    }
    public Vector3D resultado(Vector3D other, int dummy) {
        return new Vector3D(
            y * other.z - z * other.y,
            z * other.x - x * other.z,
            x * other.y - y * other.x
        );
    }
    public String toString3Dec() {
        return String.format("(%.3f, %.3f, %.3f)", x, y, z);
    }
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1.0, 2.0, 3.0);
        Vector3D b = new Vector3D(4.0, 5.0, 6.0);
        double r = 2.0;
        Vector3D suma = a.resultado(b);                         
        Vector3D escalar = a.resultado(r);                      
        double magnitud = a.resultado();                        
        Vector3D normalizado = a.resultado("normalizar");      
        double prodEscalar = a.resultado(b, true);              
        Vector3D prodVectorial = a.resultado(b, 0);  
        System.out.println("a) Suma de dos vectores a y b: c = a + b = " + suma.toString3Dec());
        System.out.println("b) Multiplicacion de un escalar r por el vector a: b = r * a = " + escalar.toString3Dec());
        System.out.println("c) Longitud de un vector a: |a| = " + String.format("%.3f", magnitud));
        System.out.println("d) Normal de un vector a: b = a / |a| = " + normalizado.toString3Dec());
        System.out.println("e) Producto escalar de a * b = " + String.format("%.3f", prodEscalar));
        System.out.println("f) Producto vectorial de a X b = " + prodVectorial.toString3Dec());
    }
}
