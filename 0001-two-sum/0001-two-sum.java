class Solution {
    public int[] twoSum(int[] arr, int target) {

        //Optimal Soluting using: HashMap, T.C = O(n) ,  S.C = O(n)

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {};



        //Brute Solution using Nested Loop; Time complexity= O(n^2)

        // int n = arr.length;
        // int[] ans = new int[2];
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if((arr[i]+arr[j])== target){
        //             ans[0]=i;
        //             ans[1]=j;
        //         }
        //     }
        // }
        // return ans;
    }
}