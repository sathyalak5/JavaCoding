public class DiagonalsSum {

    public static void printDiagonalsSum(int[][] matrix) {
        int n = matrix.length; // Assuming a square matrix
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];           // Primary diagonal
            sum += matrix[i][n - 1 - i];   // Secondary diagonal
        }

        // If n is odd, subtract the middle element once because it was added twice
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];
        }

        System.out.println("The Sum of the Diagonals: " + sum);
    }

    public static void main(String[] args) {
        int[][] myMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printDiagonalsSum(myMatrix);
    }
}
