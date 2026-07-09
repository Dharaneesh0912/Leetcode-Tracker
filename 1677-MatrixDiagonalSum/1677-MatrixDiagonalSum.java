// Last updated: 7/9/2026, 3:06:07 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];                   // primary diagonal
            if (i != n - 1 - i) {               // avoid double-counting center
                sum += mat[i][n - 1 - i];       // secondary diagonal
            }
        }

        return sum;
    }
}
