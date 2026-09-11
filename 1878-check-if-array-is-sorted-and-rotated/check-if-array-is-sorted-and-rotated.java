class Solution {
    public boolean check(int[] arr) {
        if(arr.length == 1){
            return true;
        }
        int count = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                count++;
            }  
        }

         if(arr[arr.length-1] > arr[0]){
                count++;
            }

             if(count <= 1){
                return true;
            }

        return false;
    }
}