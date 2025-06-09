// 2744. Find Maximum Number of String Pairs
// https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
    //     int n = words.length;
    //     int count = 0;
    //     for(int i=0; i<n; i++){
    //         boolean pair= present(words, words[i], i);
    //         if(pair==true){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // public boolean present(String[] words, String s, int j){
    //     char ch;
    //     String r = "";
    //     for(int i=0; i<s.length(); i++){
    //         ch = s.charAt(i);
    //         r=ch+r;
    //     }
    //     for(int i=j+1; i<words.length; i++){
    //         if(r.equals(words[i])) return true;
    //     }
    //     return false;
    // }


    HashSet<String> set = new HashSet<>();
    int count = 0;
    for(int i=0; i<words.length; i++){
        boolean pair = present(set, words[i]);
        if(pair==true) count++;
        else set.add(words[i]);
    }

    return count;

    }
    public boolean present(HashSet<String> set,String s ){
        char ch;
        String r = "";
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            r=ch+r;
        }
        if(set.contains(r)) return true;
        return false;
    }

}