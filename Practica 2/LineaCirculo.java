package LineaPunto;
import javax.swing.*;
import java.awt.*;

public class LineaCirculo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawLine(50, 50, 200, 50);
        g2d.drawOval(100, 100, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Línea y Círculo en Java");
        LineaCirculo panel = new LineaCirculo();
        
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}