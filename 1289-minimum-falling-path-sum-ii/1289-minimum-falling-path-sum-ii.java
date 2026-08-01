class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int ans = Integer.MAX_VALUE;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -999999);
		}
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(matrix, 0, i, dp));
		}

        return ans;
        
    }

    private static int Falling_Path_Sum(int[][] matrix, int cr, int cc, int[][] dp) {
		// TODO Auto-generated method stub
		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!= -999999) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < matrix.length; col++) {
			if (col == cc) {
				continue;
			}

            ans = Math.min(ans, Falling_Path_Sum(matrix, cr + 1, col, dp));

		}
		return dp[cr][cc] = ans + matrix[cr][cc];
	}
}