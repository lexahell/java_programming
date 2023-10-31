package lab20.task4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Integer[] integers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        MinMax<Integer> minMaxInteger = new MinMax<>(integers);
        System.out.println("Min: " + minMaxInteger.findMin());
        System.out.println("Max: " + minMaxInteger.findMax());

        double a;
        double b;
        System.out.print("Enter 1 number: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        System.out.print("Enter 2 number: ");
        b = scanner.nextDouble();
        System.out.println("Sum: " + Calculator.sum(a, b));
        System.out.println("Multiply: " + Calculator.multiply(a, b));
        System.out.println("Divide: " + Calculator.divide(a, b));
        System.out.println("Subtract: " + Calculator.subtract(a, b));
    }
}
