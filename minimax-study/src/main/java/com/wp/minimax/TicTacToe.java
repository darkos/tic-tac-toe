package com.wp.minimax;

import java.io.IOException;

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
     * @param playerToMakeAMove
     * @param boardNow
     * @return
     */
    public int getScore(char playerToMakeAMove, int[][] boardNow) {
        int player = this.getPlayerIntVal(playerToMakeAMove);
        int score = -1;
        for(int x=0; x<boardNow.length; x++) {
            for(int y=0; y<boardNow[x].length; y++) {
                if(boardNow[x][y] == TicTacToeConst.AVAILABLE_SPOT_IN_VAL) {
                    int[][] newBoard = tb.cloneBoard(boardNow);
                    newBoard[x][y] = player;
                    // System.out.println("field:" + x + "," + y);
                    // String asciiBoard = util.getAsciiBoard(newBoard);
                    // System.out.println(asciiBoard);
                    // try {
                    //     char inp = (char)System.in.read();
                    //     if (inp == 'x') {
                    //         System.exit(0);
                    //     }
                    // } catch(IOException exc) {
                    //     System.exit(0);
                    // }

                    if(playerIsWinning(playerToMakeAMove, newBoard)) {
                        // System.out.println("WINNING - field:" + x + "," + y);
                        // asciiBoard = util.getAsciiBoard(newBoard);
                        // System.out.println(asciiBoard);

                        // try {
                        //     char inp = (char)System.in.read();
                        //     if (inp == 'x') {
                        //         System.exit(0);
                        //     }
                        // } catch(IOException exc) {
                        //     System.exit(0);
                        // }

                        if(playerToMakeAMove == TicTacToeConst.PLAYER_X_LABEL) {
                            return 10;
                        }
                        else {
                            return -10;
                        }
                    }
                    if(util.boardIsPopulated(newBoard)) {
                        return 0;
                    }
                    int tmpScore = getScore(util.getOpponent(playerToMakeAMove), newBoard);
                    System.out.println("tmpScore:" + tmpScore);
                }
            }
        }
        return score;
    }

}