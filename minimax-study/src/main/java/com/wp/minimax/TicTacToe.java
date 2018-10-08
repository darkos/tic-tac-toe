package com.wp.minimax;

import java.util.List;

import com.wp.util.AsciiRenderUtil;

public class TicTacToe {

    private TestBoards tb;
    private int[][] board;
    private AsciiRenderUtil util;

    public TicTacToe() {
        initGame();
    }

    /**
     * This method is called from the constructor to initialize the game.
     */
    public void initGame() {
        tb = new TestBoards();
        util = new AsciiRenderUtil();
        this.setBoard(tb.getEmptyBoard());
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

    /**
     * Player 'x' is concidered to be human
     * 
     * @param playerToMakeAMove
     * @param boardNow
     * @return
     */
    public Move[] getMoves(char playerToMakeAMove, int[][] boardNow, List<int[]> spots) {
        int player = this.getPlayerIntVal(playerToMakeAMove);
        int score = -1;

        Move[] moves = new Move[spots.size()];

        for (int i=0; i<spots.size(); i++) {
            int[] spot = spots.get(i);
            moves[i] = new Move();
            moves[i].setSpot(spot);
            moves[i].setPlayer(playerToMakeAMove);
            int[][] newBoard = tb.cloneBoard(boardNow);
            newBoard[spot[0]][spot[1]] = player;
            if (playerIsWinning(playerToMakeAMove, newBoard)) {
                if (playerToMakeAMove == TicTacToeConst.PLAYER_X_LABEL) {
                    return 10;
                } else {
                    return -10;
                }
            }
            if (util.boardIsPopulated(newBoard)) {
                return 0;
            }
        }

        return moves;
    }

}