package lab7.task4;

interface MathCalculable {
    double power(double base, double exponent);
    double complexModulus(double real, double imaginary);
    double getPI();
}

// Класс MathFunc, реализующий интерфейс MathCalculable
class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public double getPI() {
        return Math.PI;
    }
}

public class Main {
    public static void main(String[] args) {
        MathCalculable mathCalc = new MathFunc();

        // Вычисление длины окружности с использованием PI из интерфейса
        double radius = 5.0;
        double circumference = 2 * mathCalc.getPI() * radius;
        System.out.println("Длина окружности: " + circumference);
    }
}