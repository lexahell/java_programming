package lab4.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Создаем экземпляр интернет-магазина
        OnlineStore onlineStore = new OnlineStore();

        // Создаем пользователей и добавляем их в магазин
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        onlineStore.addUser(user2);
        onlineStore.addUser(user1);
        System.out.println("Введите login: ");
        String inputLogin = scanner.next();
        System.out.println("Введите password: ");
        String inputPassword = scanner.next();

        boolean isLoggedIn = onlineStore.login(inputLogin, inputPassword);

        if (isLoggedIn) {
            // Создаем каталоги товаров
            Catalog electronicsCatalog = new Catalog(CatalogType.ELECTRONICS,null);
            Catalog clothingCatalog = new Catalog(CatalogType.CLOTHES,null);
            Catalog foodCatalog = new Catalog(CatalogType.FOOD,null);
            // Добавляем товары в каталоги
            Product product1 = new Product("Смартфон", 599.99);
            Product product2 = new Product("Ноутбук", 899.99);
            Product product3 = new Product("Футболка", 19.99);
            Product product4 = new Product("Овсянка", 1.99);
            electronicsCatalog.addProduct(product1);
            electronicsCatalog.addProduct(product2);
            clothingCatalog.addProduct(product3);
            foodCatalog.addProduct(product4);
            // Добавляем каталоги в магазин
            onlineStore.addCatalog(electronicsCatalog);
            onlineStore.addCatalog(clothingCatalog);
            onlineStore.addCatalog(foodCatalog);
            // Пользователь выбирает каталог
            System.out.println("Выберите каталог(CLOTHES, ELECTRONICS, FOOD): ");
            String choice = scanner.next();
            if (choice.equals("CLOTHES") || choice.equals("ELECTRONICS") || choice.equals("FOOD")) {
                for (Catalog catalog : onlineStore.getCatalogs()) {
                    if (catalog.getType().name().equalsIgnoreCase(choice)) {
                        System.out.println("Товары в выбранном каталоге:");
                        for (Product product : catalog.getProducts()) {
                            System.out.println(product.getName() + " - $" + product.getPrice());
                        }
                    }
                }
            }else{
                System.out.println("Ошибка в названии каталога:");
                return;
            }
            // Пользователь добавляет товары в корзину
            System.out.println("Введите название товара для добавления в корзину");
            String nameProduct = scanner.next();
            Cart cart = onlineStore.getCart();
            for (Catalog catalog : onlineStore.getCatalogs()) {
                if (catalog.getType().name().equalsIgnoreCase(choice)) {
                    for (Product product : catalog.getProducts()) {
                        if (product.getName().equals(nameProduct)){
                            cart.addItem(product);
                        }
                    }
                }
            }
            System.out.println("Оформить заказ?(yes/no)");
            String answer = scanner.next();
            // Выполняем оформление заказа
            if(answer.equals("yes")){
                onlineStore.checkout();
            }else{
                System.out.println("Заказ не оформлен");
            }
        }
    }
}
