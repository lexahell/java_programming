package lab8.task7;

public class Task7 {
    public static void main(String[] args) {
        int n = 255; // Замените это число на ваше натуральное число
        printSimpleDividers(n, 2);
    }

    public static void printSimpleDividers(int n, int divisor) {
        if (n <= 1) {
            return;
        }

        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            printSimpleDividers(n / divisor, divisor);
        } else {
            printSimpleDividers(n, divisor + 1);
        }
    }
}
