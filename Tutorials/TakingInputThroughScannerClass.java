package Tutorials;
import java.util.Scanner;

public class TakingInputThroughScannerClass {

    public void Addition() {

        int a, b, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        sum = a + b;
        System.out.println("Addition is: " + sum);
    }
}