package com.flouid;

public class ProblemV {


    public static void main(String[] args) {
        //ok check each number if it is divisible by each number from 1-20 until an answer is found
        int n = 20;
        int flag = 0;
        while (flag == 0)
        {
            for (int i = 1; i < 21; i++)
            {
                if (n % i != 0)
                {
                    break;
                }
                else if(i == 20)
                {
                    flag = 1;
                }
            }
            n++;
        }
        System.out.println(n - 1);
    }
}
