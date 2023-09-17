package lab41.task9;

public class Table extends Furniture {
    private int numberOfSeats;

    public Table(String name, double price, int numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол: " + getName());
        System.out.println("Цена: " + getPrice());
        System.out.println("Количество мест: " + numberOfSeats);
    }
}
