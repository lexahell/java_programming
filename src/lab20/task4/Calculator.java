package lab20.task4;

public class Calculator {
    public static <T extends Number> T sum(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    public static <T extends Number> T multiply(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    public static <T extends Number> T divide(T a, T b) {
        if (b.intValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    public static <T extends Number> T subtract(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }
}
