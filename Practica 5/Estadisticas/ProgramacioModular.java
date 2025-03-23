package Estadisticas;

import java.util.Scanner;


public class ProgramacioModular {

    public static double promedio(double[] datos) {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }

    public static double desviacion(double[] datos) { 
        double prom = promedio(datos);
        double sumaCuadrados = 0;

        for (double num : datos) {
            sumaCuadrados += Math.pow(num - prom,2);
        }

        return Math.sqrt(sumaCuadrados / (datos.length - 1));
    }

    public static void mostrarResultados(double[] datos) {
        double prom = promedio(datos);
        double desv = desviacion(datos);
        System.out.printf("El promedio es %.5f%n", prom);
        System.out.printf("La desviación estándar es %.5f%n", desv);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        mostrarResultados(numeros);
    } 
}
