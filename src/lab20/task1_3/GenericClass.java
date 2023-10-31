package lab20.task1_3;

import java.io.Serializable;


public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T firstVar;
    private V secondVar;
    private K thirdVar;
    public GenericClass(T firstVar, V secondVar, K thirdVar) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
    }

    public T getFirstVar() {
        return firstVar;
    }

    public V getSecondVar() {
        return secondVar;
    }

    public K getThirdVar() {
        return thirdVar;
    }
    public void printClassNames() {
        System.out.println("T's class name: " + firstVar.getClass().getName());
        System.out.println("V's class name: " + secondVar.getClass().getName());
        System.out.println("K's class name: " + thirdVar.getClass().getName());
    }
}
