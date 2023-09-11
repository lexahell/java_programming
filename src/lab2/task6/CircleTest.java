package lab2.task6;

import java.util.Scanner;

public class CircleTest {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты центра первой окружности:");
        System.out.print("x = ");
        double x1 = scanner.nextDouble();
        System.out.print("y = ");
        double y1 = scanner.nextDouble();
        System.out.print("Введите радиус первой окружности: ");
        double radius1 = scanner.nextDouble();
        Circle circle1 = new Circle(x1, y1, radius1);
        System.out.println("Введите координаты центра второй окружности:");
        System.out.print("x = ");
        double x2 = scanner.nextDouble();
        System.out.print("y = ");
        double y2 = scanner.nextDouble();
        System.out.print("Введите радиус второй окружности: ");
        double radius2 = scanner.nextDouble();
        Circle circle2 = new Circle(x2, y2, radius2);
        Circle.compareCircles(circle1, circle2);
    }
}