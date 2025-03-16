class Solution {
    private void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1;
        int[] temp = new int[high - low + 1]; // Use an array instead of ArrayList
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

        System.arraycopy(temp, 0, arr, low, temp.length); // Efficiently copy back
    }
    
    public boolean containsDuplicate(int[] arr) {
        // int i=0;
        // int j= arr.length-1;
        // while(i<j){
        //     if(arr[i]==arr[j])
        //     return true;
        //     i++;
        //     j--;
        // }
        // return false;

        // int[] ans = new int[arr.length*2];
        // for(int i=0; i<arr.length; i++){
        //     ans[arr[i]]++;
        // }
        // for(int i=0; i<ans.length; i++){
        //     if(ans[i]>1){
        //         return true;
        //     }
        // }
        // return false;

        mergeSort(arr, 0, arr.length - 1);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]) return true;
        }
        return false;
    }
}