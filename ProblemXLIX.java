/**
 * The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways:
 * (i) each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another.
 *
 * There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property,
 * but there is one other 4-digit increasing sequence.
 *
 * What 12-digit number do you form by concatenating the three terms in this sequence?
 */

public class ProblemXLIX {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        for (int i = 1000; i < 6670; i++) {
               if ((ProblemVII.isPrime(i)) && (ProblemVII.isPrime(i + 3330)) && (ProblemVII.isPrime(i + 6660)) && (isPermutation(String.valueOf(i + 3330), String.valueOf(i))) && (isPermutation(String.valueOf(i + 6660), String.valueOf(i)))) {
                   System.out.println("" + i + (i + 3330) + (i + 6660));
               }
        }
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }

    public static boolean isPermutation(String toCompare, String base) {
        //Checks if a string is a permutation of another string.
        if (toCompare.length() == base.length()) {
            for (int i = 0; i < toCompare.length(); i++) {
                if (!(base.contains(String.valueOf(toCompare.charAt(i))))) {
                    return false;
                }
            }
        }
        else {
            return false;
        }
        return true;
    }
}
