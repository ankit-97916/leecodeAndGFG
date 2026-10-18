class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        arrange(nums, 0, ans, li);
        return ans;
        
    }

    public void arrange(int[] arr, int  idx, List<List<Integer>> ans, List<Integer> li){
        if(idx == arr.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        //handle duplicate using set
        HashSet<Integer> set = new HashSet<>();
        for(int  i=idx; i<arr.length; i++){
            if(set.contains(arr[i])){
                continue;
            }
            set.add(arr[i]);
            swap(arr, idx, i);
            li.add(arr[idx]);
            arrange(arr, idx+1, ans, li);
            li.remove(li.size()-1);
            swap(arr, idx, i);

        }

    }

    // swap
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}