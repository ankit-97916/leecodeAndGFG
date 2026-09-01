class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
       int start  = 0;
       int end  = position[position.length-1]-position[0];
       int ans  = 0;
      while(start <= end){
        int mid =  (start+end)/2;
        if(isPossible(position, m, mid)){
            ans  = mid;
            start  = mid+1;

        }else{
            end = mid-1;
        }
      } 

      return ans;
    }
    public static boolean isPossible(int[] position, int m , int maxDistance){
        int count = 1;
        int lastPosition = position[0];
        for(int i=1; i<position.length; i++){
            if(position[i] - lastPosition >= maxDistance){
                count++;
                lastPosition =  position[i];

            }
        }
        if(count >= m){
            return  true;
        }
        return false;
    }
}