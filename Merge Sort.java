// Merge Sort
// Time Complexity: O(n log n)
// Space Complexity: O(n) (due to temporary array)




public class MergeSort {
    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
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

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length - 1);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
