package com.flouid;


import static com.flouid.ProblemIII.IsPrime;

public class ProblemVII {


    public static void main(String[] args) {
        int PrimeCounter = 0;
        int GenericCounter = 2;
        while (PrimeCounter < 10001)
        {
            GenericCounter++;
            if (IsPrime(GenericCounter))
            {
                PrimeCounter++;
                System.out.println(GenericCounter);
                System.out.println(IsPrime(GenericCounter));
            }
        }
        System.out.println(GenericCounter);
    }
}
