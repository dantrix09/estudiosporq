import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("programa chachi");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("BOTON1"));
        frame.add(new JButton("BOTON2"));
        frame.add(new JButton("BOTON2"));
        frame.setVisible(true);

    }
}