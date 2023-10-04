package lab12.task4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation {
    private static int currentImageIndex = 0;
    private static JLabel label;
    private static JFrame frame;
    private static String[] imagePaths = {
            "C:\\imgs\\00.png",
            "C:\\imgs\\01.png",
            "C:\\imgs\\02.png",
            "C:\\imgs\\03.png",
            "C:\\imgs\\04.png",
            "C:\\imgs\\05.png",
            "C:\\imgs\\06.png",
            "C:\\imgs\\07.png",
            "C:\\imgs\\08.png",
            "C:\\imgs\\09.png",
            "C:\\imgs\\10.png"
    };
    public static void main(String[] args) {
        frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);

        label = new JLabel();
        frame.add(label);
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateImage();
            }
        });

        timer.start();
        updateImage();
        frame.setVisible(true);
    }
    private static void updateImage() {
        if (currentImageIndex < imagePaths.length) {
            String imagePath = imagePaths[currentImageIndex];
            ImageIcon imageIcon = new ImageIcon(imagePath);
            label.setIcon(imageIcon);
            currentImageIndex++;
        } else {
            currentImageIndex = 0;
        }
    }
}