// 75. Sort Colors
// https://leetcode.com/problems/sort-colors/description/?envType=daily-question&envId=2025-05-17

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        boolean isSwapped;
        for(int i=0; i<n-1; i++){
            isSwapped=false;
            for(int j=0; j<n-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    isSwapped=true;
                }
                 
            }
            if(isSwapped==false) break;
        }
    }
}