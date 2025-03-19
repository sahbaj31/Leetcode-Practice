class Solution {
    public int minOperations(int[] arr) {
        int n = arr.length;
        int count =0;
        for(int i=0; i<n-2; i++){
            if(arr[i]==0){
                arr[i] = 1-arr[i];
                arr[i+1] = 1-arr[i+1];
                arr[i+2] = 1-arr[i+2];
                count++;
            }
        }
        if(arr[n-1]==0 || arr[n-2]==0) return -1;
        return count;
    }
}