package lab3.task3;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random random = new Random();

        for (int i = 0; i < arr.length; i ++){
            arr[i] = random.nextInt(90) + 10;
        }
        System.out.println("Массив: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        boolean isIncreasing = true;
        for (int i = 1; i < arr.length;i++){
            if (arr[i] <= arr[i-1]){
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing){
            System.out.println("Массив является строго возрастающей последовательностью");
        }else{
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
