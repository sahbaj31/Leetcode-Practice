// 2900. Longest Unequal Adjacent Groups Subsequence I
// https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/description/?envType=daily-question&envId=2025-05-15

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(i==0 || groups[i]!=groups[i-1]){
                ans.add(words[i]);
            }
        }
        return ans;
    }
}