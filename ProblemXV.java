import java.util.Arrays;
public class ProblemXV {
    public static void main(String[] args) {
        long grid[][] = new long[20][20];
        for (int x = 0; x < 20; x++)
        {
            for (int y = 0; y < 20; y++)
            {
                if ((x == 0) && (y == 0)) {
                    grid[y][x] = 2;
                }
                else if (x == 0)
                {
                    grid[y][x] = grid[y - 1][x] + 1;
                }
                else if (y == 0)
                {
                    grid[y][x] = grid[y][x - 1] + 1;
                }
                else
                {
                    grid[y][x] = grid[y - 1][x] + grid[y][x - 1];
                }
            }
        }
        System.out.println(grid[19][19]);

    }
}
