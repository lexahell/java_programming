package lab4.task3;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> items;

    public Cart(){
        items = new ArrayList<>();
    }
    public void addItem(Product product){
        items.add(product);
    }
    public ArrayList<Product> getItems() {
        return items;
    }
    public double Total(){
        double total = 0;
        for (Product item: items){
            total += item.getPrice();
        }
        return total;
    }
    public void clear(){
        items.clear();
    }
}
