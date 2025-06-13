package Tutorials;

public class ExceptionHandling {

    public void mainFunction()  {

        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};
        for(int i = 0; i < 10; i++) {

            try {
                System.out.println(divide(numerators[i], denominators[i]));;
            } catch(IndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }

    public int divide(int a, int b) {

        try {

            return a / b;
        } catch(ArithmeticException e) {

            System.out.println("Arithmetic Exception");
            return -1;
        } catch(NullPointerException e) {

            System.out.println("Null Pointer Exception");
            return -1;
        } catch(Exception e) {

            System.out.println(e);
            return -1;
        }
    }
}
