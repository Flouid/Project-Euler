import com.sun.jmx.snmp.SnmpInt;

/**
 * An irrational decimal fraction is created by concatenating the positive integers:
 *
 * 0.123456789101112131415161718192021...
 *
 * It can be seen that the 12th digit of the fractional part is 1.
 *
 * If dn represents the nth digit of the fractional part, find the value of the following expression.
 *
 * d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
 */
public class ProblemXL {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 // Starts recording runtime
        int product = 1;
        String irrational = generateIrrational();
        for (int i = 0; i <= 6; i ++) {
            product *= Character.getNumericValue(irrational.charAt((int) Math.pow(10, i) + 1));
        }
        System.out.println(product);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       // Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    // Outputs runtime
    }

    private static String generateIrrational() {
        StringBuilder irrational = new StringBuilder("0.123456789");
            for (int integer = 1; irrational.length() <= 1000000; integer++) {
                irrational.append(integer);
                for (int digit = 0; digit <= 8; digit++) {
                    irrational.append(digit).append(integer);
                }
                irrational.append(9);
            }
        return irrational.toString();
    }
}
