//Bubble Sort
//time complexity: O(n^2) where n is the length of array
public class BubbleSort {
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }
    public static void main(String[] args){
        int[] arr= {5,4,3,2,1};
        int n = arr.length;

        boolean isSwapped;
        for(int i=0; i<n-1; i++){
            isSwapped=false;
            for(int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }


}
