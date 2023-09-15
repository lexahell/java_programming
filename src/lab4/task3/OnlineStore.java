package lab4.task3;

import java.util.ArrayList;

public class OnlineStore {
    private ArrayList<User> users;
    private ArrayList<Catalog> catalogs;
    private User currentUser;
    private Cart cart;

    public OnlineStore(){
        users = new ArrayList<>();
        catalogs=new ArrayList<>();
        cart = new Cart();
    }
    public void addUser(User user){
        users.add(user);
    }
    public void addCatalog(Catalog catalog){
        catalogs.add(catalog);
    }
    public ArrayList<Catalog> getCatalogs(){
        return catalogs;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCurrentUser(User user){
        currentUser = user;
    }
    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.authenticate(username, password)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }
    public void checkout() {
        if (currentUser == null) {
            System.out.println("Пользователь не аутентифицирован. Войдите в аккаунт для оформления заказа.");
            return;
        }
        Cart cart = getCart();
        double total = cart.Total();
        if (total == 0.0) {
            System.out.println("Корзина пуста. Добавьте товары перед оформлением заказа.");
            return;
        }
        cart.clear(); // Очищаем корзину
        System.out.println("Заказ успешно оформлен.");
    }
}
