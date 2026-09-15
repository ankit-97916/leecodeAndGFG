class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        subsetll(arr, 0, ans, li);
        return ans;

    }

    public static void subsetll(int[] arr, int i  , List<List<Integer>> ans, List<Integer> li ){
        if(i == arr.length){
            ans.add(new ArrayList<>(li));
            return;
        }

        li.add(arr[i]);// include 
        subsetll(arr, i+1, ans, li);
        li.remove(li.size()-1);// backtrack--
        // handle duplicate --
        int next = i+1;
        while(next < arr.length && arr[next] == arr[i]){
            next++;
        }
         subsetll(arr, next, ans, li);

    }
}