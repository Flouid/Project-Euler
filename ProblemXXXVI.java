/**
 * The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
 *
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 *
 * (Please note that the palindromic number, in either base, may not include leading zeros.)
 */

public class ProblemXXXVI {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 // Starts recording runtime
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            if ((isPalindrome(String.valueOf(i))) && (isPalindrome(Integer.toBinaryString(i)))) {
                sum += i;
            }
        }
        System.out.println(sum);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       // Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    // Outputs runtime
    }

    public static boolean isPalindrome(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return (str.equals(reverse.toString()));
    }
}
