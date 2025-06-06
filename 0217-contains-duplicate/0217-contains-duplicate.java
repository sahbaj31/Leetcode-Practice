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
    
    public boolean containsDuplicate(int[] arr) {
    
         // Using hashset with time complexity O(1)
        HashSet<Integer> seen = new HashSet<>();
        for(int ele:arr){
            if(seen.contains(ele)) return true;

            seen.add(ele);
        }
        return false;


        //Can use this logic first sort then check, it takes more time while sorting
        
        // mergeSort(arr, 0, arr.length - 1);
        // for(int i=0; i<arr.length-1; i++){
        //     if(arr[i]==arr[i+1]) return true;
        // }
        // return false;


        
    }
}