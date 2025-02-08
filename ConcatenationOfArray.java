//1929. Concatenation of Array
https://leetcode.com/problems/concatenation-of-array/description/

class Solution {
    public int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n*2];
        for(int i=0; i<n; i++){
            ans[i]=arr[i];
        }
        for (int i=n; i<ans.length; i++){
            ans[i] = arr[i-n];
        }
        return ans;
    }
}

//Time Complexity: O(n)
// Space Complexity: O(n)

//Better Solution
class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[nums.length*2];
        for(int i=0;i<a.length;i++)
            a[i]=nums[i%nums.length];
            return a;
    }
}