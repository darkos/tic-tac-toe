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
        System.out.println(ttt.calcCombs(TicTacToe.TEST_BOARD));
    }
}
