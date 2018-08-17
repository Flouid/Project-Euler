import java.math.BigInteger;

/**
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 *
 * Find the sum of all numbers which are equal to the sum of the factorial of their digits.
 *
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 */
public class ProblemXXXIV {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 // Starts recording runtime
        int sum = 0;
        for (int i = 3; i < 100000; i++) { // Checked up to 1 million, the only other valid value is in the ten thousands so this
            if (isCurious(i)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       // Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    // Outputs runtime

    }

    private static boolean isCurious(int n) {
        //Checks if a number n is equal to the sum of the factorial of its digits
        //e.g. 1! + 4! + 5! = 145
        String nString = String.valueOf(n);
        BigInteger numberSum = BigInteger.ZERO;
        for (int i = 0; i < nString.length(); i++) {
            numberSum = numberSum.add(ProblemXX.factorial(Integer.parseInt(nString.substring(i, i + 1))));
        }
        return ((numberSum.equals(BigInteger.valueOf(n))) && (!numberSum.equals(BigInteger.ONE)) && (!numberSum.equals(BigInteger.ONE.add(BigInteger.ONE))));
    }
}
