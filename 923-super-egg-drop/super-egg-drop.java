class Solution {
    public int superEggDrop(int k, int n) {
        int[][] dp = new int[k+1][n+1];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return egg(k, n, dp);
    }
    public static int egg(int k , int n, int[][] dp){
        if(n == 1 || n == 0){
            return n;
        }
        if(k == 1){
            return n;
        }
        // apply dp
        if(dp[k][n] != -1){
            return dp[k][n];
        }
        // binary approach to find floor--
        int ans = Integer.MAX_VALUE;
        int low = 1;
        int high = n;

        while(low <= high){
            int mid = (low+high)/2;
            int breakEgg = egg(k-1, mid-1, dp);
            int dontBreak = egg(k, n-mid, dp);
            int curr =  Math.max(breakEgg, dontBreak)+1;
            ans = Math.min(ans, curr);

            if(breakEgg < dontBreak){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return dp[k][n] = ans;

    }
}