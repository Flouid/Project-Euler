import java.util.ArrayList;

/**
 * The prime 41, can be written as the sum of six consecutive primes:
 *
 * 41 = 2 + 3 + 5 + 7 + 11 + 13
 *
 * This is the longest sum of consecutive primes that adds to a prime below one-hundred.
 *
 * The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.
 *
 * Which prime, below one-million, can be written as the sum of the most consecutive primes?
 */

public class ProblemL {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        ArrayList<Integer> primesList = ProblemXXVI.primeList(1000000);
        int primeSum;
        int primeWithLongestSum = 0;
        int lengthSum = 0;
        int longestLengthSum = 0;
        for (int prime: primesList) {
            for (int startIndex = 0; primesList.get(startIndex) < prime; startIndex++) {
                primeSum = 0;
                for (int i = startIndex; primeSum < prime; i++) {
                    primeSum += primesList.get(i);
                    if (primeSum == prime) {
                        lengthSum = (i  - startIndex) + 1;
                    }
                }
                if (lengthSum > longestLengthSum) {
                    longestLengthSum = lengthSum;
                    primeWithLongestSum = prime;
                }
            }
        }
        System.out.println(primeWithLongestSum + " has a sum of length " + longestLengthSum);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }
}


