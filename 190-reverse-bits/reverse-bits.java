class Solution {
    public int reverseBits(int n) {
         int ans = 0;
         for(int i=0; i<32; i++){
             ans = ans << 1;// shft left----
             ans = ans | (n & 1); // add last 
             n = n >>> 1; //  
         }
         return ans;
    }
}