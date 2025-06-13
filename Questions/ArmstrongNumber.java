package Questions;
import java.util.Scanner;

public class ArmstrongNumber {

    private int cube(int n) {

        int ans = n;
        for(int i = 1; i < 3; i++)  ans *= n;
        return ans;
    }

    public void isArmstrong() {

        int num, result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no: ");
        num = sc.nextInt();

        int tempNum = num;
        while(tempNum > 0) {

            int digit = tempNum % 10;
            result += cube(digit);
            tempNum /= 10;
        }

        if(result == num)   System.out.println("Number is Armstrong");
        else    System.out.println("Number isn't Armstrong");
    }
}
