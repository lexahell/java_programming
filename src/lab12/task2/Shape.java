package lab12.task2;

import java.awt.*;
public abstract class Shape {
    private Color color;
    private Point position;

    public Shape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }
    public Color getColor() {
        return color;
    }

    public Point getPosition() {
        return position;
    }
    public abstract void draw(Graphics g);
}
