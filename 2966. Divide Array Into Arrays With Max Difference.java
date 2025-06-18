// 2966. Divide Array Into Arrays With Max Difference
// https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/?envType=daily-question&envId=2025-06-18

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] ans = new int[n/3][3];
        Arrays.sort(nums);
        int index =0;
        for(int i=0; i<n/3; i++){
            for(int j=0; j<3; j++){
                ans[i][j] = nums[index];
                index++;
            }
        }
        for(int i=0; i<nums.length/3; i++){
            int mini = Integer.MAX_VALUE;
            int maxi = Integer.MIN_VALUE;
            for(int j=0; j<3 ; j++){
                mini = Math.min(mini, ans[i][j]);
                maxi = Math.max(maxi, ans[i][j]);
                if(maxi-mini>k) return new int [0][0];
            }
        }
        return ans;
    }
}