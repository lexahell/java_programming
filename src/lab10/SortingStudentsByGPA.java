package lab10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {

    ArrayList<Student> iDNumber = new ArrayList<>();
    private String sortingField = "GPA";
    public SortingStudentsByGPA(ArrayList<Student> iDNumber) {
        this.iDNumber = iDNumber;
    }
    public void setArray(ArrayList<Student> iDNumber) {
        this.iDNumber = iDNumber;
    }
    public void setSortingField(String sortingField) {
        this.sortingField = sortingField;
    }

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

    @Override
    public int compare(Student o1, Student o2) {
        if(sortingField.equals("GPA")) {
            return o2.getGPA() - o1.getGPA();
        }else{
            return o2.getCourse() - o1.getCourse();
        }
    }
    public static void main(String[] args) {

    }
}