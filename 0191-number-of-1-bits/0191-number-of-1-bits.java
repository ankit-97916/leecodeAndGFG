class Solution {
    public int hammingWeight(int n) {
        int setbit = 0;
        while(n > 0){
          if(n%2 == 1){
            setbit++;
          }
          n = n/2;
           } 
        
        return setbit;
    }
}