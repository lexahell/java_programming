package lab41.task7;


public class Learner {
    private String name;
    private int age;

    public Learner(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age;
    }
}
