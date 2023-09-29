package lab9.task3;

import lab9.task2.SortingStudentsByGPA;
import lab9.task2.Student;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class MergeSort {
    public static List<Student> merge(List<Student> list1 , List<Student> list2){
        List<Student> mergedList = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()){
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getGPA() >= student2.getGPA()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(25,"Иван", 130));
        list1.add(new Student(22,"Анна",  200));
        list1.add(new Student(20,"Петр",  140));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(24, "Мария", 100));
        list2.add(new Student(21, "Александр", 270));
        Collections.sort(list1,new SortingStudentsByGPA());
        Collections.sort(list2,new SortingStudentsByGPA());
        List<Student> result= merge(list1, list2);
        for (Student student: result){
            System.out.println(student);
        }
    }
}
