package lab4.lab41.task9;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> inventory;

    public FurnitureShop() {
        inventory = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        inventory.add(furniture);
    }

    public void displayInventory() {
        System.out.println("Инвентарь магазина мебели:");
        for (Furniture item : inventory) {
            item.displayInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair = new Chair("Стул A", 50.0, 4);
        Table table = new Table("Стол B", 100.0, 6);
        Sofa sofa = new Sofa("Диван C", 300.0, true);

        shop.addFurniture(chair);
        shop.addFurniture(table);
        shop.addFurniture(sofa);

        shop.displayInventory();
    }
}
