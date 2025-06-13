package Questions;
import java.util.Scanner;

public class MultiplicationOfTwoMatrices {

    private int order;
    private final Scanner sc = new Scanner(System.in);
    private int[][] matrixA;
    private int[][] matrixB;

    private void takeInputOrder() {

        System.out.print("Enter the order of matrix: ");
        this.order = this.sc.nextInt();
    }

    private void takeInputMatrix(int[][] matrix) {

        for(int i = 0; i < this.order; i++) {
            for(int j = 0; j < this.order; j++) matrix[i][j] = this.sc.nextInt();
        }
    }

    private int[][] getMultiplicationOfMatrices() {

        int[][] matrix = new int[this.order][this.order];
        for(int i = 0; i < this.order; i++) {
            for(int j = 0; j < this.order; j++) {

                matrix[i][j] = 0;
                for(int k = 0; k < this.order; k++) matrix[i][j] += this.matrixA[i][k] * this.matrixB[k][j];
            }
        }
        return matrix;
    }

    private void printMatrix(int[][] matrix) {

        for(int i = 0; i < this.order; i++) {

            for(int j = 0; j < this.order; j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public void mainFunction() {

        takeInputOrder();

        this.matrixA = new int[this.order][this.order];
        this.matrixB = new int[this.order][this.order];

        System.out.print("Enter the elements of matrix A: ");
        takeInputMatrix(this.matrixA);

        System.out.print("Enter the elements of matrix B: ");
        takeInputMatrix(this.matrixB);

        int[][] multiplicationMatrix = getMultiplicationOfMatrices();

        System.out.println("The Multiplication of the matrices is: ");
        printMatrix(multiplicationMatrix);
    }
}
