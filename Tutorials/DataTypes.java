package Tutorials;

public class DataTypes {

    public void DataTypesInfo() {

        // whole numbers
            // byte
            // short
            // int
            // long

        byte age1 = 127;            // 1 byte
        short age2 = 32767;         // 2 bytes
        int age3 = -2147483648;     // 4 bytes
        long age4 = 2147483649l;    // 8 bytes

        System.out.println("Byte Range: (" + Byte.MIN_VALUE + ", " + Byte.MAX_VALUE + ")");
        System.out.println("Short Range: (" + Short.MIN_VALUE + ", " + Short.MAX_VALUE + ")");
        System.out.println("Int Range: (" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + ")");
        System.out.println("Long Range: (" + Long.MIN_VALUE + ", " + Long.MAX_VALUE + ")");


        // decimal numbers
            // float
            // double

        float mySalary = 1000.11112311212121f;      // 4 bytes
        double yourSalary = 1000.11112311212121;    // 8 bytes
        System.out.println(mySalary);
        System.out.println(yourSalary);

        mySalary = 1055555555555555555555555555555555.11111111213321f;
        yourSalary = 1055555555555555555555555555555555.11111111111231232;
        System.out.println(mySalary);
        System.out.println(yourSalary);

        System.out.println("Float Range: (" + Float.MIN_VALUE + ", " + Float.MAX_VALUE + ")");
        System.out.println("Double Range: (" + Double.MIN_VALUE + ", " + Double.MAX_VALUE + ")");


        // characters
            // char

        char initial = 'a';     // 2 bytes
        System.out.println("Char Range: (" + (int)Character.MIN_VALUE + ", " + (int)Character.MAX_VALUE + ")");
        char heartSymbol = (char) 10084;
        char heart = '\u2764';
        System.out.println(heartSymbol);
        System.out.println(heart);


        // booleans
            // boolean

        boolean flag = true;    // 1 bit
        System.out.println(flag);
    }
}