class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        return minPathSum(m - 1, n - 1, grid, dp);
    }

    private int minPathSum(int m, int n, int[][] grid, int[][] dp) {
        if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        }

        if (m == 0 && n == 0) {
            return grid[m][n];
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        int up = minPathSum(m - 1, n, grid, dp);
        int left = minPathSum(m, n - 1, grid, dp);

        return dp[m][n] = grid[m][n] + Math.min(up, left);
    }
}
