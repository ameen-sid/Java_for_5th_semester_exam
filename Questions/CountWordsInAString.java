package Questions;
import java.util.Scanner;

public class CountWordsInAString {

    private String str;
    private final Scanner sc = new Scanner(System.in);

    private void takeInputString() {

        System.out.print("Enter the string: ");
        this.str = sc.nextLine();
    }

    private int countWords() {

        int count = 1;
        for(int i = 0; i < this.str.length() - 1; i++) {

            char currChar = this.str.charAt(i);
            char nextChar = this.str.charAt(i + 1);
            if(currChar == ' ' && nextChar != ' ')  count++;
        }
        return count;
    }

    public void mainFunction() {

        takeInputString();

        int words = countWords();
        System.out.println("Total Words in string is: " + words);
    }
}
