package lab4.lab41.task4;

public class Tester {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 4);
        Matrix matrix2 = new Matrix(4, 3);
        System.out.println("Первая матрица: ");
        matrix1.printMatrix();
        System.out.println("Вторая матрица: ");
        matrix2.printMatrix();
        try{
            Matrix matrix3 = matrix1.sumMatrices(matrix2);
            System.out.println("Результат сложения первой и второй матриц: ");
            matrix3.printMatrix();
        } catch(Error e){
            System.out.println(e.getMessage());
        }
        Matrix matrix4 = matrix1.multiplyByNumber(11);
        System.out.println("Результат умножения первой матрицы на 11");
        matrix4.printMatrix();
        try{
            Matrix matrix5 = matrix1.multiplyMatrices(matrix2);
            System.out.println("Результат умножения первой и второй матриц: ");
            matrix5.printMatrix();
        } catch(Error e) {
            System.out.print(e.getMessage());
        }
    }
}