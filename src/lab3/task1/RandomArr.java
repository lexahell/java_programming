package lab3.task1;

import java.util.Arrays;
import java.util.Random;

public class RandomArr {
    public static void main(String[] args) {
        Random random = new Random();
        double[] arr1 = new double[(int)(Math.random() * 10) + 5];
        System.out.println("Длина массива: " + arr1.length);

        for (int i =0; i < arr1.length;i++){
            arr1[i] = random.nextDouble(100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr1));
    }
}
