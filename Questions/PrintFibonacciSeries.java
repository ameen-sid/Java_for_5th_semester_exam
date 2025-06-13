package Questions;
import java.util.Scanner;

public class PrintFibonacciSeries {

    public void PrintFibonacci() {

        int n, zeroTerm = 0, firstTerm = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no: ");
        n = sc.nextInt();

        System.out.println("Printing Fibonacci Series till " + n + "th term: ");
        System.out.print(zeroTerm + " " + firstTerm);
        n--;
        while(n > 0) {

            int thirdTerm = zeroTerm + firstTerm;
            System.out.print(" " + thirdTerm);

            zeroTerm = firstTerm;
            firstTerm = thirdTerm;

            n--;
        }
    }
}
