import java.util.ArrayList;

/**
 * The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in
 * some order, but it also has a rather interesting sub-string divisibility property.
 *
 * Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:
 *
 * d2d3d4=406 is divisible by 2
 * d3d4d5=063 is divisible by 3
 * d4d5d6=635 is divisible by 5
 * d5d6d7=357 is divisible by 7
 * d6d7d8=572 is divisible by 11
 * d7d8d9=728 is divisible by 13
 * d8d9d10=289 is divisible by 17
 * Find the sum of all 0 to 9 pandigital numbers with this property.
 */

public class ProblemXLIII {

    private static ArrayList<String> pandigitals = new ArrayList<>();

    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime

        //Declarations
        long sum = 0;
        //Creates a list of all the 0 to 9 pandigitals
        permutation("0123456789");

        //Goes through each pandigital and sums it if it has the special property
        for (String pandigital: pandigitals) {
            if (hasProperty(pandigital)) {
                sum += Long.valueOf(pandigital);
            }
        }
        System.out.println(sum);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }

    private static boolean hasProperty(String pandigital) {
        boolean hasProperty = true;
        if (!(Integer.valueOf(pandigital.substring(1, 4)) % 2 == 0)) {
            hasProperty = false;
        }
        else if (!(Integer.valueOf(pandigital.substring(2, 5)) % 3 == 0)) {
            hasProperty = false;
        }
        else if (!(Integer.valueOf(pandigital.substring(3, 6)) % 5 == 0)) {
            hasProperty = false;
        }
        else if (!(Integer.valueOf(pandigital.substring(4, 7)) % 7 == 0)) {
            hasProperty = false;
        }
        else if (!(Integer.valueOf(pandigital.substring(5, 8)) % 11 == 0)) {
            hasProperty = false;
        }
        else if (!(Integer.valueOf(pandigital.substring(6, 9)) % 13 == 0)) {
            hasProperty = false;
        }
        else if (!(Integer.valueOf(pandigital.substring(7, 10)) % 17 == 0)) {
            hasProperty = false;
        }
        return hasProperty;
    }

    private static void permutation(String input) {
        permutation("", input);
    }
    //Adds all permutations of a given string to an ArrayList
    private static void permutation(String perm, String toPermute) {
        if (toPermute.isEmpty()) {
            pandigitals.add(perm);
        }
        else {
            for (int i = 0; i < toPermute.length(); i++) {
                permutation(perm + toPermute.charAt(i), toPermute.substring(0, i) + toPermute.substring(i + 1));
            }
        }
    }
}
