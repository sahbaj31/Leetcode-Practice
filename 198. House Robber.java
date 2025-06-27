// 198. House Robber
// https://leetcode.com/problems/house-robber/description/

class Solution {
    public int robbed(int[] nums,int index,  int[] dp) {
        if(index>=nums.length) return 0;
        if(dp[index]!=-1) return dp[index];
        int steal = nums[index] + robbed(nums,index+2, dp);
        int skip =  robbed(nums,index+1,dp) ;
        return dp[index] = Math.max(steal, skip);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robbed(nums, 0, dp);
    }
}