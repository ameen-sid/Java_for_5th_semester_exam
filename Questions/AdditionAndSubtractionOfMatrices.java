package Questions;
import java.util.Scanner;

public class AdditionAndSubtractionOfMatrices {

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

    private int[][] getAdditionOfMatrices() {

        int[][] matrix = new int[this.order][this.order];
        for(int i = 0; i < this.order; i++) {
            for(int j = 0; j < this.order; j++) matrix[i][j] = this.matrixA[i][j] + this.matrixB[i][j];
        }
        return matrix;
    }

    private int[][] getSubtractionOfMatrices() {

        int[][] matrix = new int[this.order][this.order];
        for(int i = 0; i < this.order; i++) {
            for(int j = 0; j < this.order; j++) matrix[i][j] = this.matrixA[i][j] - this.matrixB[i][j];
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

        int[][] additionMatrix = getAdditionOfMatrices();
        int[][] subtractionMatrix = getSubtractionOfMatrices();

        System.out.println("The Addition of the matrices is: ");
        printMatrix(additionMatrix);

        System.out.println("The Subtraction of the matrices is: ");
        printMatrix(subtractionMatrix);
    }
}
