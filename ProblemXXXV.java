import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.
 *
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 *
 * How many circular primes are there below one million?
 */

public class ProblemXXXV {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 // Starts recording runtime
        ArrayList<Integer> primesList = ProblemXXVI.primeList(1000000);
        ArrayList<Integer> circularPrimesList = new ArrayList<>();
        for (int prime: primesList) {
            if (isCircularPrime(prime)) {
                circularPrimesList.add(prime);
            }
        }
        System.out.println(circularPrimesList.size());
        final double duration = (System.nanoTime() - startTime) / 1000000000;       // Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    // Outputs runtime
    }

    private static boolean isCircularPrime(int n) {
        boolean circularPrime = true;
        String nString = String.valueOf(n);
        if (nString.contains("0")) {
            circularPrime = false;
        }
        else {
            for (int i = 0; i < nString.length() - 1; i++) {
                nString = nString.substring(1) + nString.substring(0, 1);
                if (!ProblemVII.isPrime(Integer.valueOf(nString))) {
                    circularPrime = false;
                }
            }
        }
        return circularPrime;
    }
}
