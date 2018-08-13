package com.flouid;

import java.util.ArrayList;
import java.util.List;
public class ProblemIII {


    public static void main(String[] args) {
        long toFactor = 600851475143L;
        System.out.println(LargestPrimeFactor(toFactor));
    }


    private static List<Long> PrimeGenerator(long n) {
        //generates a list of prime factors, not useful in this case as it uses too much memory
        List<Long> PrimesList = new ArrayList<>();
        long i = 2;
        while (i * i <= n) {
            if (n % i != 0) {
                i++;
            } else if (n == n / i) {
                n /= i;
                PrimesList.add(i);
            }
        }
        return PrimesList;
    }


    private static int LargestPrimeFactor(long n) {
        //goes from the highest possible value down looking for a valid prime number that divides a given input
        int i = 755146;
        while (i * i <= n)
        {
            if (n % i != 0)
            {
                i--;
            }
            else if (IsPrime(i))
            {
                break;
            }
            else
            {
                i--;
            }
        }
        return (i);
    }

    public static boolean IsPrime(int n) {
        //checks if a number is prime by dividing it by every number up to its square root
        for (int i = 2; i <= (int) Math.sqrt(n) - 1; i++) {
            if (n % i == 0)
            {
                return (false);
            }
        }
        return (true);
    }
}