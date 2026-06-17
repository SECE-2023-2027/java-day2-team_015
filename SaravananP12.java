import java.util.*;

public class SaravananP12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input number of rows/columns (0 to exit)");
            if (!sc.hasNextInt()) break;
            int n = sc.nextInt();
            if (n == 0) break;
            
            int[][] grid = new int[n][n];
            int[] rowSums = new int[n];
            int[] colSums = new int[n];
            int totalSum = 0;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (sc.hasNextInt()) {
                        grid[i][j] = sc.nextInt();
                        rowSums[i] += grid[i][j];
                        colSums[j] += grid[i][j];
                        totalSum += grid[i][j];
                    }
                }
            }
            
            System.out.println("Result:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%5d", grid[i][j]);
                }
                System.out.printf("%5d\n", rowSums[i]);
            }
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", colSums[j]);
            }
            System.out.printf("%5d\n", totalSum);
        }
    }
}
