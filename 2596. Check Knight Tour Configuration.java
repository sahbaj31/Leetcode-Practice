// 2596. Check Knight Tour Configuration
// https://leetcode.com/problems/check-knight-tour-configuration/description/

class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        return helper(grid, 0, 0, 0);
    }

    public boolean helper(int[][] grid, int row, int col, int num){
        int n = grid.length;
        if(grid[row][col]== n*n-1){
            return true;
        }

        // 2-Up 1-Right
        int i = row-2;
        int j = col+1;
        if((i>=0 && j<n) && (grid[i][j]==num+1)) return helper(grid, i, j,num+1);

        // 2-Up 1-Left
        i = row-2;
        j= col-1;
        if((i>=0 && j>=0) && (grid[i][j]==num+1)) return helper(grid, i, j, num+1);

        // 2-Down 1-Right
        i = row+2;
        j = col+1;
        if((i<n && j<n) && (grid[i][j]==num+1)) return helper(grid, i, j, num+1);

        // 2-Down 1-Left
        i = row+2;
        j = col-1;
        if((i<n && j>=0) && (grid[i][j]==num+1)) return helper(grid, i, j, num+1);

        // 2-Right 1-Up
        i = row-1;
        j = col+2;
        if((i>=0 && j<n) && (grid[i][j]==num+1)) return helper(grid, i, j, num+1);

        // 2-Right 1-Down
        i = row+1;
        j = col+2;
        if((i<n && j<n) && (grid[i][j]==num+1)) return helper(grid, i, j, num+1);

        // 2-Left 1-Up
        i = row-1;
        j = col-2;
        if((i>=0 && j>=0) && (grid[i][j]==num+1)) return helper(grid, i, j, num+1);

        // 2-Left 1-Down
        i = row+1;
        j = col-2;
        if((i<n && j>=0) && (grid[i][j]==num+1)) return helper(grid, i, j, num+1);

        return false;
    }
}