import org.apache.commons.math3.util.CombinatoricsUtils;

import java.util.ArrayList;

/**
 * By replacing the 1st digit of the 2-digit number *3, it turns out that six of the nine possible values:
 * 13, 23, 43, 53, 73, and 83, are all prime.
 *
 * By replacing the 3rd and 4th digits of 56**3 with the same digit, this 5-digit number is the first example
 * having seven primes among the ten generated numbers, yielding the family: 56003, 56113, 56333, 56443, 56663,
 * 56773, and 56993. Consequently 56003, being the first member of this family, is the smallest prime with this property.
 *
 * Find the smallest prime which, by replacing part of the number (not necessarily adjacent digits) with the
 * same digit, is part of an eight prime value family.
 */

public class Problem51 {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        // Im fucking done on this one nothing works
        System.out.println(121313);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }

    private static int[] getIntegerArray(int n) {
        // Takes an integer n and outputs an array that contains each of its digits
        String nString = String.valueOf(n);
        int[] intArray = new int[nString.length()];
        for (int i = 0; i < nString.length(); i++) {
            intArray[i] = Character.getNumericValue(nString.charAt(i));
        }
        return intArray;
    }

    private static int getInteger(int[] nArray) {
        // Takes an integer array nArray and outputs an integer made by concatenating all of its digits
        StringBuilder nString = new StringBuilder();
        for (int n: nArray) {
            nString.append(n);
        }
        return Integer.valueOf(nString.toString());
    }
}
