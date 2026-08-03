class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){// edge case
            return false;
        }
        if((n  &(n-1)) == 0){ // bit masking---
            return true;
        }
        return false;
    }
}