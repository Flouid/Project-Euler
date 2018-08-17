import java.math.BigInteger;
public class ProblemXVI {
    //Sums up the digits of 2 to the power of 1000
    public static void main(String[] args) {

        //Declarations
        BigInteger n = new BigInteger("2"); //the long number, initialized as 2
        n = n.pow(1000);                        //raising the long number to the power of 1000
        int sum = 0;                            //sum of the digits
        int length = n.toString().length();     //the length of the long number

        //mods off the last digit and adds it to the sum, then cuts off last digit by int dividing by 10
        for (int i = 0; i < length; i++)
        {
            sum += n.mod(BigInteger.TEN).intValue();
            n = n.divide(BigInteger.TEN);
        }
        System.out.println(sum);
    }
}
