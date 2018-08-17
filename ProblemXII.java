public class ProblemXII {

    private static int threshold = 500;

    public static void main(String[] args) {
        //outputs the smallest number divisible by over the threshold number of factors
        System.out.println(findTriangle());

    }

    public static int findTriangle()
            //Creates successive triangle numbers until one of them has enough factors and returns it
    {
        int triangle = 0;
        int counter = 1;
        while (!hasOverXFactors(triangle, threshold))
        {
            triangle += counter;
            counter++;
        }
        return triangle;
    }

    public static boolean hasOverXFactors(int n, int thresh)
            //checks if a number has over a certain number of factors
    {
        if (n < thresh) {
            return false;
        }
        int numFactors = 0;
        int rootN = (int) Math.sqrt(n);
        for (int i = 1; i <= rootN; i++)
        {
            if (n % i == 0) numFactors += 2;
        }
        if (rootN * rootN == n) numFactors--; //counted twice under this condition
        if (numFactors > thresh) return true;
        else return false;
    }
}
