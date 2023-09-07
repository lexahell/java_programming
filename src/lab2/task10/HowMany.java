package lab2.task10;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова для подсчета: ");
        String input = scanner.nextLine();
        String[] inputArr = input.split(" +");
        System.out.println("Вы ввели: " + inputArr.length + " слова");
    }
}
