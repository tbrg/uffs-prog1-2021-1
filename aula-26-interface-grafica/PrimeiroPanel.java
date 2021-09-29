import javax.swing.*;
import java.awt.*;

class PrimeiroPanel extends JPanel {
    // Atributos
    Color color = Color.BLUE;

    // Metodos
    @Override
    public void paintComponent(Graphics graphics) {
        if (color == Color.ORANGE) {
            color = Color.BLUE;
        }
        else {
            color = Color.ORANGE;
        }

        graphics.setColor(color);
        graphics.fillRect(20, 50, 100, 100);
    }
}

