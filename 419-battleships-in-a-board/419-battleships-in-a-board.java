class Solution {
    public int countBattleships(char[][] board) {
        
        int numOfShips = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    sink(board, i , j);
                    numOfShips++;
                }
            }
        }
        
        return numOfShips;
        
    }
    
    public void sink(char[][] board, int i, int j) {
        
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] == '.') {
            return;
        }
        
        board[i][j] = '.';
        sink(board, i - 1, j);
        sink(board, i + 1, j);
        sink(board, i, j - 1);
        sink(board, i, j + 1);
        
    }
}