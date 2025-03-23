package Ecuaciones_Cuadraticas;
import java.util.Scanner;

public class POO {
    private double a;
    private double b;
    private double c;

    public POO(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante(){
        return b*b - 4*a*c;
    }
    public double getRaiz1(){
        return (-b + Math.sqrt(getDiscriminante()))/(2*a);
    } 
    public double getRaiz2(){
        return (-b - Math.sqrt(getDiscriminante()))/(2*a);
    } 
    public void resolver(){
        double d=getDiscriminante();
        if(d>0){
            System.out.printf("La ecuacion tiene dos raices: %.6f y %.6f%n", getRaiz1(), getRaiz2());
        }
        else if(d==0){
            System.out.printf("La ecuacion tiene una raiz: %.6f%n ",getRaiz1());
        }
        else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Ingrese a, b, c: ");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        
        POO e1=new POO(a,b,c);
        e1.resolver();
    }
    
}