package com.wp.minimax;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        TicTacToe ttt = new TicTacToe();
        String board = ttt.getAsciiBoard(TicTacToe.TEST_BOARD);
        System.out.println(board);
        board = ttt.getAsciiBoard(TestBoards.TB1);
        System.out.println(board);
        board = ttt.getAsciiBoard(TestBoards.TB2);
        System.out.println(board);
        board = ttt.getAsciiBoard(TestBoards.TB3);
        System.out.println(board);
        board = ttt.getAsciiBoard(TestBoards.TB4);
        System.out.println(board);
        board = ttt.getAsciiBoard(TestBoards.TB5);
        System.out.println(board);
        board = ttt.getAsciiBoard(TestBoards.TB6);
        System.out.println(board);
        board = ttt.getAsciiBoard(TestBoards.TB7);
        System.out.println(board);
        board = ttt.getAsciiBoard(TestBoards.TB8);
        System.out.println(board);
        // System.out.println(ttt.calcCombs(TicTacToe.TEST_BOARD));
    }
}
