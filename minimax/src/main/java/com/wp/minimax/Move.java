package com.wp.minimax;

import java.util.List;

public class Move {
	
	/**
	 * coords[0] is row;
	 * coords[1] is col
	 */
	private int[] coords;
	private Board board;
	private char player;
	private Move nextMove;
	private Move[] availableMoves;
	private int score = -1;
	private Move parentMove;
	
	public Move(char player, Board board, int coords[]) {
		this.player = player;
		this.board = board;
		this.coords = coords;
		board.play(player, coords);
		evaluate();
	}
	
	public Move(char player, Board board, int coords[], Move parentMove) {
		this.player = player;
		this.board = board;
		this.coords = coords;
		this.parentMove = parentMove;
		board.play(player, coords);
		evaluate();
	}
	
	public void evaluate() {
		if(this.isWinning()) {
			this.setScore(this.getWinningScore());
			setScoreToTopMove(this.getWinningScore());
			return;
		}
		List<int[]> availableCells = board.getAvailableCells();
		if(availableCells.size() <= 0) {
			this.setScore(0);
			setScoreToTopMove(0);
			return;
		}
		availableMoves = new Move[availableCells.size()];
		for (int i = 0; i < availableMoves.length; i++) {
			availableMoves[i] = new Move(opponent(player), board.clone(), availableCells.get(i), this);
		}
	}
	
	public void setScoreToTopMove(int score) {
		if (this.getParentMove() == null) {
			return;
		}
		
		Move parent = this.getParentMove();
		boolean parentExist = true;
		while(parentExist) {
			if(parent.getParentMove() == null) {
				parentExist = false;
				parent.setScore(score);
			}
			parent = parent.getParentMove();
		}
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public char getPlayer() {
		return player;
	}

	public void setPlayer(char player) {
		this.player = player;
	}

	public int[] getCoords() {
		return coords;
	}

	public void setCoords(int[] coords) {
		this.coords = coords;
	}

	public Move getNextMove() {
		return nextMove;
	}

	public void setNextMove(Move nextMove) {
		this.nextMove = nextMove;
	}

	public Move[] getAvailableMoves() {
		return availableMoves;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	private int getPlayerCellValue() {
		return (this.player == Board.X_PLAYER) ? Board.X_PLAYER_CELL : Board.O_PLAYER_CELL;
	}
	
	private int getWinningScore() {
		return (this.player == Board.X_PLAYER) ? 10 : -10;
	}
	
	public boolean isWinning() {
		int[][] cells = board.getCells();
        int playerVal = getPlayerCellValue();
        if ((cells[0][0] == playerVal && cells[0][1] == playerVal && cells[0][2] == playerVal)
                || (cells[1][0] == playerVal && cells[1][1] == playerVal && cells[1][2] == playerVal)
                || (cells[2][0] == playerVal && cells[2][1] == playerVal && cells[2][2] == playerVal)
                || (cells[0][0] == playerVal && cells[1][0] == playerVal && cells[2][0] == playerVal)
                || (cells[0][1] == playerVal && cells[1][1] == playerVal && cells[2][1] == playerVal)
                || (cells[0][2] == playerVal && cells[1][2] == playerVal && cells[2][2] == playerVal)
                || (cells[0][0] == playerVal && cells[1][1] == playerVal && cells[2][2] == playerVal)
                || (cells[2][0] == playerVal && cells[1][1] == playerVal && cells[0][2] == playerVal)) {
            return true;
        }
        return false;
    }
	
	private char opponent(char player) {
		return (player == Board.X_PLAYER) ? Board.O_PLAYER : Board.X_PLAYER;
	}

	public Move getParentMove() {
		return parentMove;
	}

	public void setParentMove(Move parentMove) {
		this.parentMove = parentMove;
	}
	
	
}
