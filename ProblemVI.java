package com.flouid;

public class ProblemVI {


    public static void main(String[] args) {
        int SumOfSquares = 0;
        int SquareOfSum = 0;
        for (int i = 1; i < 101; i++)
        {
            SumOfSquares += i * i;
        }
        for (int i = 1; i < 101; i++)
        {
            SquareOfSum += i;
        }
        System.out.println(SumOfSquares - (SquareOfSum * SquareOfSum));
    }
}
