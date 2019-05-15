import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once.
 * For example, 2143 is a 4-digit pandigital and is also prime.
 *
 * What is the largest n-digit pandigital prime that exists?
 */

public class ProblemXLI {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 // Starts recording runtime
        int largestPandigitalPrime = 0;
        ArrayList<Integer> primesList = ProblemXXVI.primeList(10000000);
        for (int prime: primesList) {
            if (ProblemXXXVIII.isPandigital(String.valueOf(prime))) {
                largestPandigitalPrime = prime;
            }
        }
        System.out.println(largestPandigitalPrime);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       // Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    // Outputs runtime
    }
}
