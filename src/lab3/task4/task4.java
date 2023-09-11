package lab3.task4;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n;
        while(true){
            if (!scanner.hasNextInt()){
                scanner.next();
                System.out.println("Ошибка ввода! Повторите ввод:");
                continue;
            }
            n = scanner.nextInt();
            if (n<0){
                System.out.println("Ошибка ввода! Повторите ввод:");
                continue;
            }
            break;
        }
        int[] arr = new int[n+1];
        for (int i = 0; i < n+1;i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int[] arr_even = new int[(n+1)/2];
        int j = 1;
        for (int i = 0; i < (n+1)/2; i++){
            arr_even[i] = arr[j];
            j+=2;
        }
        System.out.println(Arrays.toString(arr_even));
    }
}
