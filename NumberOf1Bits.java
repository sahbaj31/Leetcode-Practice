//191. Number of 1 Bits
//https://leetcode.com/problems/number-of-1-bits/description/

class Solution {
    public int hammingWeight(int n) {
        int ans =0;
        while(n>0){
            if(n%2==1)ans++;
            n/=2;
        }
        return ans;
    }
}


//Time Complexity: O(log n)
// Space Complexity: O(1)