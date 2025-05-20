// 3355. Zero Array Transformation I\
// https://leetcode.com/problems/zero-array-transformation-i/?envType=daily-question&envId=2025-05-20

class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
      //OPTIMAL SOLUTION
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int[] q : queries){
            prefix[q[0]]--;
            prefix[q[1] + 1]++;
        }
        for (int i = 0, d = 0; i < n; i++){
            d += prefix[i];
            if (Math.max(0, nums[i] + d) != 0)
                return false;
        }
        return true;



      // BRUTE SOLUTION
        // int n = nums.length;
        // for(int[] ele:queries){
        //     int start = ele[0];
        //     int end =ele[1];

        //     for(int i=start; i<=end; i++){
        //         if(nums[i]>0) nums[i]-=1;

        //     }
        // }
        // for(int i=0; i<n; i++){
        //     if(nums[i]!=0) return false;
        // }
        // return true;
    }
}