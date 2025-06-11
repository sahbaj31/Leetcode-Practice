// 1423. Maximum Points You Can Obtain from Cards
// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0, rightsum=0, maxsum=0;
        int n = cardPoints.length;
        int rightindex=n-1;

        for(int i=0; i<k; i++){
            leftsum += cardPoints[i];
            maxsum = leftsum;
        }
        for(int i=k-1; i>=0; i--){
            leftsum -= cardPoints[i];
            rightsum += cardPoints[rightindex--];
            maxsum = Math.max(maxsum, leftsum+rightsum);
        }
        return maxsum;
    }
}