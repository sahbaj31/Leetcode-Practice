// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/description/

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0]=nums[0];
        for(int i=1; i<n; i++){
            pre[i] = nums[i] + pre[i-1];
        }
        return pre;
    }
}