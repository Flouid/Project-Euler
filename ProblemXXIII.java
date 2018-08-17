/**
 * A perfect number is a number for which the sum of its proper divisors is exactly
 * equal to the number. For example, the sum of the proper divisors of 28 would be
 * 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 *
 * A number n is called deficient if the sum of its proper divisors is less than n
 * and it is called abundant if this sum exceeds n.
 *
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number
 * that can be written as the sum of two abundant numbers is 24. By mathematical
 * analysis, it can be shown that all integers greater than 28123 can be written
 * as the sum of two abundant numbers. However, this upper limit cannot be reduced
 * any further by analysis even though it is known that the greatest number that
 * cannot be expressed as the sum of two abundant numbers is less than this limit.
 *
 * Find the sum of all the positive integers which cannot be written as the sum of two
 * abundant numbers.
 */
import java.util.ArrayList;
public class ProblemXXIII {

    public static void main(String[] args) {
        final double startTime = System.nanoTime();
        ArrayList<Integer> abundantNumbers;
        abundantNumbers = getAbundantNumbers();
        int sum = 0;
        for (int i = 1; i <= 28123; i++)
        {
            if (!canBeWrittenSumTwoAbundants(i, abundantNumbers)){
                sum += i;
            }
        }
        System.out.println(sum);
        final double duration = (System.nanoTime() - startTime)/1000000000;
        System.out.println("found in " + duration + " seconds");
    }

    public static boolean isAbundant(int n) {
        //Checks if a number is abundant (it is less than the sum of its factors)
        int factorSum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                factorSum += i;
            }
        }
        return (factorSum > n);
    }

    public static ArrayList<Integer> getAbundantNumbers() {
        //Generates an ArrayList of all abundant numbers below 28123
        ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
        for (int i = 1; i <= 28123; i++) {
            if (isAbundant(i)) {
                abundantNumbers.add(i);
            }
        }
        return abundantNumbers;
    }

    public static boolean canBeWrittenSumTwoAbundants(int n, ArrayList<Integer> abundantNumbers) {
        //Checks if a number can be written as the sum of two abundant numbers.
        for (int i = 0; abundantNumbers.get(i) <= n; i++) {
            if (abundantNumbers.contains(n - abundantNumbers.get(i))) {
                return true;
            }
        }
        return false;
    }
}
