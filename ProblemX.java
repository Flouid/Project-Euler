import java.util.ArrayList;
import java.util.List;
public class ProblemX {
    public static void main(String[] args) {
        //Adds up the first 2 million primes
        List<Integer> primesList = new ArrayList<>();
        long sum = 0;
        for (int i = 2; i <= 2000000; i++) {
            if (ProblemVII.isPrime(i)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}