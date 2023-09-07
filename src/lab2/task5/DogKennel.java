package lab2.task5;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class DogKennel {
    static Scanner scanner = new Scanner(System.in);
    private ArrayList<Dog> dogs = new ArrayList<Dog>();
    public DogKennel(){}
    public DogKennel(Dog[] dogs){
        this.add_dogs(dogs);
    }
    public void add_dogs(Dog[] dogs){
        this.dogs.addAll(Arrays.asList(dogs));
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + dogs +
                '}';
    }
    public static void main(String[] args) {
        DogKennel dogKennel1 = new DogKennel();

        System.out.println("Введите количество собак в питомнике");

        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка ввода!");
            return;
        }

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Введите кличку и возраст собаки");
            String name = scanner.next();
            int age = scanner.nextInt();
            Dog new_dog = new Dog(name, age);
            dogKennel1.add_dogs(new Dog[]{new_dog});
        }

        System.out.println(dogKennel1.toString());

        System.out.println("Проверка работы конструктор: ");
        Dog jack = new Dog("Jack", 5);
        Dog belka = new Dog("Belka", 4);
        Dog[] new_dogs = new Dog[2];
        new_dogs[0] = jack;
        new_dogs[1] = belka;
        DogKennel dogKennel2 = new DogKennel(new_dogs);
        System.out.println(dogKennel2.toString());


    }


}
