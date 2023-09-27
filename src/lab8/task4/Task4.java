package lab8.task4;
public class Task4 {
    public static int countNumbers(int k, int s, boolean first) {
        if (k == 0 && s == 0) {
            return 1;
        }
        if (k == 0) {
            return 0;
        }
        int totalCount = 0;
        int start = first?1:0;
        for (int digit = start; digit <= 9; digit++) {
            if (s - digit >= 0) {
                totalCount += countNumbers(k - 1, s - digit,false);
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        int k = 2; // Количество цифр
        int s = 10; // Сумма цифр
        int result = countNumbers(k, s,true);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + result);
        k = 3;
        s = 2;
        result = countNumbers(k, s,true);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + result);
    }
}
