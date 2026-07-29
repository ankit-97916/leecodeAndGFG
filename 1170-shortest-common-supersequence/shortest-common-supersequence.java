class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        return printscs(str1, str2);
    }

    public static String printscs(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        // mal dp table--
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j =1 ; j<=n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        // printign process-
        int i = m;
        int j = n;
        String ans = "";
        while(i > 0 && j > 0 ){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                ans = s1.charAt(i-1) + ans;
                i--;
                j--;
            }else if(dp[i-1][j] > dp[i][j-1]){
                ans = s1.charAt(i-1)+ ans;
                i--;
            }else{
                ans = s2.charAt(j-1)+ ans;
                j--;

            }
        }
        // first string k character bach jaye jab---
        while(i > 0){
            ans = s1.charAt(i-1) + ans;
            i--;
        }
        //
        while(j > 0){
            ans = s2.charAt(j-1) + ans;
            j--;
        }
        return ans;
    }


}