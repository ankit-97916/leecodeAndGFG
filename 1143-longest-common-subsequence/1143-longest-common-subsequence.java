class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length()-1;
        int n = text2.length()-1;
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        return common(text1, text2, dp, text1.length()-1, text2.length()-1);
    }
    public static int common(String text1, String text2, int[][] dp, int m, int n){
        if(m < 0 || n < 0){ // base case--
            return 0;
        }
         //apply dp
         if(dp[m][n] != -1){
            return dp[m][n];
         }
        if(text1.charAt(m) == text2.charAt(n)){
            return dp[m][n] =  1 + common(text1, text2, dp, m-1, n-1);
        }else{
            return dp[m][n] =  Math.max(common(text1 ,text2, dp, m-1 , n),
                            common(text1, text2,dp, m , n-1));
        }
    }
}