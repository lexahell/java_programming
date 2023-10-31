package lab20.task5;

public class Tester {
    public static void main(String[] args) {
        Double[][] data1 = {{1.0, 2.0}, {3.0, 4.0}};
        Double[][] data2 = {{5.0, 6.0}, {7.0, 8.0}};

        Matrix<Double> matrix1 = new Matrix<>(data1);
        Matrix<Double> matrix2 = new Matrix<>(data2);

        System.out.println("Matrix 1:");
        System.out.println(matrix1);

        System.out.println("Matrix 2:");
        System.out.println(matrix2);

        Matrix<Double> sumResult = matrix1.add(matrix2);
        System.out.println("Result of addition:");
        System.out.println(sumResult);

        Matrix<Double> subResult = matrix1.sub(matrix2);
        System.out.println("Result of subtraction:");
        System.out.println(subResult);

        Matrix<Double> result = matrix1.multiply(matrix2);

        System.out.println("Result of multiplication:");
        System.out.println(result);

        Matrix<Double> transposed = matrix1.transpose();
        System.out.println("Transposed matrix 1:");
        System.out.println(transposed);
    }
}
