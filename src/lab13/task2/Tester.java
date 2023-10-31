package lab13.task2;

public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person("Савчук");
        Person person2 = new Person("Иванов", "Василий","Антонович");
        System.out.println(person1.getNames());
        System.out.println(person2.getNames());
    }
}
