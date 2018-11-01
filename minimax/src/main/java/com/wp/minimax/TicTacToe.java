package com.wp.minimax;

public class TicTacToe {
	
	
	
	public TicTacToe() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
//		int[][] cells1 = {{1, 0, 0}, {-1, -1, -1}, {1, -1, -1}};
//		int[][] cells2 = {{0, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
		int[][] cells1 = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
		Board b1 = new Board(cells1);
//		Board b2 = new Board(cells2);
		GameAi ai = new GameAi();
		Move[] moves1 = ai.getAvailableMovesForPlayer('x', b1);
		Move[] moves2 = ai.getAvailableMovesForPlayer('o', b1);
		//System.out.println("here are your moves " + moves);
		System.out.println("------------------- x ----------------------------");
		for(Move move : moves1) {
			System.out.println(move.getCoords()[0] + "," + move.getCoords()[1] + ":" + move.getScore());
		}
		System.out.println("------------------- o ----------------------------");
		for(Move move : moves2) {
			System.out.println(move.getCoords()[0] + "," + move.getCoords()[1] + ":" + move.getScore());
		}
		System.out.println("-----------------------------------------------");
	}
}
