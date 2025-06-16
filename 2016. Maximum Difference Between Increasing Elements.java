// 2016. Maximum Difference Between Increasing Elements
// https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/?envType=daily-question&envId=2025-06-16

class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        int minele=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>minele){
                ans=Math.max(ans,nums[i]-minele);
            }
            else{
                minele=nums[i];
            }
        }
        return ans;

    }
}