package lab3.task8;

import java.util.*;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Создаем карту товаров и их цен в долларах
        Map<String, Double> products = new HashMap<>();
        products.put("Iphone 10", 650.0);
        products.put("MacBook Air 13” with M1 chip", 999.0);
        products.put("Ipad Pro", 799.0);

        System.out.println("Доступные товары: ");
        int i = 0;
        for (String productName : products.keySet()) {
            System.out.println(++i + ") "  +productName);
        }
        int indexSelectProduct;
        while (true){
            System.out.println("Введите номер товара, который вы хотите купить: ");
            if(!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода! (нужно ввести только номер товара)");
                scanner.nextLine();
            }
            indexSelectProduct = scanner.nextInt()-1;
            if (indexSelectProduct >= 0 && indexSelectProduct<products.size()){
                break;
            }
            System.out.println("Ошибка ввода! (Товара с таким номером нет)");
        }
        while (true){
            System.out.println("Введите валюту, в которой отобразить цену выбранного товара(USD, RUB, EUR): ");
            String currency = scanner.next();
            if (!Objects.equals(currency, "RUB") && !Objects.equals(currency,"EUR") && !Objects.equals(currency,"USD")){
                System.out.println("Такая валюта не подходит!");
                continue;
            }
            String keySelect = (String) products.keySet().toArray()[indexSelectProduct];
            System.out.println(keySelect);
            Convertor convertor = new Convertor((double) products.get(keySelect),currency,"USD");

            double priceInCurrency = convertor.convertCurrency();
            System.out.println("Цена товара: " + priceInCurrency + " " + currency);
            break;
        }
    }
}
