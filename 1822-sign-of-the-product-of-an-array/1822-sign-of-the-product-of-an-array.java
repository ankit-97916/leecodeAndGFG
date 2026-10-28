class Solution {
    public int arraySign(int[] arr) {
        int neg = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] ==  0){
                return  0;
            }
            //
            if(arr[i] < 0){
                neg++;
            }
            //
        }
        if(neg%2 == 0){
            return 1;
        }
        return -1;
    }
}