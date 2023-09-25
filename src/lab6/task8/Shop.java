package lab6.task8;

import lab6.task6.Printable;

public class Shop implements Printable {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    // Реализация метода print из интерфейса Printable
    @Override
    public void print() {
        System.out.println("Магазин: " + name);
    }
}
