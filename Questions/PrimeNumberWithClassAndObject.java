package Questions;
import java.util.Scanner;

public class PrimeNumberWithClassAndObject {

    private int n;

    public void setData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no: ");
        n = sc.nextInt();
    }

    public void checkPrime() {

        boolean isPrime = true;
        for(int i = 2; i < n; i++) {

            if (n % i == 0) {

                isPrime = false;
                break;
            }
        }

        if(!isPrime)    System.out.println(n + " isn't Prime Number");
        else    System.out.println(n + " is Prime Number");
    }
}
