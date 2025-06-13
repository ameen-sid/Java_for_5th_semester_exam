package Tutorials;

public class StringMethods {

    public void mainFunction() {

        String str = "Hello, World!";
        String str2 = "Hello, World";

        // Length
        int len = str.length();
        System.out.println("Length: " + len);

        // Char At
        char ch = str.charAt(3);
        System.out.println("Char at 3: " + ch);

        // Compare To
        int compare = str.compareTo(str2);
        if(compare == 0) System.out.println("Strings are equal");
        else if(compare > 0) System.out.println("String 1 is Greater");
        else System.out.println("String 2 is Greater");

        // To Lower Case
        String lowerStr = str.toLowerCase();
        System.out.println("String in Lower Case: " + lowerStr);

        // To Upper Case
        String upperStr = str.toUpperCase();
        System.out.println("String in Upper Case: " + upperStr);

        // Sub String from index
        String subStr1 = str.substring(5);
        System.out.println("SubString from index 5: " + subStr1);

        // Sub String from index and till index
        String subStr2 = str.substring(2, 6);
        System.out.println("SubString from index 2 to 6: " + subStr2);

        // Concat
        String concat = str.concat(" Java Programming");
        System.out.println("Concatenated String: " + concat);

        // Index Of Char
        int index1 = str.indexOf('o');
        System.out.println("Index of o is: " + index1);

        // Index Of String
        int index2 = str.indexOf('o', 5);
        System.out.println("Index of o after index 5 is: " + index2);
    }
}
