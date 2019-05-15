import java.util.ArrayList;
import java.util.PrimitiveIterator;

/**
 * It was proposed by Christian Goldb`ikach that every odd composite number can be written as the
 * sum of a prime and twice a square.
 *
 * 9 = 7 + 2×12
 * 15 = 7 + 2×22
 * 21 = 3 + 2×32
 * 25 = 7 + 2×32
 * 27 = 19 + 2×22
 * 33 = 31 + 2×12
 *
 * It turns out that the conjecture was false.
 *
 * What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?
 */

public class ProblemXLVI {
    private static ArrayList<Integer> primesList = ProblemXXVI.primeList(10000);

    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        int i = 9;
        boolean found = false;
        while (!found) {
            if ((!canBeWritten(i) && (!ProblemVII.isPrime(i)))) {
                found = true;
                System.out.println(i);
            }
            i += 2;
        }
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }

    private static boolean canBeWritten(int n) {
        for (int p = 0; primesList.get(p) < n - 1; p++) {
            for (int i = 1; i * i < n / 2; i++) {
                if (n == primesList.get(p) + (2 * i * i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
