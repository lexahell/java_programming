package lab9.task2_3;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getGPA() - student2.getGPA();
    }
}
