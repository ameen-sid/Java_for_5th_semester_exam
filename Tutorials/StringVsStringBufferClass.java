package Tutorials;

public class StringVsStringBufferClass {

    public void mainFunction() {

        // String Class
        String str1 = "Java";
        str1.concat(" Programming");
        System.out.println(str1);

        // String Buffer Class
        StringBuffer str2 = new StringBuffer("Java");
        str2.append(" Programming");
        System.out.println(str2);
    }
}
