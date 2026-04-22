// 46. Permutations
// https://leetcode.com/problems/permutations/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
         helper(nums, 0, ans);
         return ans;

    }
    private static List<List<Integer>> helper(int[] nums, int idx, List<List<Integer>> ans){
        int n = nums.length;
        if(idx==n-1){
            List<Integer> ls = new ArrayList<>();
            for(int i=0; i<n; i++){
                ls.add(nums[i]);
            }
            ans.add(ls);
        }
        for(int i=idx; i<n; i++){
            swap(i, idx, nums);
            helper(nums, idx+1, ans);
            swap(i, idx, nums);
        }
        return ans;
    }
    private static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        return;
    }
}
