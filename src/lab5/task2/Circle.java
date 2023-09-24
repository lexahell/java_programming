package lab5.task2;

import java.awt.*;

import javax.swing.*;

class Circle extends Shape {
    private int radius;

    public Circle(Color color, Point position, int radius) {
        super(color, position);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getPosition().x, getPosition().y, radius * 2, radius * 2);
    }
}
