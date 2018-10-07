package com.wp.minimax;

public class TestBoards {

    public static final int[][] TEST_BOARD = {{0, -1, 1}, {1, -1, 1}, {-1, 0, 0}};
    public static final int[][] EMPTY_BOARD = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    public static final int[][] TB1 = {{1, 1, 1}, {-1, -1, -1}, {-1, -1, -1}};
    public static final int[][] TB2 = {{-1, -1, -1}, {1, 1, 1}, {-1, -1, -1}};
    public static final int[][] TB3 = {{-1, -1, -1}, {-1, -1, -1}, {1, 1, 1}};
    public static final int[][] TB4 = {{1, -1, -1}, {1, -1, -1}, {1, -1, -1}};
    public static final int[][] TB5 = {{-1, 1, -1}, {-1, 1, -1}, {-1, 1, -1}};
    public static final int[][] TB6 = {{-1, -1, 1}, {-1, -1, 1}, {-1, -1, 1}};
    public static final int[][] TB7 = {{1, -1, -1}, {-1, 1, -1}, {-1, -1, 1}};
    public static final int[][] TB8 = {{-1, -1, 1}, {-1, 1, -1}, {1, -1, -1}};
    
    public TestBoards() {

    }

    public int[][] getEmptyBoard() {
        int[][] board = new int[3][3];
        for(int i=0;i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                board[i][j] = TicTacToeConst.AVAILABLE_SPOT_IN_VAL;
            }
        }
        return board;
    }

    /**
     * Assumption is that bot arrays are [3][3]
     * @param b1
     * @param b2
     * @return
     */
    public boolean boardsAreEqual(int[][] b1, int[][] b2) {
        for(int i=0; i<b1.length; i++) {
            for(int j=0; j<b1.length; j++) {
                if(b1[i][j] != b2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] cloneBoard(int[][] b1) {
        int[][] b2 = b1.clone();
        for(int i=0; i<b2.length; i++) {
            b2[i] = b2[i].clone();
        }
        return b2;
    }


}