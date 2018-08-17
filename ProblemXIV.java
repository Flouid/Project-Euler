public class ProblemXIV {
    public static void main(String[] args) {
        //Creates Collatz sequences, and finds the longest one under a million

        //Declarations
        int sequenceLength;             //Length of current Collatz sequence
        int largestSequence = 0;        //Length of longest Collatz sequence
        long iWithLongestSequence = 0;  //Number with longest Collatz sequence
        long n;                         //Placeholder for in-progress sequences

        //Checks every number below 1 million with Collatz conjecture
        for (int i = 3; i < 1000000; i++)
        {
            n = i;
            sequenceLength = 1;
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;          //Divides n by 2 if it is even
                }
                else {
                    n = (3 * n) + 1;    //Multiplies n by 3 and adds 1 if it is odd
                }
                sequenceLength++;
            }
            if (sequenceLength > largestSequence) {
                //If the sequence is the longest one generated so far, it sets i and n to be the current i and n
                largestSequence = sequenceLength;
                iWithLongestSequence = i;
            }
        }
        System.out.println(iWithLongestSequence);
        System.out.println(largestSequence);
    }
}
