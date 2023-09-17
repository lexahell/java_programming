package lab41.task1;


public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(50.0);
        Rectangle rectangle = new Rectangle(22.4, 12.4);
        Square square = new Square(123.1);

        System.out.println(circle);
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println();

        System.out.println(rectangle);
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println();

        System.out.println(square);
        System.out.println("Площадь: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());
        System.out.println();
    }
}

