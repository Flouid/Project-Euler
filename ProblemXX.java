import java.math.BigInteger;

public class ProblemXX {
    public static void main(String[] args) {
        BigInteger n = new BigInteger(factorial(100).toString());
        System.out.println(BigIntegerSum(n));
    }

    public static BigInteger factorial(int number) {
        //Multiplies a number n by n - 1, n - 2... 1
        BigInteger result = new BigInteger("1");
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }

    private static int BigIntegerSum(BigInteger n)
    {
        //Mods off the last digit and adds it to the sum, then cuts off last digit by int dividing by 10
        int sum = 0;
        int length = n.toString().length();
        for (int i = 0; i < length; i++)
        {
            sum += n.mod(BigInteger.TEN).intValue();
            n = n.divide(BigInteger.TEN);
        }
        return sum;
    }
}
