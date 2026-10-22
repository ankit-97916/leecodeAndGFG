class Solution {
    public int missingNumber(int[] arr) {
        int xorOfrange = 0;
        int xorOfelement = 0;
        for(int i=0; i<arr.length; i++){
            xorOfrange = xorOfrange ^ i+1; 
            xorOfelement = xorOfelement^arr[i];
        }
        return xorOfrange^xorOfelement;
    }
}