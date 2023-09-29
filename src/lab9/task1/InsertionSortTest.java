package lab9.task1;


import java.util.Arrays;

public class InsertionSortTest {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            int j = i;
            Student value = students[i];

            while (j > 0 && students[j-1].getIdNumber() > value.getIdNumber()){
                students[j] = students[j - 1];
                j--;
            }
            students[j] = value;
        }
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student(150, "Вася"),
                new Student(113, "Михаил"),
                new Student(134, "Иван"),
                new Student(123, "Кирилл"),
                new Student(200, "Анатолий"),
                new Student(124, "Инокентий"),
                new Student(199, "Кузьма"),
                new Student(100, "Адам")
        };
        insertionSort(students);
        for (Student student : students){
            System.out.println(student);
        }
    }
}
