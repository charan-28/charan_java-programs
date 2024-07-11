import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            System.out.println("Enter the matrix elements:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                int rowSum = 0;
                for (int j = 0; j < n; j++) {
                    rowSum += matrix[i][j];
                }
                matrix[i][n - 1] = rowSum;
            }
            for (int j = 0; j < n; j++) {
                int colSum = 0;
                for (int i = 0; i < n; i++) {
                    colSum += matrix[i][j];
                }
                matrix[n - 1][j] = colSum;
            }
            int diagonalProduct = 1;
            for (int i = 0; i < n; i++) {
                diagonalProduct *= matrix[i][i];
            }
            matrix[n - 1][n - 1] = diagonalProduct;
            System.out.println("Updated Matrix:");
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
