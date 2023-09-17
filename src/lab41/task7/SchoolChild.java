package lab41.task7;

public class SchoolChild extends Learner{
    private int numberOfClass;

    public SchoolChild(String name, int age, int numberOfClass) {
        super(name, age);
        this.numberOfClass = numberOfClass;
    }

    public int getNumberOfClass() {
        return this.numberOfClass;
    }

    @Override
    public String toString() {
        return super.toString() + ", Класс: " + this.numberOfClass;
    }
}
