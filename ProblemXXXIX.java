import java.util.ArrayList;

/**
 * If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.
 *
 * {20,48,52}, {24,45,51}, {30,40,50}
 *
 * For which value of p ≤ 1000, is the number of solutions maximised?
 */

public class ProblemXXXIX {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 // Starts recording runtime
        ArrayList<ArrayList<Integer>> listOfTriples = findTriplesBelow(1000);
        int numSolutions;
        int mostSolutions = 0;
        int nWithMostSolutions = 0;
        for (int i = 5; i <= 1000; i++) {
            numSolutions = 0;
            for (ArrayList<Integer> triple: listOfTriples) {
                if (triple.get(0) + triple.get(1) + triple.get(2) == i) {
                    numSolutions++;
                }
                if (numSolutions > mostSolutions) {
                    mostSolutions = numSolutions;
                    nWithMostSolutions = i;
                }
            }
        }
        System.out.println(nWithMostSolutions);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       // Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    // Outputs runtime

    }

    private static ArrayList<ArrayList<Integer>> findTriplesBelow(int n) {
        ArrayList<ArrayList<Integer>> listOfTriples = new ArrayList<>();
        ArrayList<Integer> triple;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                for (int c = 1; c < n; c++) {
                    if ((Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))) {
                        triple = new ArrayList<>();
                        triple.add(a);
                        triple.add(b);
                        triple.add(c);
                        listOfTriples.add(triple);
                    }
                }
            }
        }
        return listOfTriples;
    }
}
