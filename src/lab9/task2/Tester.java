package lab9.task2;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(120, "Вася",300));
        students.add(new Student(250, "Вася",220));
        students.add(new Student(1, "Вася",240));
        students.add(new Student(3, "Вася",100));
        students.add(new Student(45, "Вася",0));
        students.add(new Student(2, "Вася",290));
        students.add(new Student(100, "Вася",199));
        Collections.sort(students, new SortingStudentsByGPA());

        for (Student student: students){
            System.out.println(student);
        }
    }
}
