package lab3.task7;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите валюту, из которой хотите конвертировать(RUB, USD, EUR): ");
        String currencyFrom = scanner.next();
        System.out.print("Введите валюту, в которую хотите конвертировать(RUB, USD, EUR): ");
        String currencyTo = scanner.next();
        System.out.print("Введите сумму, в изначальной валюте: ");
        double sum = scanner.nextDouble();
        Convertor converter = new Convertor(sum, currencyTo, currencyFrom);
        double newValue = converter.convertCurrency();
        System.out.print("Конвертированная сумма: " + newValue);
    }
}