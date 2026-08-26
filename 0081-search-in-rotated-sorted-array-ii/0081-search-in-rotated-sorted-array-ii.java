class Solution {
    public boolean search(int[] nums, int target) {
        return isExist(nums, target);
    }
    // p
    public static boolean isExist(int[] arr, int target){
        int st = 0;
        int end = arr.length-1;{
            while(st <= end){
                int mid = st+(end-st)/2;
                // target on mid
                if(arr[mid] == target){
                    return true;
                }
                // case to hndle duplicates--
                if(arr[st] == arr[mid]&& arr[mid] == arr[end]){
                    st++;
                    end--;
                }
               else if(arr[st] <= arr[mid]){ // left part sorted condition
                   if(target >= arr[st] && target <= arr[mid]){
                    end = mid-1;
                   }else{
                    st = mid+1;
                   }

                }else{ // right part sorted condition-
                if(target >= arr[mid] && target <= arr[end]){
                    st = mid+1;
                }else {
                    end = mid-1;
                }

                }

            }
        }
        return false; // if not exist -
    }
}