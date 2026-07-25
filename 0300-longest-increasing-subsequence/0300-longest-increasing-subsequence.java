class Solution {
    public int lengthOfLIS(int[] nums) {
       int[] dp = new int[nums.length];
			Arrays.fill(dp, 1);
			for (int i = 1; i < dp.length; i++) {//2 loop use krenge
				for (int j = i - 1; j >= 0; j--) {
					if (nums[i] > nums[j]) {
						int x = dp[j];
						dp[i] = Math.max(dp[i], x + 1);//update by 1 and compare
					}
				}
			}
			return Arrays.stream(dp).max().getAsInt();
 
    }
}