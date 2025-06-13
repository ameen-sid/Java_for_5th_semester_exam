package Questions;
import java.util.Scanner;

public class SumAndProductOfArrayElements {

    private int size;
    private final Scanner sc = new Scanner(System.in);
    private int[] arr;

    private void takeInputSize() {

        System.out.print("Enter the size of array: ");
        this.size = this.sc.nextInt();
    }

    private void takeInputArrayElements() {

        this.arr = new int[this.size];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < this.size; i++)   this.arr[i] = this.sc.nextInt();
    }

    private int getSumOfElements() {

        int sum = 0;
        for(int i = 0; i < this.size; i++)  sum += this.arr[i];
        return sum;
    }

    private int getProductOfElements() {

        int product = 1;
        for(int i = 0; i < this.size; i++)  product *= this.arr[i];
        return product;
    }

    public void mainFunction() {

        takeInputSize();
        takeInputArrayElements();

        int sum = getSumOfElements();
        int product = getProductOfElements();

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
    }
}
