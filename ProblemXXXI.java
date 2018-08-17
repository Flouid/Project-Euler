/**
 * In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
 *
 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
 * It is possible to make £2 in the following way:
 *
 * 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
 * How many different ways can £2 be made using any number of coins?
 */

public class ProblemXXXI {
    public static void main(String[] args) {
        final double startTime = System.nanoTime();                                 //Starts recording runtime
        int numWays = 0;
        for (int a = 0; a <= 1; a++) {
            if (a * 200 <= 200) {
                for (int b = 0; b <= 2; b++) {
                    if (a * 200 + b * 100 <= 200) {
                        for (int c = 0; c <= 4; c++) {
                            if (a * 200 + b * 100 + c * 50 <= 200) {
                                for (int d = 0; d <= 10; d++) {
                                    if (a * 200 + b * 100 + c * 50 + d * 20 <= 200) {
                                        for (int e = 0; e <= 20; e++) {
                                            if (a * 200 + b * 100 + c * 50 + d * 20 + e * 10 <= 200) {
                                                for (int f = 0; f <= 40; f++) {
                                                    if (a * 200 + b * 100 + c * 50 + d * 20 + e * 10 + f * 5 <= 200) {
                                                        for (int g = 0; g <= 100; g++) {
                                                            if (a * 200 + b * 100 + c * 50 + d * 20 + e * 10 + f * 5 + g * 2 <= 200) {
                                                                for (int h = 0; h <= 200; h++) {
                                                                    if (a * 200 + b * 100 + c * 50 + d * 20 + e * 10 + f * 5 + g * 2 + h == 200) {
                                                                        numWays++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(numWays);
        final double duration = (System.nanoTime() - startTime) / 1000000000;       //Calculates runtime in seconds
        System.out.println("found in " + duration + " seconds");                    //Outputs runtime
    }
}
