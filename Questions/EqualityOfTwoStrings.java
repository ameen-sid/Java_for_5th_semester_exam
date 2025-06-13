package Questions;
import java.util.Scanner;

public class EqualityOfTwoStrings {

    private String str1 = "";
    private String str2 = "";
    private final Scanner sc = new Scanner(System.in);

    private void takeInputString() {

        System.out.print("Enter the first string: ");
        this.str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        this.str2 = sc.nextLine();
    }

    private boolean checkEquals() {
        return this.str1.equalsIgnoreCase(this.str2);
    }

    private boolean checkEqualsCaseSensitive() {
        return this.str1.equals(this.str2);
    }

    public void mainFunction() {

        takeInputString();

        if(checkEquals()) System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");
    }
}
