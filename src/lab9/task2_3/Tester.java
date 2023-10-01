package lab9.task2_3;

public class Tester {
    private static int partition(Student[] arr, int begin, int end) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        Student pivot = arr[(begin+end)/2];
        int i = begin;
        int j = end;
        while(true){
            while (comparator.compare(arr[i],pivot) > 0)
            {
                i++;
            }
            while (comparator.compare(arr[j],pivot) < 0)
            {
                j--;
            }
            if (i >= j){
                return j;
            }
            Student temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void quickSort(Student[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (comparator.compare(l[i], r[j]) <= 0) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    private static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    private static Student[] joinArrays(Student[] a, Student[] b){
        Student[] students = new Student[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            students[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            students[a.length+i] = b[i];
        }
        return students;
    }
    public static void main(String[] args) {
        Student[] students = new Student[7];
        students[0] = new Student(120, "Адам",300);
        students[1] = new Student(250, "Кирилл",223);
        students[2] = new Student(1, "Вася",123);
        students[3] = new Student(3, "Женя",234);
        students[4] = new Student(45, "Катя",0);
        students[5] = new Student(2, "Софья",100);
        students[6] = new Student(100, "Инокентий",99);
        for (Student student: students){
            System.out.println(student);
        }
        System.out.println();
        System.out.println("После быстрой сортировки: ");
        quickSort(students, 0, students.length - 1);
        for (Student student: students){
            System.out.println(student);
        }
        // 4 задание
        Student[] students1 = new Student[5];
        students1[0] = new Student(121, "",301);
        students1[1] = new Student(251, "Кирилл",232);
        students1[2] = new Student(12, "Вася",124);
        students1[3] = new Student(32, "Женя",246);
        students1[4] = new Student(56, "Катя",1);
        System.out.println();
        System.out.println("Массив для объединения: ");
        for (Student student: students1){
            System.out.println(student);
        }
        Student[] joined = joinArrays(students, students1);
        System.out.println();
        System.out.println("Массив объединеный: ");
        for (Student student: joined){
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Отсортированный объединеный массив: ");

        mergeSort(joined, joined.length);
        for (Student student: joined){
            System.out.println(student);
        }
    }
}
