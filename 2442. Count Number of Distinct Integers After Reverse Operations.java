// 2442. Count Number of Distinct Integers After Reverse Operations
// https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/description/

class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    public int reverse(int num){
        int n = num;
        int m = 0;
        while(n>0){
            int rem = n%10;
            m = (m*10)+rem;
            n /=10;
        }
        return m;
    }
}