class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int largest=-1;
        int[] ans = new int[n*100];

        for(int i=0; i<n; i++){
            ans[arr[i]]++;
        }
        for(int i=0; i<ans.length; i++){
            if(ans[i]==i){
                ans[i]=ans[i];
            }
            else{
                ans[i]=0;
            }
        }
        for(int i=0 ; i<ans.length; i++){
            if(ans[i]>largest){
                largest=ans[i];
            }
        }
        if(largest==0) return -1;
        return largest;
    }
}