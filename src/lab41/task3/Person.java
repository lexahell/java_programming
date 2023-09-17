package lab41.task3;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this("Неизвестный", 0);
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void move() {
        System.out.println(this.fullName + " идет");
    }

    public void talk() {
        System.out.println(this.fullName + " говорит");
    }
}