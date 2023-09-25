package lab6.task3;

interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}


class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Planet mars = new Planet("Марс");
        Car myCar = new Car("Toyota supra");
        Animal cat = new Animal("Кот");

        System.out.println("Имя планеты: " + mars.getName());
        System.out.println("Имя моей машины: " + myCar.getName());
        System.out.println("Имя животного: " + cat.getName());
    }
}