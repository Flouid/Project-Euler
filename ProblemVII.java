import java.util.ArrayList;
import java.util.List;
public class ProblemVII {
    public static void main(String[] args) {
        //Checks if every single number is prime and adds it to a list if it is. Stops at 10001 primes
        List<Integer> primesList = new ArrayList<>();
        int i = 2;
        while (primesList.size() < 10002) {
            if (isPrime(i))
                primesList.add(i);
            i++;
        }
        System.out.println(primesList); //Outputs 10001rst prime
    }


    public static boolean isPrime(long n) {
        //Checks if a number is negative
        if (n < 2)
            return false;
        //checks if a number is 2
        else if (n == 2)
            return true;
        //Checks if a number is divisible by 2
        else if (n % 2 == 0)
            return false;
        //checks if a number is divisible by any odd numbers
        for (int i = 3; i*i <= n; i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}

