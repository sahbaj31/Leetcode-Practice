class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Step 1: Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Min Heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<> (Comparator.comparingInt(freqMap::get));
        
        for (int key : freqMap.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        // Step 3: Extract k elements from heap
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }
        
        return result;
    }
}