import java.util.ArrayList;
import java.util.Collections;

/**
 * Take the number 192 and multiply it by each of 1, 2, and 3:
 *
 * 192 × 1 = 192
 * 192 × 2 = 384
 * 192 × 3 = 576
 * By concatenating each product we get the 1 to 9 pandigital, 192384576.
 * We will call 192384576 the concatenated product of 192 and (1,2,3)
 *
 * The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4,
 * and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).
 *
 * What is the largest 1 to 9 pandigital 9-digit number that can be formed as the
 * concatenated product of an integer with (1,2, ... , n) where n > 1?
 */

public class ProblemXXXVIII {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 // Starts recording runtime
        ArrayList<Integer> pandigitals = new ArrayList<>();
        String concatenatedProduct;
        for (int integer = 1; integer < 10000; integer++) {
            concatenatedProduct = "";
            for (int digit = 1; digit <= 9; digit++) {
                if (concatenatedProduct.length() < 9) {
                    concatenatedProduct += String.valueOf(integer * digit);
                    if ((isPandigital(concatenatedProduct) && (concatenatedProduct.length() == 9))) {
                        pandigitals.add(Integer.valueOf(concatenatedProduct));
                    }
                }
            }
        }
        System.out.println(Collections.max(pandigitals));
        final double duration = (System.nanoTime() - startTime) / 1000000000;       // Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    // Outputs runtime
    }

    public static boolean isPandigital(String identity) {
        //Checks if a number in string form is pandigital
        int digitCounter = 0;
        for (int digits = 1; digits <= identity.length(); digits++) {
            if (identity.contains(String.valueOf(digits))) {
                digitCounter++;
            }
        }
        return (digitCounter == identity.length());
    }
}
