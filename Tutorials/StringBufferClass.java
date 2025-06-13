package Tutorials;

public class StringBufferClass {

    public void mainFunction() {

        StringBuffer str = new StringBuffer("Programming");

        // setCharAt
        str.setCharAt(2, 'a');
        System.out.println("String after change index 2 to char a: " + str);

        // append
        str.append(" Java");
        System.out.println("String after append: " + str);

        // insert
        str.insert(3, " Pro");
        System.out.println("String after insert: " + str);
    }
}
