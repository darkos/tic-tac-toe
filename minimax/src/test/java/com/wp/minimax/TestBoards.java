package com.wp.minimax;

public class TestBoards {

    private static final int[][] TEST_BOARD_CELLS = {{0, -1, 1}, {1, -1, 1}, {-1, 0, 0}};
    private static final int[][] TB1_CELLS = {{1, 1, 1}, {-1, -1, -1}, {-1, -1, -1}};
    private static final int[][] TB2_CELLS = {{-1, -1, -1}, {1, 1, 1}, {-1, -1, -1}};
    private static final int[][] TB3_CELLS = {{-1, -1, -1}, {-1, -1, -1}, {1, 1, 1}};
    private static final int[][] TB4_CELLS = {{1, -1, -1}, {1, -1, -1}, {1, -1, -1}};
    private static final int[][] TB5_CELLS = {{-1, 1, -1}, {-1, 1, -1}, {-1, 1, -1}};
    private static final int[][] TB6_CELLS = {{-1, -1, 1}, {-1, -1, 1}, {-1, -1, 1}};
    private static final int[][] TB7_CELLS = {{1, -1, -1}, {-1, 1, -1}, {-1, -1, 1}};
    private static final int[][] TB8_CELLS = {{-1, -1, 1}, {-1, 1, -1}, {1, -1, -1}};
    private static final int[][] TB_POPULATED_CELLS = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
    private static final int[][] TB_NOT_POPULATED_CELLS = {{0, 1, 0}, {1, 0, 1}, {0, 1, -1}};
    
    public TestBoards() {
    }

    public Board getTestBoard() {
    	return new Board(TEST_BOARD_CELLS);
    }
    
    public Board getTB1Board() {
    	return new Board(TB1_CELLS);
    }
    
    public Board getTB2Board() {
    	return new Board(TB2_CELLS);
    }
    
    public Board getTB3Board() {
    	return new Board(TB3_CELLS);
    }
    
    public Board getTB4Board() {
    	return new Board(TB4_CELLS);
    }
    
    public Board getTB5Board() {
    	return new Board(TB5_CELLS);
    }
    
    public Board getTB6Board() {
    	return new Board(TB6_CELLS);
    }
    
    public Board getTB7Board() {
    	return new Board(TB7_CELLS);
    }
    
    public Board getTB8Board() {
    	return new Board(TB8_CELLS);
    }
    
    public Board getPopulatedBoard() {
    	return new Board(TB_POPULATED_CELLS);
    }
    
    public Board getNotPopulatedBoard() {
    	return new Board(TB_NOT_POPULATED_CELLS);
    }

}