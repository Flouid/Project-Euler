public class ProblemXVII {
    public static void main(String[] args) {
        int oneToNine = (3 + 3 + 5 + 4 + 4 + 3 + 5 + 5 + 4);
        //Number of letters in one, two, three, four, five, six, seven, eight, nine
        int tenToNineteen = (3 + 6 + 6 + 8 + 8 + 7 + 7 + 9 + 8 + 8);
        //Number of letters in ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen
        int twentyToNinetyNine = 10 * (6 + 6 + 5 + 5 + 5 + 7 + 6 + 6) + 8 * oneToNine;
        //Number of letters in 10 instances of twenty, thirty, forty, fifty, sixty, seventy, eighty, ninety + 8 instances of 1 to 9
        int oneHundredToNineHundredNinetyNine = (oneToNine * 100) + (9 * 7) + (9 * (oneToNine + tenToNineteen + twentyToNinetyNine) + (891 * 10));
        //Number of letters in 100 instances of 1 to 9, 9 instances of hundred, 9 instances of 1 to 99, and 891 instances of hundred and
        int oneThousand = 11;
        //Number of letters in one thousand
        int total = oneToNine + tenToNineteen + twentyToNinetyNine + oneHundredToNineHundredNinetyNine + oneThousand;

        System.out.println(total);
    }
}
