public class MatrixDiagonalSums {

    public static void printDiagonalSums(int[][] matrix) {
        int n = matrix.length; // Assuming a square matrix
        int principalDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Condition for principal diagonal
                if (i == j) {
                    principalDiagonalSum += matrix[i][j];
                }
                // Condition for secondary diagonal
                if ((i + j) == (n - 1)) {
                    secondaryDiagonalSum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of Principal Diagonal: " + principalDiagonalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);
        System.out.println("The Sum of the Diagonals: " + (principalDiagonalSum+secondaryDiagonalSum));
    }

    public static void main(String[] args) {
        int[][] myMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printDiagonalSums(myMatrix);
    }
}
