// 135. Candy
// https://leetcode.com/problems/candy/?envType=daily-question&envId=2025-06-02

class Solution {
    public int candy(int[] ratings) {
        int[] nums=new int[ratings.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=1;
        }
        for(int i=1;i<nums.length;i++){
            if(ratings[i]>ratings[i-1]){
                nums[i]=nums[i-1]+1;
            }
        }
        for(int i=nums.length-1;i>=1;i--){
            if(ratings[i-1]>ratings[i] && nums[i-1]<=nums[i]){
                nums[i-1]=nums[i]+1;
            }
        }
       
        return Arrays.stream(nums).sum();
    }
}