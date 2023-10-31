package lab24.task1;

public class Tester {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        // Создаем комплексное число через фабрику
        Complex complex1 = factory.createComplex(3, 4);
        Complex complex2 = factory.createComplex(1, 2);

        // Выводим комплексные числа
        System.out.println("Complex 1: " + complex1); // Вывод: Complex 1: 3 + 4i
        System.out.println("Complex 2: " + complex2); // Вывод: Complex 2: 1 + 2i

        // Выполняем операции с комплексными числами
        int sumReal = complex1.getReal() + complex2.getReal();
        int sumImaginary = complex1.getImaginary() + complex2.getImaginary();

        System.out.println("Sum of Complex Numbers: " + sumReal + " + " + sumImaginary + "i"); // Вывод: Sum of Complex Numbers: 4 + 6i
    }
}
