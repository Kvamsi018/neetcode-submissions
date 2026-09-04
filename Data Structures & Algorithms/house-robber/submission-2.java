class Solution {
    public int robFn(int i, int[] nums, int[] dp){
        if(i==0) return nums[i];

        if(dp[i] != -1) return dp[i];
        int pick = nums[i];
        if(i-2>=0){ pick += robFn(i-2, nums, dp);}
        int nonPick = 0 + robFn(i-1, nums, dp);

        return dp[i] = Math.max(pick, nonPick);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return robFn(nums.length-1, nums, dp);
    }
}
