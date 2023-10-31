package lab20.task1_3;

import java.io.Serializable;

public class Tester {
    public static void main(String[] args) {
        GenericClass<Integer, Dog, Double> myGenericInstance = new GenericClass<Integer, Dog, Double>(89, new Dog("Собака"), 3.14);

        System.out.println("T: " + myGenericInstance.getFirstVar());
        System.out.println("V: " + myGenericInstance.getSecondVar().getName());
        System.out.println("K: " + myGenericInstance.getThirdVar());

        myGenericInstance.printClassNames();
    }
    private static class Dog extends Animal implements Serializable {
        Dog(String name) {
            super(name);
        }
    }
}
