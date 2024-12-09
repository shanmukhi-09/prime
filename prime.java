import java.util.*;

public class prime {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are");

        // Loop through numbers to check for primes
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check if the number is prime
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If number is prime, print it
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
