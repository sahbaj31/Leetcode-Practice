// 3068. Find the Maximum Sum of Node Values
// https://leetcode.com/problems/find-the-maximum-sum-of-node-values/description/?envType=daily-question&envId=2025-05-23

class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long totalSum = 0;
        int count = 0;
        int positiveMin = Integer.MAX_VALUE;
        int negativeMax = Integer.MIN_VALUE;

        for (int nodeValue : nums) {
            int nodeValAfterOperation = nodeValue ^ k;
            totalSum += nodeValue;
            int netChange = nodeValAfterOperation - nodeValue;

            if (netChange > 0) {
                positiveMin = Math.min(positiveMin, netChange);
                totalSum += netChange;
                count += 1;
            } else {
                negativeMax = Math.max(negativeMax, netChange);
            }
        }

        if (count % 2 == 0) {
            return totalSum;
        }
        return Math.max(totalSum - positiveMin, totalSum + negativeMax);
    }
}