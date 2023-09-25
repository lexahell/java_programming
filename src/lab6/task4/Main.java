package lab6.task4;

interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}


class Car implements Priceable {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Ноутбук", 999.99);
        Car sedan = new Car("Седан", 25000.0);

        System.out.println("Цена " + laptop.getName() + ": $" + laptop.getPrice());
        System.out.println("Цена " + sedan.getModel() + ": $" + sedan.getPrice());
    }
}
