package lab8.task5;

import java.util.Scanner;

public class Task5{

    static Scanner scanner = new Scanner(System.in);
    public static int sumOfDigits(int N) {
        if (N == 0) {
            return 0;
        } else {
            int lastDigit = N % 10;
            int remainingDigits = N / 10;
            return lastDigit + sumOfDigits(remainingDigits);
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите натуральное число:");
        int n;
        n = scanner.nextInt();
        int sum = sumOfDigits(n);
        System.out.println("Сумма цифр числа " + n + " равна " + sum);
    }
}