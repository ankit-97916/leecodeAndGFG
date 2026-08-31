class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int start = 0, end  = 0, ans = -1; 
        for(int i=0; i<arr.length; i++){
            start = Math.max(arr[i], start);
            end += arr[i];
        }

        while(start <= end){
            int mid = (start+end)/2;
            if(isPossible(arr, days,mid)){
                ans = mid;
                end  = mid-1;
            }else {
                start  = mid+1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int [] arr, int days, int maxCapacity){
        int day  = 1;
        int weight  = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i] + weight <= maxCapacity){
                weight += arr[i];
            }else{
                day++;
                weight = arr[i];
            }
        }

        if(day > days){
            return false;
        }

        return true;
    }
}