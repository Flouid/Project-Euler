/**
 * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
 *
 * 21 22 23 24 25
 * 20  7  8  9 10
 * 19  6  1  2 11
 * 18  5  4  3 12
 * 17 16 15 14 13
 *
 * It can be verified that the sum of the numbers on the diagonals is 101.
 *
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */

public class ProblemXXVIII {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            sum += (4 * Math.pow(i, 2)) - (2 * i) + 1;              // Calculates diagonal down and to the right
            sum += (4 * Math.pow((i + 1), 2)) - (4 * (i + 1)) + 1;  // Calculates diagonal up and to the right
            sum += (4 * Math.pow(i, 2)) + (2 * i) + 1;              // Calculates diagonal up and to the left
            sum += (4 * Math.pow(i, 2)) + 1;                        // Calculates diagonal down and to the left
            sum++;                                                  // Adds the 1 in the middle
        }
        System.out.println(sum);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }
}
