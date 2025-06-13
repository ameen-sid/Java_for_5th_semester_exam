package Questions;
import java.util.Scanner;

public class ReverseOfANumber {

    public void ReverseNumber() {

        int num, rev = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no: ");
        num = sc.nextInt();

        while(num > 0) {

            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }

        System.out.println("Reversed No: " + rev);
    }
}
