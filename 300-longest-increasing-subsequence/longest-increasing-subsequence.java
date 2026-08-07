class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        // because j = -1
        int[][] dp  = new int[n+1][n+1];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return longest(arr, 0, -1, dp);
    }
    public static int longest(int[] arr, int i, int j, int[][] dp){
       if(i == arr.length){
        return 0;
       }

       if(dp[i][j+1] != -1){
        return dp[i][j+1];
       }
        int take = 0;
        if(j == -1 || arr[i] > arr[j] ){
            take = 1 + longest(arr, i+1, i, dp);
        }
        int donttake = longest(arr, i+1, j, dp);

        return dp[i][j+1] =  Math.max(take , donttake);
    }
}