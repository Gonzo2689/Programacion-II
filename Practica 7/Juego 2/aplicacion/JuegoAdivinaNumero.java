package aplicacion;
import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas, 0);
    }

    public boolean validaNumero(int n) {
        return n >= 0 && n <= 10;
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        reiniciaPartida();
        numeroAAdivinar = rand.nextInt(11);

        System.out.println("Adivina un numero entre 0 y 10");

        while (true) {
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Numero invalido, intenta de nuevo");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    System.out.println("Fallaste. El numero es " +
                        (intento < numeroAAdivinar ? "mayor" : "menor") + ". Intenta de nuevo");
                } else {
                    System.out.println("Te quedaste sin vidas");
                    break;
                }
            }
        }
    }
}
