class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        subset(nums, 0, li, ans);

        return ans;
    }

    public void subset(int[] nums, int i,
                       List<Integer> li,
                       List<List<Integer>> ans) {

        // Base case
        if (i == nums.length) {
            ans.add(new ArrayList<>(li));
            return;
        }

        // INCLUDE
        li.add(nums[i]);

        subset(nums, i + 1, li, ans);

        // Backtrack
        li.remove(li.size() - 1);

        // EXCLUDE
        int next = i + 1;

        // Saare same duplicates skip
        while (next < nums.length &&
               nums[next] == nums[i]) {

            next++;
        }

        subset(nums, next, li, ans);
    }
}