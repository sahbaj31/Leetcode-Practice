class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int largest=-1;
        int seclargest = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                seclargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>seclargest){
                seclargest= arr[i];
            }
        }
        return (largest-1)*(seclargest-1);
    }
}