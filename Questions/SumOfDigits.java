package Questions;
import java.util.Scanner;

public class SumOfDigits {

    public void Sum() {

        int num, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no: ");
        num = sc.nextInt();

        while(num > 0) {

            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        System.out.println("Sum is: " + sum);
    }
}
