class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        permutation(nums, 0, li, ans);

        return ans;
    }

    public void permutation(int[] nums, int i,
                            List<Integer> li,
                            List<List<Integer>> ans) {

        // Base case
        if (i == nums.length) {
            ans.add(new ArrayList<>(li));
            return;
        }

        for (int j = i; j < nums.length; j++) {

            // Check duplicate at current level
            boolean duplicate = false;

            for (int k = i; k < j; k++) {
                if (nums[k] == nums[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                continue;
            }

            // Swap
            swap(nums, i, j);

            // Add current element
            li.add(nums[i]);

            // Recursive call
            permutation(nums, i + 1, li, ans);

            // Backtrack
            li.remove(li.size() - 1);

            // Undo swap
            swap(nums, i, j);
        }
    }

    public void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}