// 2138. Divide a String Into Groups of Size k
// https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/?envType=daily-question&envId=2025-06-22

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int remainder = 0;
        int result = 0;

        char[] chars = s.toCharArray();
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        for(int i=0; i<chars.length; i++){
            str.append(chars[i]);
            if(str.length()==k){
                arr.add(str.toString());
                str.setLength(0);
            }
        }
        if(!str.isEmpty()){
            remainder = str.length()%k;
            result = k-remainder;
            for(int i=0; i<result; i++){
                str.append(fill);
            }
            arr.add(str.toString());
        }
        return arr.toArray(new String[0]);
    }
}