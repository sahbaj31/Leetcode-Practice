class Solution {
    private int reverse(int x){
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev = (rev*10)+digit;
            x/=10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        int rev = reverse(x);
        if(x==rev) return true;
        return false;
        
    }
}