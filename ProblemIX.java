public class ProblemIX {
    public static void main(String[] args) {
        //solves the system of equations a^2 + b^2 = c^2 and a + b + c = 1000 by brute force
        for (int c = 1; c < 1000; c++)
        {
            for (int b = 1; b < 1000; b++)
            {
                for (int a = 1; a < 1000; a++)
                {
                    if ((a*a + b*b == c*c) && (a + b + c == 1000))
                        System.out.println(a * b * c);
                }
            }
        }
    }
}
