import java.util.ArrayList;

/**
 * The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from
 * left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left:
 * 3797, 379, 37, and 3.
 *
 * Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
 *
 * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */

public class ProblemXXXVII {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 // Starts recording runtime
        ArrayList<Integer> primesList = ProblemXXVI.primeList(1000000);
        int sum = 0;
        for (int prime: primesList) {
            if (isTruncatable(prime)) {
                sum += prime;
            }
        }
        System.out.println(sum - 17); // 2, 3, 5, and 7 are not counted, so 17 must be subtracted
        final double duration = (System.nanoTime() - startTime) / 1000000000;       // Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    // Outputs runtime
    }

    private static boolean isTruncatable(int n) {
        String nString = String.valueOf(n);
        boolean isTruncatable = true;
        for (int i = 0; i < nString.length(); i++) {
            // Checks if the number is truncatable from left to right.
            if (!ProblemVII.isPrime(Integer.valueOf(nString.substring(i)))) {
                isTruncatable = false;
            }
        }
        for (int i = 1; i < nString.length(); i++) {
            // Checks if the number is truncatable from right to left.
            if (!ProblemVII.isPrime(Integer.valueOf(nString.substring(0, i)))) {
                isTruncatable = false;
            }
        }
        return isTruncatable;

        
    }

}
