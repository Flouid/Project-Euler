/**
 * It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
 *
 * Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
 */

public class Problem52 {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        boolean found = false;
        int i = 0;
        while (!found) {
            i++;
            if     (ProblemXLIX.isPermutation(String.valueOf(2 * i), String.valueOf(i)) &&
                    ProblemXLIX.isPermutation(String.valueOf(3 * i), String.valueOf(i)) &&
                    ProblemXLIX.isPermutation(String.valueOf(4 * i), String.valueOf(i)) &&
                    ProblemXLIX.isPermutation(String.valueOf(5 * i), String.valueOf(i)) &&
                    ProblemXLIX.isPermutation(String.valueOf(6 * i), String.valueOf(i))) {
                System.out.println(i);
                found = true;
            }
        }
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }
}
