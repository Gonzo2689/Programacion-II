package Ecuaciones_Cuadraticas;

import java.util.Scanner;

public class ProgramacionModular {
    public static double getDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double getRaiz1(double a, double b, double c) {
        return (-b + Math.sqrt(getDiscriminante(a, b, c))) / (2 * a);
    }

    public static double getRaiz2(double a, double b, double c) {
        return (-b - Math.sqrt(getDiscriminante(a, b, c))) / (2 * a);
    }

    public static void resolver(double a, double b, double c) {
        double discriminante = getDiscriminante(a, b, c);

        if (discriminante > 0) {
            double r1 = getRaiz1(a, b, c);
            double r2 = getRaiz2(a, b, c);
            System.out.println("La ecuacion tiene dos raices: " + r1 + " y " + r2);
        } else if (discriminante == 0) {
            double r = getRaiz1(a, b, c);
            System.out.println("La ecuacion tiene una raiz: " + r);
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        resolver(a, b, c);
    }
}
