package Questions;
import java.util.Scanner;

public class CountTotalVowelsAndConsonantInAString {

    private String str;
    private final Scanner sc = new Scanner(System.in);

    private void takeInputString() {

        System.out.print("Enter the string: ");
        this.str = this.sc.nextLine();
    }

    private boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    private int countVowels() {

        int count = 0;
        String tempStr = this.str;

        tempStr = tempStr.toLowerCase();
        for(int i = 0; i < tempStr.length(); i++) {
            if(isVowel(tempStr.charAt(i)))  count++;
        }
        return count;
    }

    private boolean isConsonant(char c) {
        return (((int)c >= 65 && (int)c <= 90) || ((int)c >= 97 && (int)c <= 122)) && !isVowel(c);
    }

    private int countConsonants() {

        int count = 0;
        String tempStr = this.str;

        tempStr = tempStr.toLowerCase();
        for(int i = 0; i < tempStr.length(); i++) {
            if(isConsonant(tempStr.charAt(i)))  count++;
        }
        return count;
    }

    public void mainFunction() {

        takeInputString();

        int vowels = countVowels();
        int consonants = countConsonants();

        System.out.println("The Vowels in the string are: " + vowels);
        System.out.println("The Consonants in the string are: " + consonants);
    }
}
