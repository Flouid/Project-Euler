import java.math.BigInteger;
import java.util.ArrayList;

/**
 * The Fibonacci sequence is defined by the recurrence relation:
 *
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * Hence the first 12 terms will be:
 *
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * The 12th term, F12, is the first term to contain three digits.
 *
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */

public class ProblemXXV {
    public static ArrayList<BigInteger> fibonacciSequence = new ArrayList<>();

    public static void main(String[] args) {
        final double startTime = System.nanoTime();                               //Starts recording runtime
        int index = 2;
        fibonacciSequence.add(BigInteger.ONE);
        fibonacciSequence.add(BigInteger.ONE);
        BigInteger nextN;
        while (String.valueOf(fibonacciSequence.get(index - 2)).length() < 1000) {
            //for each index, adds the previous two indexes together to get the next term in the sequence
            nextN = fibonacciSequence.get(index - 1).add(fibonacciSequence.get(index - 2));
            fibonacciSequence.add(nextN);
            index++;
        }
        System.out.println(fibonacciSequence.get(index - 1));
        System.out.println(index - 1);
        final double duration = (System.nanoTime() - startTime) / 1000000000;   //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                //Outputs runtime
    }
}
