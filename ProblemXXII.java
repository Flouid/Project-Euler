import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Solves Problem 22 on Project Euler
 *
 * The Problem:
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing
 * over five-thousand first names, begin by sorting it into alphabetical order. Then working
 * out the alphabetical value for each name, multiply this value by its alphabetical position
 * in the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth
 * 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain
 * a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */

public class ProblemXXII {
    public static void main(String[] args) throws IOException {
        int wordSum;
        long totalNameScore = 0;
        int index = 0;
        String[] text = getText().split(",");
        Arrays.sort(text);
        for (String name : text) {
            wordSum = 0;
            for (int i = 0; i < name.length(); i++) {
                wordSum += getLetterValue(name.charAt(i));
            }
            index++;
            totalNameScore += wordSum * index;
        }
        System.out.println(totalNameScore);
    }

    public static String getText() throws IOException {
        // Opens the text file and stores it in a string, since the text file is all one line
        File names = new File("./names.txt");
        Scanner reader = new Scanner(names);
        return reader.nextLine();
    }

    public static int getLetterValue(char letter) {
        // Takes any capital letter and returns its position in the alphabet
        String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if (Character.isUpperCase(letter)) {
            return ALPHABET.indexOf(letter) + 1;
        }
        else {
            return alphabet.indexOf(letter) + 1;
        }
    }
}
