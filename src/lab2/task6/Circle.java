package lab2.task6;

public class Circle {
    private double x;
    private double y;
    private double radius;
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius() {
        this.radius = radius;
    }
    public double calculateSquare() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
    public static void compareCircles(Circle circle1, Circle circle2) {
        if(circle1.getRadius() > circle2.getRadius()) {
            System.out.println("Первая окружность больше второй");
        } else if(circle1.getRadius() < circle2.getRadius()) {
            System.out.println("Первая окружность меньше второй");
        } else {
            System.out.println("Окружности равны");
        }
    }
}
