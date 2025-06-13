package Questions;
import java.util.Scanner;

public class SumOfEachRowAndColumnOfMatrix {

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

    private void getSumOfEachRow(int[] rowSum) {

        for(int i = 0; i < this.order; i++) {

            int sum = 0;
            for(int j = 0; j < this.order; j++) sum += this.matrix[i][j];
            rowSum[i] = sum;
        }
    }

    private void getSumOfEachColumn(int[] colSum) {

        for(int i = 0; i < this.order; i++) {
            for(int j = 0; j < this.order; j++) colSum[j] += matrix[i][j];
        }
    }

    public void mainFunction() {

        takeInputOrder();

        this.matrix = new int[this.order][this.order];
        takeInputMatrix();

        int[] rowSum = new int[this.order];
        int[] colSum = new int[this.order];

        getSumOfEachRow(rowSum);
        getSumOfEachColumn(colSum);

        System.out.println("Printing Sum of each row: ");
        for(int i = 0; i < this.order; i++) System.out.println("Row " + i + " : " + rowSum[i]);

        System.out.println("Printing Sum of each column: ");
        for(int i = 0; i < this.order; i++) System.out.println("Col " + i + " : " + colSum[i]);
    }
}
