package aplicacion1;
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("Iniciando juego normal");
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3);
        juego.juega();
    }
}

