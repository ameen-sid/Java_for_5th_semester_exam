package Questions;
import java.util.Scanner;

public class TransposeOfAMatrix {

    private int order;
    private final Scanner sc = new Scanner(System.in);
    private int[][] matrix;

    private void takeInputOrder() {

        System.out.print("Enter the order of matrix: ");
        this.order = this.sc.nextInt();
    }

    private void takeInputMatrix() {

        System.out.print("Enter the elements of matrix: ");
        for(int i = 0; i < this.order; i++) {
            for(int j = 0; j < this.order; j++) this.matrix[i][j] = this.sc.nextInt();
        }
    }

    private void transpose() {

        for(int i = 0; i < this.order; i++) {
            for(int j = 0; j < this.order; j++) {
                if(j > i) {

                    int temp = this.matrix[i][j];
                    this.matrix[i][j] = this.matrix[j][i];
                    this.matrix[j][i] = temp;
                }
            }
        }
    }

    private void printMatrix() {

        for(int i = 0; i < this.order; i++) {

            for(int j = 0; j < this.order; j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public void mainFunction() {

        takeInputOrder();

        this.matrix = new int[this.order][this.order];
        takeInputMatrix();

        System.out.println("Printing Matrix Before Transpose: ");
        printMatrix();

        transpose();

        System.out.println("Printing Matrix After Transpose: ");
        printMatrix();
    }
}
