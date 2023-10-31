package lab21;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task21 {
    private static <E extends Number> List<E> arrToLst(E [] arr){
        List<E> lst = new ArrayList<>();
        for(E i: arr){
            lst.add(i);
        }
        return lst;
    }
    private static <E extends String> List<E> arrToLst(E [] arr){
        List<E> lst = new ArrayList<>();
        for(E i: arr){
            lst.add(i);
        }
        return lst;
    }
    public static void main(String[] args){
        //Задание 1
        String[] sarr = {"ABC","def","GHI"};
        Integer[] iarr = {1,2,3};
        Double[] darr = {1.2,3.4,5.6};
        System.out.println(arrToLst(sarr));
        System.out.println(arrToLst(iarr));
        System.out.println(arrToLst(darr));
        //Задние 2
        UniversalClass<Integer> uni = new UniversalClass<>(iarr);
        System.out.println(uni);
        //Задние 3
        System.out.println(uni.getByInd(1));
        //Задание 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь до каталога: ");
        File dir = new File(scanner.next());
        if (dir.isDirectory() && dir.exists()){
            System.out.println(Arrays.toString(dir.list()));
        }else{
            System.out.println("Путь неверен");
        }
        //Задание 5
        System.out.println(Solution.newArrayList(1,2,3,4,5,6));
    }
}
