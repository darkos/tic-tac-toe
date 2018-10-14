package com.wp.minimax;

import java.util.List;

public class GameAi {
	
	public GameAi() {
	}
	
	public char opponent(char player) {
		return (player == Board.X_PLAYER) ? Board.O_PLAYER : Board.X_PLAYER;
	}
	
	public Move[] getAvailableMovesForPlayer(char player, Board board) {
		List<int[]> availableCells = board.getAvailableCells();
		Move[] availableMoves = new Move[availableCells.size()];
		for (int i = 0; i < availableMoves.length; i++) {
			availableMoves[i] = new Move(player, board.clone(), availableCells.get(i));
		}
		return availableMoves;
	}
	
	

}
