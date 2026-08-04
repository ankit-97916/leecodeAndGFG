class Solution {
    public double findMaxAverage(int[] nums, int k) {
        return maxAverage(nums, k );
    }
    public static double maxAverage(int[] arr, int k){
         double maxAve =   -Double.MAX_VALUE;
         double ave = 0;
         int sum = 0;
         int i = 0;
         int j = 0;
         while(j < arr.length){
            
            sum = sum + arr[j]; // add curent element --- 
            ave = (double) sum/k; // calculate averge current -

            if(j-i+1 == k){
                maxAve = Math.max(maxAve, ave);
                sum = sum - arr[i];
                i++;
            }
            j++;
         }

         return  maxAve;
    }
}