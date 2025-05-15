package HamTinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Matrix m1 = new Matrix(2, 2);
        m1.input(scanner);

        Matrix m2 = new Matrix(2, 2)    ;
        m2.input(scanner);

        m1.print();
        m2.print();

        try{
            Matrix sum = Matrix.add(m1, m2);
            sum.print();
        }
        catch (IllegalArgumentException e){
            System.out.println("Error");
        }

        scanner.close();
    }
}

class Matrix{
    int row;
    int col;
    float[][] data;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.data = new float[row][col];
    }

    void input(Scanner scanner){
        System.out.println("Nhập giá trị cho ma trận " + row + "x" + col + ":");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                data[i][j] = scanner.nextFloat();
            }
        }
    }

    void print(){
        System.out.println("Ma trận:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

//    Hàm tĩnh
    static Matrix add(Matrix m1, Matrix m2){
        if (m1.row != m2.row || m1.col != m2.col) {
            throw new IllegalArgumentException("Hai ma trận phải có cùng kích thước để cộng.");
        }

        Matrix result = new Matrix(m1.row, m1.col);
        for (int i = 0; i < m1.row; i++) {
            for (int j = 0; j < m1.col; j++) {
                result.data[i][j] = m1.data[i][j] + m2.data[i][j];
            }
        }
        return result;
    }
}