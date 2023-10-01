package lab4.lab41.task9;

public class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + getName());
        System.out.println("Цена: " + getPrice());
        System.out.println("Количество ножек: " + numberOfLegs);
    }
}