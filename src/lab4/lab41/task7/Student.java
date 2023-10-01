package lab4.lab41.task7;

public class Student extends Learner{
    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        return super.toString() + ", Университет: " + university;
    }
}
