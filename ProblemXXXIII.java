import java.util.ArrayList;

/**
 * The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may
 * incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.
 *
 * We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
 *
 * There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing
 * two digits in the numerator and denominator.
 *
 * If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
 */

public class ProblemXXXIII {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 // Starts recording runtime
        ArrayList<Double> weirdFractions = findWeirdFraction();
        double product = 1;
        for (Double weirdFraction : weirdFractions) {
            product *= weirdFraction;
        }
        System.out.println( 1 / product); // 1 / x = product, so 1 / product = x
        final double duration = (System.nanoTime() - startTime) / 1000000000;       // Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    // Outputs runtime
    }

    private static ArrayList<Double> findWeirdFraction() {
        ArrayList<Double> weirdFractions = new ArrayList<>();
        double fraction;
        double cancelledFraction;
        double strippedNumerator;
        double strippedDenominator;
        for (int numerator = 10; numerator < 100; numerator++) {
            for (int denominator = 10; denominator < 100; denominator++) {
                //Checks every possible numerator/denominator combination in the solution space
                if ((numerator % 11 != 0) && (denominator % 11 != 0) && (numerator % 10 != 0) && (denominator % 10 != 0) && (numerator/denominator < 1)) {
                    //Only combinations that have different digits, are less than one, and aren't trivial are considered
                    fraction = (double) numerator / denominator;
                    for (int digit = 0; digit <= 9; digit++) {
                        //For each digit, checks if stripping it from the numerator and denominator produces the same fraction
                        strippedNumerator = Double.valueOf(String.valueOf(numerator).replaceAll(String.valueOf(digit), ""));
                        strippedDenominator = Double.valueOf(String.valueOf(denominator).replaceAll(String.valueOf(digit), ""));
                        cancelledFraction = strippedNumerator / strippedDenominator;
                        if ((cancelledFraction == fraction) && (numerator != strippedNumerator)) {
                            //Checks if the fraction and cancelled fraction are the same, and that they have had a digit stripped
                            weirdFractions.add(fraction);
                        }
                    }
                }
            }
        }
        return weirdFractions;
    }
}
