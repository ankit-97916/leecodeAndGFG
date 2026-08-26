class Solution {
    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // Minimum right side mein hai
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            }

            // Minimum left side ya mid par ho sakta hai
            else if (nums[mid] < nums[end]) {
                end = mid;
            }

            // Duplicate case
            else {
                end--;
            }
        }

        // start == end
        return nums[start];
    }
}
