class Solution {
    public int search(int[] nums, int target) {
        return searchTarget(nums, target);
    }

    public static int searchTarget(int[] arr, int target){
        int st = 0;
        int end = arr.length-1;
        while(st <= end){
            int mid = (st+end)/2;
            //left part is sorted--
             if(target == arr[mid]){
                return mid;
             }

            if(arr[st] <= arr[mid]){ // left
                if(target >= arr[st] && target <= arr[mid]){ // taget exist in left
                    end = mid-1;
                }else{
                    st = mid+1;
                }

            }else{

                // arr[mid] <= aee[end] // right
                if(target >= arr[mid]  && target <= arr[end]){ // target right
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}