package Questions;
import java.util.Scanner;

public class SumOfEvenAndProductOfOddDigits {

    public void SumAndProduct() {

        int num, sum = 0, product = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no: ");
        num = sc.nextInt();

        while(num > 0) {

            int digit = num % 10;
            if(digit % 2 == 0)  sum += digit;
            else    product *= digit;
            num /= 10;
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + product);
    }
}
