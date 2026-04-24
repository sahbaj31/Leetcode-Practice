// 51. N-Queens
// https://leetcode.com/problems/n-queens/description/

class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        helper(board,0, ans);
        return ans;

    }
    private void helper(char[][] board, int row, List<List<String>> ans){
        int n = board.length;
        if(row==n){
            List<String> ls  = new ArrayList<>();
            for(int i=0; i<n; i++){
                String str = "";
                for(int j=0; j<n; j++){
                    str +=board[i][j];
                }
                ls.add(str);
            }
            ans.add(ls);
            return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                helper(board, row+1, ans);
                board[row][j]='.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        // Check-East and West
        for(int j=0; j<n; j++){
            if(board[row][j]=='Q') return false;
        }
        // Check North and South
        for(int i=0; i<n; i++){
            if(board[i][col]=='Q') return false;
        }
        // North-East
        int i=row;
        int j=col;
        while(i>=0 && j<n ){
            if(board[i][j]=='Q') return false;

            i--; j++;
        }
        // South-East
        i=row;
        j= col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;

            i++;j++;
        }
        // South-West
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;

            i++;j--;
        }
        // North-West
        i=row;
        j= col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;

            i--;j--;
        }
        return true;
    }
}