// 3362. Zero Array Transformation III
// https://leetcode.com/problems/zero-array-transformation-iii/description/?envType=daily-question&envId=2025-05-22

class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        final int n = nums.length;
        final int m = queries.length;

        Arrays.sort(queries, (a, b) -> a[0] - b[0]);

        final PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        final PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        int used = 0;

        for (int i = 0, j = 0; i < n; i++) {
            while(j < m && queries[j][0] == i) {
                maxHeap.add(queries[j++][1]);
            }

            nums[i] -= minHeap.size();

            while(nums[i] > 0 && !maxHeap.isEmpty() && maxHeap.peek() >= i) {
                minHeap.add(maxHeap.remove());

                used++;
                nums[i]--;
            }

            if (nums[i] > 0) return -1;

            while(!minHeap.isEmpty() && minHeap.peek() == i) {
                minHeap.remove();
            }
        }

        return m - used;
        
    }
}