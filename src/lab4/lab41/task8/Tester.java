package lab4.lab41.task8;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        Rectangle rectangle = new Rectangle(10, 25);
        Square square = new Square(1);

        circle.setColor("Зеленый");
        rectangle.setColor("Серый");
        square.setColor("Черный");

        rectangle.setFilled(true);
        square.setFilled(false);

        System.out.println("Круг: " + circle.toString());
        System.out.println("Прямоугольник: " + rectangle.toString());
        System.out.println("Квадрат: " + square.toString());

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Периметр квадрата: " + square.getPerimeter());
    }
}
