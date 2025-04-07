package aplicacion;
import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int n) {
        if (n >= 0 && n <= 10 && n % 2 == 0) {
            return true;
        } else {
            System.out.println("Solo se permiten numeros pares entre 0 y 10");
            return false;
        }
    }

    @Override
    public void juega() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        reiniciaPartida();

        int numeroAAdivinar;
        do {
            numeroAAdivinar = rand.nextInt(11);
        } while (numeroAAdivinar % 2 != 0);

        System.out.println("Adivina un numero PAR entre 0 y 10");

        while (true) {
            int intento = sc.nextInt();

            if (!validaNumero(intento)) continue;

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
