package com.wp.util;

import com.wp.minimax.TicTacToeConst;

public class AsciiRenderUtil {

    public AsciiRenderUtil() {

    }

    public String getAsciiBoard(int[][] board) {
        StringBuffer boardState = new StringBuffer();
        boardState.append(this.getTopLine(true));
        for (int[] row : board) {
            boardState.append(this.getAsciiRow(row, true));
        }
        boardState.append(this.getTopLine(true));
        return boardState.toString();
    }

    public String getAsciiRow(int[] row, boolean endWithNewLine) {
        StringBuffer sb = new StringBuffer();
        sb.append(TicTacToeConst.COL_SEPARATOR);
        for (int i = 0; i < row.length; i++) {
            int x = row[i];
            if (x == -1) {
                sb.append(TicTacToeConst.EMPTY_COL);
            } else if (x == 0) {
                sb.append(TicTacToeConst.PLAYER_O_LABEL);
            } else if (x == 1) {
                sb.append(TicTacToeConst.PLAYER_X_LABEL);
            }
            sb.append(TicTacToeConst.COL_SEPARATOR);
        }
        if (endWithNewLine) {
            sb.append(TicTacToeConst.NEW_LINE);
        }
        // sb.append(this.getMiddleLine(endWithNewLine));
        return sb.toString();
    }

    public String getTopLine(boolean endWithNewLine) {
        if (endWithNewLine) {
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

    public char getOpponent(char player) {
        if(player == TicTacToeConst.PLAYER_O_LABEL) {
            return TicTacToeConst.PLAYER_X_LABEL;
        }
        return TicTacToeConst.PLAYER_O_LABEL;
    }

    public boolean boardIsPopulated(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j] == TicTacToeConst.AVAILABLE_SPOT_IN_VAL) {
                    return false;
                }
            }
        }
        return true;
    }

}