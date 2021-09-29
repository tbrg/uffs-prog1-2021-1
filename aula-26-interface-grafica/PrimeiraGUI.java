import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PrimeiraGUI {
    // Atributos
    private JButton textButton;
    private JButton colorButton;
    private PrimeiroPanel panel;

    // Metodos
    public void executa() {
        JFrame frame = new JFrame();

        textButton = new JButton("Clique aqui");
        colorButton = new JButton("Mudar cor");

        TextButtonListener textButtonListener = new TextButtonListener();
        ColorButtonListener colorButtonListener = new ColorButtonListener();

        textButton.addActionListener(textButtonListener);
        colorButton.addActionListener(colorButtonListener);

        panel = new PrimeiroPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, textButton);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.NORTH, colorButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class TextButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            textButton.setText("Fui clicado");
        }
    }

    class ColorButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            panel.repaint();
        }
    }
}

