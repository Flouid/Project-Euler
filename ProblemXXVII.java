import java.util.ArrayList;

/**
 * Euler discovered the remarkable quadratic formula:
 *
 * n^2+n+41
 *
 * It turns out that the formula will produce 40 primes for the consecutive integer values 0≤n≤39. However,
 * when n=40,40^2+40+41=40(40+1)+41 is divisible by 41, and certainly when n=41,41^2+41+41 is clearly divisible by 41.
 *
 * The incredible formula n^2−79n+1601 was discovered, which produces 80 primes for the consecutive values 0≤n≤79.
 * The product of the coefficients, −79 and 1601, is −126479.
 *
 * Considering quadratics of the form:
 *
 * n^2+an+b, where |a|<1000 and |b|≤1000
 *
 * where |n| is the modulus/absolute value of n
 * e.g. |11|=11 and |−4|=4
 * Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number
 * of primes for consecutive values of n, starting with n=0.
 */

public class ProblemXXVII {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        int n;
        int highestN = 0;
        int productOfCoefficientsForHighestN = 0;
        ArrayList<Integer> positivePrimes = ProblemXXVI.primeList(1000);
        ArrayList<Integer> primes = new ArrayList<>();
        for (int prime: positivePrimes) {
            //Creates an ArrayList with all the primes from 0 to 1000 and their negative counterparts
            primes.add(-prime);
            primes.add(prime);
        }
        for (int a: primes) {
            for (int b: primes) {
                //Checks every prime with every other prime
                n = 0;
                while (ProblemVII.isPrime((int) (Math.pow(n, 2) + (n * a) + b))) {
                    //Checks if the result of n^2 + a * n + b = a prime number, if so it increments n, if not n is reset
                    n++;
                    if (n > highestN) {
                        //If n is higher than any previous it is set as the new value and its coefficients are multiplied together
                        highestN = n;
                        productOfCoefficientsForHighestN = a * b;
                    }

                }
            }
        }
        System.out.println("the most primes generated were " + highestN + " and the product of the coefficients was " + productOfCoefficientsForHighestN);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }
}
