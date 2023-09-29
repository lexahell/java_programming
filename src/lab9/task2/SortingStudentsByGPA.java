package lab9.task2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGPA() > student2.getGPA()){
            return -1;
        } else if(student1.getGPA() < student2.getGPA()){
            return 1;
        }
        else {
            return 0;
        }
    }
}
