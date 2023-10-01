package lab10;

public class Student {
    private String firstName;
    private String lastName;
    private String specialization;
    private int course;
    private String group;
    private int GPA;

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public Student(String firstName, String lastName, String specialization, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + course + " курс " + specialization + " " +  group;
    }

}
