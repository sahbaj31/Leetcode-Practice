// 1298. Maximum Candies You Can Get from Boxes
// https://leetcode.com/problems/maximum-candies-you-can-get-from-boxes/description/?envType=daily-question&envId=2025-06-03

// class Solution {
//     public int maxCandies(int[] boxStatus, int[] boxCandies, int[][] boxKeys, int[][] boxContents, int[] startBoxes) {
//         Queue<Integer> queue = new LinkedList<>();
//         for (int b : startBoxes)
//             queue.add(b);
//         int total = 0;
//         while (!queue.isEmpty()) {
//             int box = queue.remove();
//             if (boxStatus[box] == 0) {
//                 if (queue.isEmpty())
//                     return total;
//                 queue.add(box);
//             } else {
//                 total += boxCandies[box];
//                 for (int key : boxKeys[box])
//                     boxStatus[key] = 1;
//                 for (int contained : boxContents[box])
//                     queue.add(contained);
//             }
//         }
//         return total;
//     }
// }


class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        

        int candiesCount = 0;

        boolean[] visited = new boolean[status.length];

        for(int box: initialBoxes){
            //if(status[box] == 1){
                dfs(box, status, keys, containedBoxes, visited);
            //} 
        }

        for(int i = 0; i < candies.length; i++){
            if(visited[i] && status[i] == 1){
                candiesCount += candies[i];
            }
            
        }


        return candiesCount;
    }


    private void dfs(int box, int[] status, int[][] keys, int[][] containedBoxes, boolean[] visited){

        visited[box] = true;

        for(int key: keys[box]){
            if(key == box){
                continue;
            }
            status[key] = 1;
        }

        for(int bx: containedBoxes[box]){
            if(!visited[bx]){
                dfs(bx, status, keys, containedBoxes, visited);
            }
        }
    }
}