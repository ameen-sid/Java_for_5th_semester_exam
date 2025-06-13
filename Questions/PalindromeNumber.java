package Questions;
import java.util.Scanner;

public class PalindromeNumber {

    public void checkPalindrome() {

        int num, rev = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no: ");
        num = sc.nextInt();

        int tempNum = num;
        while(tempNum > 0) {

            int digit = tempNum % 10;
            rev = (rev * 10) + digit;
            tempNum /= 10;
        }

        if(rev == num)  System.out.println("Number is Palindrome");
        else    System.out.println("Number isn't Palindrome");
    }
}
