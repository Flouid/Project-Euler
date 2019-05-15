import java.math.BigInteger;

/**
 * The series, 11 + 22 + 33 + ... + 1010 = 10405071317.
 *
 * Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
 */

public class ProblemXLVIII {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        BigInteger series = new BigInteger("0");
        for (int i = 1; i <= 1000; i++) {
            series = series.add(BigInteger.valueOf(i).pow(i));
        }
        System.out.println(series.toString().substring(series.toString().length() - 10));
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }
}
