package lab41.task4;

import java.util.Random;

public class Matrix {
    public double[][] values;
    public int rows;
    public int columns;
    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.values = new double[this.rows][this.columns];
        createRandomMatrix();
    }
    public Matrix(double[][] values){
        this.rows = values.length;
        this.columns = values[0].length;
        this.values=values;
    }
    private void createRandomMatrix() {
        Random random = new Random();
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                this.values[i][j] = random.nextDouble();
            }
        }
    }
    public Matrix sumMatrices(Matrix matrix) {
        if (matrix.rows != this.rows && matrix.columns != this.columns) {
            throw new Error("Матрицы должны быть одинакового размера");
        }
        double[][] resultData = new double[this.rows][this.columns];
        for (int i = 0; i < this.rows; ++i) {
            for (int j = 0; j < this.columns; ++j) {
                resultData[i][j] = this.values[i][j] + matrix.values[i][j];
            }
        }
        return new Matrix(resultData);
    }
    public Matrix multiplyByNumber(double num){
        double[][] resultValues = new double[this.rows][this.columns];
        for (int i = 0; i < this.rows;i++){
            for (int j = 0; j < this.columns;j++){
                resultValues[i][j] = this.values[i][j] * num;
            }
        }
        return new Matrix(resultValues);
    }

    public Matrix multiplyMatrices(Matrix matrix) {
        if(this.columns != matrix.rows) {
            throw new Error("Число столбцов первой матрицы должно быть равно числу строк второй матрицы.");
        }
        double[][] resultData = new double[this.rows][matrix.columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    resultData[i][j] += this.values[i][k] * matrix.values[k][j];
                }
            }
        }
        return new Matrix(resultData);
    }

    public void printMatrix(){
        for (int i = 0; i < this.rows;i++){
            for (int j = 0; j < this.columns;j++){
                System.out.printf("%.2f",this.values[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
