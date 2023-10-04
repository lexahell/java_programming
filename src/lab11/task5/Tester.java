package lab11.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        Random random = new Random();
        for(int i = 0; i <= 10000000; i++) {
            list1.add(random.nextInt(100000));
            list2.add(random.nextInt(100000));
        }
        CompareCollections comparator = new CompareCollections();
        System.out.println("Операция вставки: ");
        System.out.println("\tArrayList: " + comparator.insertionOperation(list1) + " мс");
        System.out.println("\tLinkedList: " + comparator.insertionOperation(list2) + " мс");
        System.out.println("----------------");
        System.out.println("Операция удаления: ");
        System.out.println("\tArrayList: " + comparator.deleteOperation(list1) + " мс");
        System.out.println("\tLinkedList: " + comparator.deleteOperation(list2) + " мс");
        System.out.println("----------------");
        System.out.println("Операция добавления: ");
        System.out.println("\tArrayList: " + comparator.addingOperation(list1) + " мс");
        System.out.println("\tLinkedList: " + comparator.addingOperation(list2) + " мс");
        System.out.println("----------------");
        System.out.println("Операция поиска по образцу: ");
        System.out.println("\tArrayList: " + comparator.sampleSearchOperation(list1) + " мс");
        System.out.println("\tLinkedList: " + comparator.sampleSearchOperation(list2) + " мс");
    }
}
