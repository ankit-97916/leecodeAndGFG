class Solution {
    public int numOfSubarrays(int[] arr, int k, int target) {
        return number(arr, k, target );
    }
    public static int number(int[] arr, int k , int target){
        int i = 0;
        int j = 0;
        int sum = 0;
        double average = 0 ;
        int count = 0;
        while(j <arr.length){
            sum =  sum+arr[j];
            average =(double)sum/k;

            if(j-i+1 == k ){
                if(average >= target){
                    count++;
                }
                  
                  sum = sum-arr[i];
                  i++;
            }
            j++;

        }
        return count;
    }
}