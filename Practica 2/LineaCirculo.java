package LineaCirculo;

import javax.swing.*;
import java.awt.*;

class Punto {
    public int x, y; 
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Linea {
    public Punto p1, p2; 

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Línea entre " + p1 + " y " + p2;
    }

    public void dibujaLinea(Graphics2D g2d) {
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
    }
}

class Circulo {
    public Punto centro; 
    public float radio;  

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Círculo en " + centro + " con radio " + radio;
    }

    public void dibujaCirculo(Graphics2D g2d) {
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawOval((int) (centro.x - radio), (int) (centro.y - radio), (int) (radio * 2), (int) (radio * 2));
    }
}

public class LineaCirculo extends JPanel {
    private Linea linea;
    private Circulo circulo;

    public LineaCirculo() {
        this.linea = new Linea(new Punto(50, 100), new Punto(200, 100));
        this.circulo = new Circulo(new Punto(125, 200), 50);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        linea.dibujaLinea(g2d);
        circulo.dibujaCirculo(g2d);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Línea y Círculo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.add(new LineaCirculo());
        frame.setVisible(true);
    }
}
