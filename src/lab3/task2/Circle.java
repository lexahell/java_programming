package lab3.task2;

import java.util.Random;

public class Circle{
    private Point center;
    private double radius = 0.0;

    public Circle(double x, double y, double radius){
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
    public static Circle createRandomCircle() {
        Random random = new Random();
        double x = random.nextDouble() * 100;
        double y = random.nextDouble() * 100;
        double radius = random.nextDouble() * 10;
        return new Circle(x, y, radius);
    }
    @Override
    public String toString(){
        return "Circle{ x = " + center.getX()+ ", y = " + center.getY() + ", radius = " + radius + "}";
    }

}
