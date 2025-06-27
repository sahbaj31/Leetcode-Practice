// 746. Min Cost Climbing Stairs
// https://leetcode.com/problems/min-cost-climbing-stairs/

class Solution {

    public int costt(int[] cost, int i, int[] dp) {
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i] = cost[i]+Math.min(costt(cost,i+1,dp),costt(cost,i+2,dp));
        
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(costt(cost, 0,dp),costt(cost,1,dp));
    }
}