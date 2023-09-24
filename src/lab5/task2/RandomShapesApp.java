package lab5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapesApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawRandomShapes(g);
            }
        };

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private static void drawRandomShapes(Graphics g) {
        Random random = new Random();
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(700);
            int y = random.nextInt(500);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int typeFig = random.nextInt(2);
            if (typeFig == 0) {
                int radius = random.nextInt(50) + 10;
                shapes.add(new Circle(color, new Point(x, y), radius));
            } else {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                shapes.add(new Rectangle(color, new Point(x, y), width, height));
            }
        }

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
