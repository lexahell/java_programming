package lab4.lab41.task1;

import static java.lang.Math.pow;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public String getType() {
        return "круг";
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.PI * pow(this.radius, 2);
    }
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    public String toString() {
        return "Это " + this.getType();
    }
}
