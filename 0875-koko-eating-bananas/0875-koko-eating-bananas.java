class Solution {
    public int minEatingSpeed(int[] arr, int h) {
         int max  = 0;
         for(int i=0; i<arr.length; i++){
            max  = Math.max(max , arr[i]);
         }
         int start =1;
         int end = max;
         int ans  = -1;
         while(start <= end){
            int mid =  (start+(end-start)/2);
            if(isValid(arr, h,  mid)){
                ans  = mid;
                end  = mid-1;
            }else{
                start = mid+1;
            }
         }

         return ans;
    }

    public static boolean isValid(int[] arr, int h , int k){
        long totalHours = 0;
        for(int i=0; i<arr.length; i++){
            totalHours += (long)(arr[i] + k-1)/k;
        }

        if(totalHours  > h){
            return false;
        }
        return true;
    }
}