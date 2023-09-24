package lab5.task3;

import javax.swing.*;
import java.awt.*;

public class DisplayImage {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(6040, 4800);
        String imagePath = args[0];
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(imageIcon);
        frame.add(label);
        frame.setVisible(true);
    }
}
