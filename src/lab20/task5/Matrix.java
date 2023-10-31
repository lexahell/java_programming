package lab20.task5;

import java.util.Random;

public class Matrix<T extends Number> {
    private int rows;
    private int columns;
    private T[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = (T[][]) new Number[rows][columns];
    }

    public Matrix(T[][] data) {
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = data;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public T get(int row, int column) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IllegalArgumentException("Invalid row or column index");
        }
        return data[row][column];
    }

    public void set(int row, int column, T value) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IllegalArgumentException("Invalid row or column index");
        }
        data[row][column] = value;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.getRows() || columns != other.getColumns()) {
            throw new IllegalArgumentException("Matrix dimensions must be the same for addition.");
        }

        Matrix<T> result = new Matrix<>(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                T sum = addNumbers(data[i][j], other.get(i, j));
                result.set(i, j, sum);
            }
        }
        return result;
    }
    public Matrix<T> sub(Matrix<T> other) {
        if (rows != other.getRows() || columns != other.getColumns()) {
            throw new IllegalArgumentException("Matrix dimensions must be the same for addition.");
        }

        Matrix<T> result = new Matrix<>(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                T delta = subNumbers(data[i][j], other.get(i, j));
                result.set(i, j, delta);
            }
        }
        return result;
    }
    private T subNumbers(T a, T b) {
        if (a instanceof Number && b instanceof Number) {
            double sum = ((Number) a).doubleValue() - ((Number) b).doubleValue();
            return (T) Double.valueOf(sum);
        } else {
            throw new IllegalArgumentException("Both elements must be numbers for addition.");
        }
    }
    private T addNumbers(T a, T b) {
        if (a instanceof Number && b instanceof Number) {
            double sum = ((Number) a).doubleValue() + ((Number) b).doubleValue();
            return (T) Double.valueOf(sum);
        } else {
            throw new IllegalArgumentException("Both elements must be numbers for addition.");
        }
    }
    public Matrix<T> multiply(Matrix<T> other) {
        if (columns != other.getRows()) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication.");
        }

        int resultRows = rows;
        int resultColumns = other.getColumns();
        Matrix<T> result = new Matrix<T>(resultRows, resultColumns);

        for (int i = 0; i < resultRows; i++) {
            for (int j = 0; j < resultColumns; j++) {
                T sum = (T) ((Number) 0.0);
                for (int k = 0; k < columns; k++) {
                    double product = ((Number) data[i][k]).doubleValue() * ((Number) other.get(k, j)).doubleValue();
                    sum = addNumbers(sum, (T) Double.valueOf(product));
                }
                result.set(i, j, sum);
            }
        }
        return result;
    }

    public Matrix<T> transpose() {
        Matrix<T> transposed = new Matrix<T>(columns, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed.set(j, i, data[i][j]);
            }
        }
        return transposed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}