package lab2.task4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите названия компьютеров через пробел для заполнения массива: ");
        String input = scanner.nextLine();
        String[] computers = input.split(" ");
        Shop shop1 = new Shop(computers);
        System.out.println(shop1.toString());
        System.out.println("Введите название компьютера для добавления в магазин");
        input = scanner.next();
        shop1.add_computer(input);
        System.out.println("Введите название компьютера для удаления из магазинав");
        input = scanner.next();
        shop1.remove_computer(input);
        System.out.println(shop1.toString());
        System.out.println("Введите компьютера, который хотите найти");
        input = scanner.next();
        int index = shop1.search(input);
        if (index==-1){
            System.out.println("Компьютер не найден!");
        } else{
            System.out.println("Компьютер найден(индекс: " + index+")");
        }

    }
}
