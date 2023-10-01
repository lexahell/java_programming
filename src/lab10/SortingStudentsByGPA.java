package lab10;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    ArrayList<Student> iDNumber;
    private static String sortingField = "GPA";
    public SortingStudentsByGPA(ArrayList<Student> iDNumber) {
        this.iDNumber = iDNumber;
    }

    public SortingStudentsByGPA() {

    }

    public void setArray(ArrayList<Student> iDNumber) {
        this.iDNumber = iDNumber;
    }
    public void setSortingField(String sortingField) {
        this.sortingField = sortingField;
    }

    private static int partition(ArrayList<Student> arr, int begin, int end) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        Student pivot = arr.get((begin + end) / 2);
        int i = begin;
        int j = end;
        while(true){
            while (comparator.compare(arr.get(i),pivot) > 0)
            {
                i++;
            }
            while (comparator.compare(arr.get(j),pivot) < 0)
            {
                j--;
            }
            if (i >= j){
                return j;
            }
            Student temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
    }

    private static void quickSort(ArrayList<Student> arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public static void merge(ArrayList<Student> a, ArrayList<Student> l, ArrayList<Student> r, int left, int right) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (comparator.compare(l.get(i), r.get(j)) <= 0) {
                a.set(k++, l.get(i++));
            } else {
                a.set(k++, r.get(j++));
            }
        }
        while (i < left) {
            a.set(k++, l.get(i++));
        }
        while (j < right) {
            a.set(k++, r.get(j++));
        }
    }

    private static void mergeSort(ArrayList<Student> a, int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        ArrayList<Student> l = new ArrayList<Student>();

        ArrayList<Student> r = new ArrayList<Student>();
        for (int i = 0; i < mid; i++) {
            l.add(a.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.add(i - mid, a.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    @Override
    public int compare(Student o1, Student o2) {
        if(sortingField.equals("GPA")) {
            return o1.getGPA() - o2.getGPA();
        }else if(sortingField.equals("firstName")){
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
        else{
            return o1.getCourse() - o2.getCourse();
        }
    }
    public void outArray(){
        for (Student student: iDNumber){
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", "Григорьев", "Программная инженерия", 2, "ИКБО-16-22",286));
        students.add(new Student("Иван", "Кадров", "Программная инженерия", 3, "ИКБО-12-21", 231));
        students.add(new Student("Анастасия", "Солдатова", "Прикладная информатика", 3, "ИКБО-14-21", 123));
        students.add(new Student("Софья", "Дмитриева", "Программная инженерия", 2, "ИКБО-12-22",200));
        students.add(new Student("Никита", "Иванов", "Программная инженерия", 1, "ИКБО-13-23",30));
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA(students);
        sortingStudentsByGPA.outArray();
        quickSort(students,0,students.size()-1);
        System.out.println();
        System.out.println("Сортировка по баллам: ");
        sortingStudentsByGPA.outArray();

        sortingStudentsByGPA.setSortingField("firstName");
        mergeSort(students,students.size());
        System.out.println();
        System.out.println("Cортировка по имени: ");
        sortingStudentsByGPA.outArray();

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student("Катя", "Быстрова", "Программная инженерия", 2, "ИКБО-12-22",250));
        students1.add(new Student("Валентин", "Капустин", "Прикладная математика", 1, "ИВБО-01-23",298));
        ArrayList<Student> joinedArr = new ArrayList<>();
        for (int i =0; i < students1.size() + students.size();i++){
            if(i < students.size()) {
                joinedArr.add(students.get(i));
            }
            else{
                joinedArr.add(students1.get(i-students.size()));
            }
        }

        mergeSort(joinedArr, joinedArr.size());
        sortingStudentsByGPA.setArray(joinedArr);
        System.out.println();
        System.out.println("Cортировка по имени объединненного массива: ");
        sortingStudentsByGPA.outArray();
    }
}