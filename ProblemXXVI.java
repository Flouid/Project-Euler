import java.math.BigInteger;
import java.util.ArrayList;

/**
 * A unit fraction contains 1 in the numerator. The decimal representation
 * of the unit fractions with denominators 2 to 10 are given:
 *
 * 1/2	= 	0.5
 * 1/3	= 	0.(3)
 * 1/4	= 	0.25
 * 1/5	= 	0.2
 * 1/6	= 	0.1(6)
 * 1/7	= 	0.(142857)
 * 1/8	= 	0.125
 * 1/9	= 	0.(1)
 * 1/10	= 	0.1
 *
 * Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle.
 * It can be seen that 1/7 has a 6-digit recurring cycle.
 *
 * Find the value of d < 1000 for which 1/d contains the longest
 * recurring cycle in its decimal fraction part.
 */

public class ProblemXXVI {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                               //Starts recording runtime
        int longestCycle = 0;
        int cycleLength;
        int primeWithLongestCycle = 0;
        ArrayList<Integer> primes = primeList(1000);
        for (Integer prime : primes) {
            cycleLength = cycleLength(prime);
            if (cycleLength > longestCycle) {
                longestCycle = cycleLength;
                primeWithLongestCycle = prime;
            }
        }
        System.out.println(primeWithLongestCycle + " has the most with " + longestCycle + " digits");
        final double duration = (System.nanoTime() - startTime) / 1000000000;   //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                //Outputs runtime
    }

    static ArrayList<Integer> primeList(int n) {
        //Generates an ArrayList of primes below or equal to the number passed to it
        ArrayList<Integer> primesList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (ProblemVII.isPrime(i)) {
                primesList.add(i);
            }
        }
        return primesList;
    }

    private static int cycleLength(int n) {
        //Calculates the length of the repetend for any given prime
        int length = 0;
        for (int i = 1; i < n; i++) {
            if ((BigInteger.TEN.pow(i).mod(BigInteger.valueOf(n)).equals(BigInteger.ONE)) && (length == 0)) {
                //If 10^i mod n = 1 and it is the smallest solution then it sets the length of the cycle to i
                length = i;
                System.out.println(n + " has " + length + " digits");
            }
        }
        if (length == 0) {
            System.out.println(n + " has no solution");
        }
        return length;
    }
}
