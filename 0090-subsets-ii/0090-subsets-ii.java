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

        // Current subset add karo
        ans.add(new ArrayList<>(li));

        for (int j = i; j < nums.length; j++) {

            // Same level par duplicate skip
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }

            // Add
            li.add(nums[j]);

            // Recursive call
            subset(nums, j + 1, li, ans);

            // Backtrack
            li.remove(li.size() - 1);
        }
    }
}