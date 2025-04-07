package aplicacion1;
public class Juego {
    private int numeroDeVidas;
    private int record;

    public Juego(int vidas, int recordInicial) {
        this.numeroDeVidas = vidas;
        this.record = recordInicial;
    }

    public void reiniciaPartida() {
        numeroDeVidas = 3;
    }

    public void actualizaRecord() {
        record++;
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}
