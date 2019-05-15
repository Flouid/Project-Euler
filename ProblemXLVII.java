import java.util.ArrayList;

/**
 * The first two consecutive numbers to have two distinct prime factors are:
 *
 * 14 = 2 × 7
 * 15 = 3 × 5
 *
 * The first three consecutive numbers to have three distinct prime factors are:
 *
 * 644 = 2² × 7 × 23
 * 645 = 3 × 5 × 43
 * 646 = 2 × 17 × 19.
 *
 * Find the first four consecutive integers to have four distinct prime factors each. What is the first of these numbers?
 */

public class ProblemXLVII {
    private static ArrayList<Integer> primesList = ProblemXXVI.primeList(150000);

    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        int i = 0;
        boolean found = false;
        while (!found) {
            if ((numDistinctPrimeFactors(i) == 4) && (numDistinctPrimeFactors(i + 1) == 4) && (numDistinctPrimeFactors(i + 2) == 4) && (numDistinctPrimeFactors(i + 3) == 4)) {
                System.out.println(i);
                found = true;
            }
            i++;
        }
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }

    private static int numDistinctPrimeFactors(int n) {
        int factorNum = 0;
        for (int i = 0; primesList.get(i) <= n / 2; i++) {
            if (n % primesList.get(i) == 0) {
                factorNum++;
            }
        }
        return factorNum;
    }
}
