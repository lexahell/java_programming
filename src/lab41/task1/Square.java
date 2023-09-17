package lab41.task1;

import static java.lang.Math.pow;

public class Square extends Shape{
    private double sideLength;
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    public String getType() {
        return "квадрат";
    }
    public double getSideLength() {
        return this.sideLength;
    }
    public double getArea() {
        return pow(this.sideLength, 2);
    }
    public double getPerimeter() {
        return 4 * this.sideLength;
    }
    public String toString() {
        return "Это " + this.getType();
    }
}
