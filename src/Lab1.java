import java.util.Scanner;

public class Lab1{
    public Scanner scanner = new Scanner(System.in);
    public void start1(){
        System.out.println("Введите длину массива:");

        int len1 = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int[] arr = new int[len1];
        int sum = 0;
        for (int i = 0; i < len1;i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        double sr = (double) sum / len1;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + sr);
    }
    public void start2(){
        System.out.println("Введите длину массива:");
        int lenArr = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int[] arr = new int[lenArr];
        int sum = 0;
        int min;
        int max;
        int i = 0;
        do{
            arr[i] = scanner.nextInt();
            i++;

        }while(i < arr.length);
        min = arr[0];
        max = arr[0];
        int j = 0;
        while(j < arr.length){
            sum+= arr[j];
            if (arr[j]<min){
                min = arr[j];
            }
            else if(arr[j]>max){
                max=  arr[j];
            }
            j++;
        }
        System.out.println("Сумма равна: " + sum);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
    public void start3(String[] args){
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
    public void start4(){
        double result = 0;
        System.out.println("Первые 10 чисел гармонического ряда: ");
        for (int i = 1; i<11;i++){
            result = (double)1/i;
            System.out.printf("%.3f%n",result);
        }
    }
    public void start5() {
        class MathMethod {
            public  static void factorial(int num){
                int result = 1;
                if (num < 0){
                    System.out.println("Число должно быть неотрицательным");
                    return;
                }
                for (int i = 2;i<=num;i++){
                    result *= i;
                }
                System.out.println("Факториал равен: " + result);
            }
        }
        System.out.println("Введите число факториал, которого необходимо вычислить");
        int num = scanner.nextInt();
        MathMethod.factorial(num);
    }
}