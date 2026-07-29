class Solution {
    public int minInsertions(String s) {
        return s.length() - lps(s);
    }

     public static int lps(String s1){
        String s2 = "";
        //
        for(int i = s1.length()-1; i>=0; i--){
            s2 += s1.charAt(i);
        }
        ////////////////////
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        // make a dp table
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else{
                    dp[i][j] =  Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }
}