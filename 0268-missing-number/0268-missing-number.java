class Solution {
    public int missingNumber(int[] arr) {
  // bit manipulation--
  int xorOfrange = 0;
  for(int i=0; i<=arr.length; i++){
    xorOfrange = xorOfrange ^ i;
  }

  int xorOfelemnt =0;
  for(int i=0; i<arr.length; i++){
    xorOfelemnt = xorOfelemnt ^ arr[i];
      }

      return xorOfrange ^ xorOfelemnt;


    }
}