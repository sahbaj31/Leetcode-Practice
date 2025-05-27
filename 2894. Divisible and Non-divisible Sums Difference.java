// 2894. Divisible and Non-divisible Sums Difference
// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/?envType=daily-question&envId=2025-05-27

class Solution {
    public int differenceOfSums(int n, int m) {
         int divisible=0;
        int notDivisible=0;
        for(int i=0; i<=n ; i++){
            if(i%m==0){
                divisible +=i;
            }
            else{
                notDivisible +=i;
            }
        }
        return notDivisible-divisible;
    }
}