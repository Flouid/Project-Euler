public class ProblemXXI {
    public static void main(String[] args) {
        //Checks if a number is amicable and adds it to a sum if it is
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            if ((i == factorSum(factorSum(i))) && (i != factorSum(i))) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static int factorSum(int n) {
        //Adds up all the factors of a number less than that number
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
