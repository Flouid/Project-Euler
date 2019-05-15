import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the first ten triangle numbers are:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * By converting each letter in a word to a number corresponding to its alphabetical position and adding these values
 * we form a word value. For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a
 * triangle number then we shall call the word a triangle word.
 *
 * Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly two-thousand
 * common English words, how many are triangle words?
 */

public class ProblemXLII {
    public static void main(String[] args) throws IOException {
        final double startTime = System.nanoTime();                                 //Starts recording runtime

        //Declarations
        File names = new File("words.txt");
        Scanner reader = new Scanner(names);
        String[] text = reader.nextLine().split(",");
        ArrayList<Integer> triangleList = triangleNumberList(1000);
        int triangleWordCounter = 0;
        int wordSum;

        //Goes through every word in the text and checks if the sum of its letters is a triangle number, increments a counter if so
        for (String word: text) {
            wordSum = 0;
            for (int i = 0; i < word.length(); i++) {
                wordSum += ProblemXXII.getLetterValue(word.charAt(i));
            }
            if (triangleList.contains(wordSum)) {
                triangleWordCounter++;
            }
        }
        System.out.println(triangleWordCounter);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }

    public static ArrayList<Integer> triangleNumberList(int n) {
        //generates a list of n triangle numbers (y values that satisfy y = x/2(x + 1) where x is an integer)
        ArrayList<Integer> triangleList = new ArrayList<>();
        for (double i = 1; i <= n; i++) {
            triangleList.add((int) ((i / 2) * (i + 1)));
        }
        return triangleList;
    }
}
