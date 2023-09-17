package lab41.task3;

public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Владислав",19);

        person1.move();
        person1.talk();



        person2.move();
        person2.talk();
    }
}
