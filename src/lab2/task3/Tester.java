package lab2.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    static Scanner scanner = new Scanner(System.in);

    ArrayList<Circle> circles = new ArrayList<Circle>();
    public int count_objects = 0;
    public Tester(){}
    public Tester(ArrayList<Circle> circles){
        this.circles = circles;
        this.count_objects = circles.size();
    }
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<Circle>();
        System.out.println("Введите количество элементов:");
        int count = scanner.nextInt();
        for (int i = 0; i < count;i++) {
            double x, y, radius;
            System.out.println("Введите x, y и radius через пробел:");
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            radius = scanner.nextDouble();
            circles.add(new Circle(x, y, radius));
        }
        for(Circle circle:circles) {
            System.out.println(circle.toString());
        }
    }
}
