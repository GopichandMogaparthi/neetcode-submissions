class Solution {
    public boolean exist(char[][] board, String word) {

        /*
        Split the word into characters cnd check the characters present in the word
        and also check the characters are adjacent to each other while comparing so that 
        it can form a word. and maintain the conditions
        
         */

         int rows = board.length;
         int cols = board[0].length;

         char[] w = word.toCharArray();

         for(int r = 0;r<rows;r++){
            for(int c =0;c<cols;c++){
                if(dfs(board, w, r, c, 0)){
                    return true;
                }
            }
         }
        return false;
    }

    public boolean dfs(char[][] board, char[] w, int r, int c, int idx){
        //base case
        if(idx==w.length){
            return true;
        }

        if(r<0 || c<0 || r>=board.length || c>=board[0].length){
            return false;
        }

        if(board[r][c]!=w[idx]){
            return false;
        }

        char saved = board[r][c];
        board[r][c] ='#';

        boolean found = dfs(board, w, r+1, c, idx+1) ||
                        dfs(board, w, r-1, c, idx+1) ||
                        dfs(board, w, r, c+1, idx+1) ||
                        dfs(board, w, r, c-1, idx+1);

        board[r][c] = saved;
        return found; 
    }
}