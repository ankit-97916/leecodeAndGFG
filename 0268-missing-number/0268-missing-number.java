class Solution {
    public int missingNumber(int[] arr) {
  // bit manipulation--
  int xor = 0;
  for(int i=0; i<=arr.length; i++){
    xor = xor ^ i;
  }
  for(int i=0; i<arr.length; i++){
    xor = xor ^ arr[i];
      }

      return xor;


    }
}