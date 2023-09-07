package lab2.task3;

public class Circle{
    private Point a;
    private double radius = 0.0;

    public Circle(double x, double y, double radius){
        this.a = new Point(x, y);
        this.radius = radius;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Circle{ x = " + a.getX()+ ", y = " + a.getY() + ", radius = " + radius + "}";
    }
}
