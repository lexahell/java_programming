package lab4.lab41.task9;

public class Sofa extends Furniture {
    private boolean isSleeper;

    public Sofa(String name, double price, boolean isSleeper) {
        super(name, price);
        this.isSleeper = isSleeper;
    }

    @Override
    public void displayInfo() {
        System.out.println("Диван: " + getName());
        System.out.println("Цена: " + getPrice());
        System.out.println("Спальное место: " + (isSleeper ? "Да" : "Нет"));
    }
}
