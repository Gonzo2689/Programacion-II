package aplicacion;
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("Iniciando juego normal");
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        juego1.juega();

        System.out.println("\nIniciando juego de numeros pares");
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        juego2.juega();

        System.out.println("\nIniciando juego de numeros impares");
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);
        juego3.juega();
    }
}



