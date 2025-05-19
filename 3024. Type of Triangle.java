// 3024. Type of Triangle
// https://leetcode.com/problems/type-of-triangle/description/?envType=daily-question&envId=2025-05-19

class Solution {
    public String triangleType(int[] arr) {
        if(arr[0]==arr[1] && arr[1]==arr[2]){
            return "equilateral";
        }
        else{
            if((arr[0]+arr[1] > arr[2]) && arr[1]+arr[2]>arr[0] && arr[0]+arr[2]>arr[1] ){
                if((arr[0]==arr[1] && arr[1]!=arr[2]) || (arr[1]==arr[2] && arr[2]!=arr[0]) || (arr[0]==arr[2] && arr[2]!=arr[1])){
                    return "isosceles";
                }
                else{
                    return "scalene";
                }
            }
            else{
                return "none";
            }
        }
    }
}