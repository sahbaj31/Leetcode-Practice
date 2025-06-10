// 3442. Maximum Difference Between Even and Odd Frequency I
// https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/?envType=daily-question&envId=2025-06-10

class Solution {
    public int maxDifference(String s) {
        int n = s.length();

        int[] arr = new int[26];
        for(int i=0; i<n; i++){
            arr[s.charAt(i)-'a']++;
        }

        int maxOdd=0;
        int minEven=n+1;
        for(int i=0; i<26; i++){
            if(arr[i]==0) continue;
            if(arr[i]%2==0) minEven = Math.min(minEven, arr[i]);
            else maxOdd = Math.max(maxOdd, arr[i]);
        }
        return maxOdd-minEven;
    }
}