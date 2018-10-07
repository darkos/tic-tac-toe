package com.wp.minimax;

public class TicTacToe {

    private TestBoards tb;
    private int[][] board;

    public TicTacToe() {
        initGame();
    }

    

    

    

    /**
     * This method is called from the constructor to initialize the game.
     */
    public void initGame() {
        this.setBoard(tb.getEmptyBoard());
        tb = new TestBoards();
    }

    /**
     * @return the board
     */
    public int[][] getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    private void setBoard(int[][] board) {
        this.board = board;
    }
    

    public int getPlayerIntVal(char player) {
        if (player == TicTacToeConst.PLAYER_O_LABEL) {
            return TicTacToeConst.PLAYER_O_INT_VAL;
        }
        return TicTacToeConst.PLAYER_X_INT_VAL;
    }

    public boolean playerIsWinning(char playerLabel, int[][] board) {
        int player = this.getPlayerIntVal(playerLabel);
        if ((board[0][0] == player && board[0][1] == player && board[0][2] == player)
                || (board[1][0] == player && board[1][1] == player && board[1][2] == player)
                || (board[2][0] == player && board[2][1] == player && board[2][2] == player)
                || (board[0][0] == player && board[1][0] == player && board[2][0] == player)
                || (board[0][1] == player && board[1][1] == player && board[2][1] == player)
                || (board[0][2] == player && board[1][2] == player && board[2][2] == player)
                || (board[0][0] == player && board[1][1] == player && board[2][2] == player)
                || (board[2][0] == player && board[1][1] == player && board[0][2] == player)) {
            return true;
        }
        return false;
    }

    public int getScore(char opponent, int[][] boardNow) {
        int player = this.getPlayerIntVal(opponent);
        int score = -1;
        for(int x=0; x<boardNow.length; x++) {
            int[] row = boardNow[x];
            for(int y=0; y<row.length; y++) {
                if(boardNow[x][y] == TicTacToeConst.AVAILABLE_SPOT_IN_VAL) {
                    int[][] newBoard = 
                }
            }
        }
        return score;
    }

}