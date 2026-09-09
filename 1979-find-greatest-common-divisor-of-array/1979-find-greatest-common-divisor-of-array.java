class Solution {
    public int findGCD(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
           min = Math.min(arr[i], min);
           max = Math.max(arr[i], max);
        }

        while(max%min != 0){
           int remainder  = max%min;
           max = min;
           min = remainder;
        }
        return min;
    }
}