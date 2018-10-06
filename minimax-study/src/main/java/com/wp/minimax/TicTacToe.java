package com.wp.minimax;

public class TicTacToe {
    
    public TicTacToe() {

    }

    int[][] emptyBoard = new int[3][3];
    public static final int[][] TEST_BOARD = {{0, -1, 1}, {1, -1, 1}, {-1, 0, 0}};
    public final static char COL_SEPARATOR = '|';
    public final static char EMPTY_COL = ' ';
    public final static char PLAYER_X = 'x';
    public final static char PLAYER_O = 'o';
    public final static char NEW_LINE = '\n';
    public final static int PLAYER_X_ID = 1;
    public final static int PLAYER_O_ID = 0;
    
    public void printNextMoves() {

    }

    public String getAsciiBoard(int[][] board) {
        StringBuffer boardState = new StringBuffer();
        boardState.append(this.getTopLine(true));
        for(int[] row : board) {
            boardState.append(this.getAsciiRow(row, true));
        }
        boardState.append(this.getTopLine(true));
        return boardState.toString();
    }

    public String getAsciiRow(int[] row, boolean endWithNewLine) {
        StringBuffer sb = new StringBuffer();
        sb.append(TicTacToe.COL_SEPARATOR);
        for(int i=0; i<row.length; i++) {
            int x = row[i];
            if (x == -1) {
                sb.append(TicTacToe.EMPTY_COL);
            }
            else if(x == 0) {
                sb.append(TicTacToe.PLAYER_O);
            }
            else if(x == 1) {
                sb.append(TicTacToe.PLAYER_X);
            }
            sb.append(TicTacToe.COL_SEPARATOR);
        }
        if(endWithNewLine) {
            sb.append(TicTacToe.NEW_LINE);
        }
        // sb.append(this.getMiddleLine(endWithNewLine));
        return sb.toString();
    }
    
    public String getTopLine(boolean endWithNewLine) {
        if(endWithNewLine) {
            return "-------\n";
        }
        return "-------";
    }

    public String getBottomLine(boolean endWithNewLine) {
        return this.getTopLine(endWithNewLine);
    }

    public String getMiddleLine(boolean endWithNewLine) {
        return this.getTopLine(endWithNewLine);
    }

    public int calcCombs(int[][] board) {
        int combs = 0;
        for(int i=0; i<board.length; i++) {
            for(int j = 0; j<board[i].length; j++) {
                combs++;
            }
        }
        // System.out.println("combs:" + combs);
        return combs;
    }

    public int getPlayerId(char player) {
        if(player == PLAYER_O) {
            return PLAYER_O_ID;
        }
        return PLAYER_X_ID;
    }

    public boolean playerIsWinning(char player, int[][] board) {
        int id = this.getPlayerId(player);
        if(
            (board[0][0] == id && board[0][1] == id && board[0][2] == id) ||
            (board[1][0] == id && board[1][1] == id && board[1][2] == id) || 
            (board[2][0] == id && board[2][1] == id && board[2][2] == id) ||
            (board[0][0] == id && board[1][0] == id && board[2][0] == id) ||
            (board[0][1] == id && board[1][1] == id && board[2][1] == id) ||
            (board[0][2] == id && board[1][2] == id && board[2][2] == id) ||
            (board[0][0] == id && board[1][1] == id && board[2][2] == id) ||
            (board[2][0] == id && board[1][1] == id && board[0][2] == id)
            )
            {
                return true;
            }
        return false;
    }


}