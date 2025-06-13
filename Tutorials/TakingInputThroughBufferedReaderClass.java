package Tutorials;
import java.io.*;

public class TakingInputThroughBufferedReaderClass {

    public void Addition() throws IOException {

        int a, b, sum;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        a = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        b = Integer.parseInt(br.readLine());

        sum = a + b;
        System.out.println("Addition is: " + sum);
    }
}