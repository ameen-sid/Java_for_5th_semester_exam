package Questions;

public class PrintPrimeNumbersBetween1To100 {

    private boolean isPrime(int n) {

        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public void PrintPrimes() {

        System.out.println("Printing Primes Between 1 to 100: ");
        for(int i = 1; i <= 100; i++) {
            if(isPrime(i))  System.out.print(i + " ");
        }
    }
}
