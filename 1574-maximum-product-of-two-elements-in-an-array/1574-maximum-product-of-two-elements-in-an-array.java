class Solution {
    private void mergesort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
    
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr, low , mid, high);
    }
    private void merge(int[] arr, int low, int mid, int high){
        int left = low, right = mid + 1;
        int[] temp = new int[high - low + 1]; 
        int k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        while (left <= mid) temp[k++] = arr[left++];
        while (right <= high) temp[k++] = arr[right++];

        System.arraycopy(temp, 0, arr, low, temp.length);
        }
    
    public int maxProduct(int[] arr) {
        int n = arr.length;
        mergesort(arr,0,n-1);
        return (arr[n-2]-1)*(arr[n-1]-1);
    }
}