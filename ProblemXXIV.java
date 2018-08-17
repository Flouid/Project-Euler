/**
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation
 * of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically,
 * we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
 *
 * 012   021   102   120   201   210
 *
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
import java.util.ArrayList;
import java.util.Collections;
public class ProblemXXIV {
    private static ArrayList<String> permutations = new ArrayList<>();
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                         //Starts recording runtime
        permutation("0123456789");                                    //String we are solving for is 0123456789
        Collections.sort(permutations);                                     //Sorts the list into numerical order
        System.out.println(permutations.get(999999));                       //Prints the 1000000th permutation
        final double duration = (System.nanoTime() - startTime)/1000000000; //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");            //Outputs runtime
}

    private static void permutation(String input) {
        permutation("", input);
    }
    //Adds all permutations of a given string to an ArrayList
    private static void permutation(String perm, String toPermute) {
        if (toPermute.isEmpty()) {
            permutations.add(perm);
        }
        else {
            for (int i = 0; i < toPermute.length(); i++) {
                permutation(perm + toPermute.charAt(i), toPermute.substring(0, i) + toPermute.substring(i + 1));
            }
        }
    }
}
