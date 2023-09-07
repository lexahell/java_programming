package lab1;

import lab1.Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task_number = 1;
        System.out.println("Введите номер практической работы: ");
        if(!scanner.hasNextInt()){
            System.out.println("Ошибка ввода!");
            return;
        }
        task_number = scanner.nextInt();
        switch (task_number) {
            case (1):
                Lab1 obj = new Lab1();
                obj.start1();
                obj.start2();
                obj.start3(args);
                obj.start4();
                obj.start5();
                break;
            case (2):

            default:
                System.out.println("Работа еще не сделана или введён неверный номер");
        }
    }
}