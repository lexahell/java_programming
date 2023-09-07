package lab2.task8;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr;
        System.out.println("Введите элементы массива,которые необходимо расставить в обратном порядке, через пробел: ");
        arr = scanner.nextLine().split(" ");
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println( "Результат: " + Arrays.toString(arr));

    }
}
