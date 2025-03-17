class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();

        for(int num:nums){
            if(ans.contains(num)){
                ans.remove(num);
            }
            else{
                ans.add(num);
            }
        }
        return(ans.size()==0);
    }
}