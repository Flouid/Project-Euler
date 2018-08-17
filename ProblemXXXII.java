import java.util.ArrayList;

/**
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example,
 * the 5-digit number, 15234, is 1 through 5 pandigital.
 *
 * The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is
 * 1 through 9 pandigital.
 *
 * Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.
 */

public class ProblemXXXII {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        ArrayList<Integer> products = new ArrayList<>();
        int product;
        int sum = 0;
        for (int multiplicand = 1; multiplicand <= 4321; multiplicand++) {
            for (int multiplier = 1; multiplier <= 321; multiplier++) {
                product = multiplicand * multiplier;
                if ((isPandigital(multiplicand, multiplier, product)) && (!products.contains(product))) {
                    products.add(product);
                }
            }
        }
        for (int pandigitalProduct: products) {
            sum += pandigitalProduct;
        }
        System.out.println(sum);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }

    private static boolean isPandigital(int multiplicand, int multiplier, int product) {
        //Checks if two factors and their product are all pandigital together
        String identity = String.valueOf(multiplicand) + String.valueOf(multiplier) + String.valueOf(product);
        int digitCounter = 0;
        if (identity.length() == 9) {
            for (int digits = 1; digits <= 9; digits++) {
                if (identity.contains(String.valueOf(digits))) {
                    digitCounter++;
                }
            }
        }
        return (digitCounter == 9);
    }
}
