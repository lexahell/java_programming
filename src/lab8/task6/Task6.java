package lab8.task6;

public class Task6 {


    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }
    public static void main(String[] args) {
        int n = 137; // Замените это число на ваше натуральное число

        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}