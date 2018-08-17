/**
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 *
 * 1634 = 1^4 + 6^4 + 3^4 + 44
 * 8208 = 8^4 + 2^4 + 0^4 + 84
 * 9474 = 9^4 + 4^4 + 7^4 + 44
 * As 1 = 1^4 is not a sum it is not included.
 *
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 *
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */

public class ProblemXXX {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        int sum = 0;
        for (int i = 1; i < 355000; i++) {
            if (fifthPowerSum(i)) {
                sum += i;
            }
        }
        System.out.println(sum - 1); //1 is not a solution so it must be removed
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }

    private static boolean fifthPowerSum(int n) {
        //Checks if the sum of a number n's digits to the fifth power equals n
        String nString = String.valueOf(n);
        int numberSum = 0;
        for (int i = 0; i < nString.length(); i++) {
            numberSum += Math.pow(Double.valueOf(nString.substring(i, i + 1)), 5);
        }
        return (numberSum == n);
    }
}
