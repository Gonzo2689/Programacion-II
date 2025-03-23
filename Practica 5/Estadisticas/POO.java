package Estadisticas;
import java.util.Scanner;
public class POO {
    private double[] datos;

    public POO(double[] datos) {
        this.datos = datos;
    }
    
   
    
    public double promedio(){
        double suma=0;
        for(double num: datos){
            suma += num;
        }
        return suma/datos.length;
    }
    
    public double desviacion(){
        double promedio =promedio();
        double sumas=0;
        
        for(double num: datos){
            sumas += Math.pow(num-promedio, 2);
            
        }
        return  Math.sqrt(sumas / (datos.length-1));
    }
    
    public void mostrar(){
        System.out.printf("El promedio es %.5f%n",promedio());
        System.out.printf("La desviacion estandard es %.5f%n",desviacion());
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double[] numeros=new double[10];
        
        for(int i=0;i<10;i++){
            numeros[i]=scanner.nextDouble();
        }
        
        POO e1=new POO(numeros);
        
        e1.mostrar();
    }
    
}

