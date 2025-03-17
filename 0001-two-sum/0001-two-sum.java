class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if((arr[i]+arr[j])== target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}