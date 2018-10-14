package com.wp.minimax;

import java.util.ArrayList;
import java.util.List;

public class Board {
	
	public final static int AVALIABLE_CELL = -1;
	public final static int X_PLAYER_CELL = 1;
	public final static int O_PLAYER_CELL = 0;
	public final static char X_PLAYER = 'x';
	public final static char O_PLAYER = 'o';
	
	public int[][] cells;
	

	/**
	 * Default constructor creates board for tic-tac-toe. 
	 * Cells are initialized as -1;
	 */
	public Board() {
		this.cells = new int[3][3];
		init();
	}
	
	/**
	 * Constructs board with game in progress status. 
	 * @param cells
	 */
	public Board(int[][] cells) {
		this.cells = cells;
	}
	
	/**
	 * Initializes board with empty cells
	 * -1 is value for empty cell
	 */
	private void init() {
		for(int i=0; i<this.cells.length; i++) {
			for(int j=0; j<cells[i].length; j++) {
				cells[i][j]=AVALIABLE_CELL;
			}
		}
	}
	
	public Board clone() {
		int[][] clonedCells = this.cloneCells();
		return new Board(clonedCells);
	}
	
	private int[][] cloneCells() {
        int[][] c1 = this.cells.clone();
        for(int i=0; i<c1.length; i++) {
            c1[i] = c1[i].clone();
        }
        return c1;
    }
	
	public List<int[]> getAvailableCells() {
        List<int[]> availableSpots = new ArrayList<int[]>();
        for (int i = 0; i < this.cells.length; i++) {
            for(int j=0; j<this.cells[i].length; j++) {
                if(this.cells[i][j] == AVALIABLE_CELL) {
                    availableSpots.add(new int[]{i,j});
                }
            }
        }
        return availableSpots;
    }
	
	public boolean equals(Object o) {
		Board board2 = (Board)o;
		int[][] b2 = board2.getCells();
        for(int i=0; i<cells.length; i++) {
            for(int j=0; j<cells.length; j++) {
                if(cells[i][j] != b2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
	
	public int[][] getCells() {
		return cells;
	}
	
	public void play(char player, int[] coords) {
		int cellValue = (player == Board.X_PLAYER) ? Board.X_PLAYER_CELL : Board.O_PLAYER_CELL;
		this.getCells()[coords[0]][coords[1]] = cellValue;
	}
}
