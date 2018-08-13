package com.flouid;

public class ProblemI {


    public static void main(String[] args) {
        // checks every number from 0 to 999 and outputs the sum of all numbers divisible by 3 or 5
        int sum = 0;
        for (int i = 0; i < 1000; i++)
        {
            if (i % 3 == 0)
                sum += i;
            else if (i % 5 == 0)
                sum += i;
        }
        System.out.println(sum);

    }
}

