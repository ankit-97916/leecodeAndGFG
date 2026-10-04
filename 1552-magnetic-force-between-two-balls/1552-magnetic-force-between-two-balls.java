class Solution {
    public int maxDistance(int[] arr, int ball) {
        int start =  1;
        int low = 0;
        int max  =0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
            low = Math.min(arr[i], low);

        }

        int end =  max-low;
        int  ans  = 0;
        while(start <= end){
            int mid = (start+end)/2;
            if(isValid(arr, ball, mid)){
                ans = mid;
                start = mid+1;

            }else{
                end = mid-1;
            }
        }

        return ans;
    }
    public static boolean isValid(int[] arr, int ball, int maxAllowedForce){
        Arrays.sort(arr);
        int ballCount = 1;
        int lastDistance =  arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] - lastDistance >= maxAllowedForce){
                ballCount++;
                lastDistance = arr[i];

            }
            if(ballCount == ball){
                return true;
            }
        }

        return false;
        
    }
}