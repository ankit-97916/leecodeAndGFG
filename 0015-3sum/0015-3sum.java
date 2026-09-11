class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<arr.length-2; i++){
            if(i > 0  && arr[i] == arr[i-1]){
                continue;}
            int left = i+1;
            int right = arr.length-1;
            while(left < right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum == 0){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                     temp.add(arr[left]);
                      temp.add(arr[right]);
                      ans.add(temp);

                      // handle  dupicate of left side
                while(left < right && arr[left] == arr[left+1]){
                    left++;
                }
                     // handle  dupicate of right side
                 while(left < right && arr[right] == arr[right-1]){
                    right--;
                }
                left++;
                right--;
                }
                else if(sum < 0){
                left++;
            }else{
                right--;
            }
                
            }
        }
        return ans;
    }
}