// 73. Set Matrix Zeroes
// https://leetcode.com/problems/set-matrix-zeroes/description/?envType=daily-question&envId=2025-05-21

class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
    int m = matrix[0].length;

    // Make a deep copy of the matrix
    int[][] matrix2 = new int[n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matrix2[i][j] = matrix[i][j];
        }
    }

     for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] == 0) {
                // Set entire row and column to 0 in matrix2
                for (int k = 0; k < m; k++) {
                    matrix2[i][k] = 0;
                }
                for (int k = 0; k < n; k++) {
                    matrix2[k][j] = 0;
                }
            }
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matrix[i][j] = matrix2[i][j];
        }
    }

    }
}