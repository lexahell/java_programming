package lab9.task2;

public class Student {
    private int idNumber;
    private String name;
    private int GPA;

    public Student(int idNumber, String name, int GPA) {
        this.idNumber = idNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getIdNumber() {
        return idNumber;
    }
    public int getGPA() {
        return GPA;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id: " + idNumber + ", name: " + name + ", GPA: " + GPA;
    }
}
