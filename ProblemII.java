package com.flouid;

public class ProblemII {


    public static void main(String[] args) {
        // Generates fibonacci numbers up to 4 million and outputs the sum of all even numbers
        int fibI = 1;
        int fibII = 1;
        int fibIII = 0;
        int sum = 0;
        while (fibI < 4000000)
        {
            fibIII = fibI + fibII;
            if (fibIII % 2 == 0)
                sum += fibIII;
            fibI = fibII;
            fibII = fibIII;
        }
        System.out.println(sum);
    }
}
