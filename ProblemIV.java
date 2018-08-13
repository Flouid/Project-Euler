package com.flouid;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ProblemIV {


    private static boolean is_palindrome(int product)
    {
        String reverse = "";
        String to_check = String.valueOf(product);
        int length = to_check.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + to_check.charAt(i);
        if (to_check.equals(reverse))
            return true;
        else
            return false;
    }


    public static void main(String[] args)
    {
        List palindromes = new ArrayList();
        for (int x = 999; x > 100; x--)
        {
            for (int y = 999; y > 100; y--)
            {
                if (is_palindrome(x * y))
                    palindromes.add(x * y);
            }
        }
        System.out.println(Collections.max(palindromes));

    }
}