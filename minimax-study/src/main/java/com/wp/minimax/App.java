package com.wp.minimax;

import java.util.List;

import com.wp.util.AsciiRenderUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AsciiRenderUtil util = new AsciiRenderUtil();
        TestBoards tb = new TestBoards();
        List<int[]> availSpots = util.getAvailableSpots(TestBoards.TEST_BOARD);
        // System.out.println(availSpots);
        for(int[] spot : availSpots) {
            System.out.println(spot[0] + "," + spot[1]);
        }

        // TicTacToe ttt = new TicTacToe();
        // int score = ttt.getScore(TicTacToeConst.PLAYER_X_LABEL, tb.getEmptyBoard());
        // System.out.println("score:" + score);

        String board = util.getAsciiBoard(TestBoards.TEST_BOARD);
        System.out.println(board);
        // board = util.getAsciiBoard(TestBoards.TB1);
        // System.out.println(board);
        // board = util.getAsciiBoard(TestBoards.TB2);
        // System.out.println(board);
        // board = util.getAsciiBoard(TestBoards.TB3);
        // System.out.println(board);
        // board = util.getAsciiBoard(TestBoards.TB4);
        // System.out.println(board);
        // board = util.getAsciiBoard(TestBoards.TB5);
        // System.out.println(board);
        // board = util.getAsciiBoard(TestBoards.TB6);
        // System.out.println(board);
        // board = util.getAsciiBoard(TestBoards.TB7);
        // System.out.println(board);
        // board = util.getAsciiBoard(TestBoards.TB8);
        // System.out.println(board);


        // int[][] b1 = tb.getEmptyBoard();
        // int[][] b2 = b1.clone();
        // String board = util.getAsciiBoard(b1);
        // System.out.println("b1:");
        // System.out.println(board);
        // board = util.getAsciiBoard(b2);
        // System.out.println("b2:");
        // System.out.println(board);
        
        // System.out.println("changing b1[1][1] = 1");
        // b1[1][1] = 1;
        // board = util.getAsciiBoard(b1);
        // System.out.println("b1:");
        // System.out.println(board);
        
        // board = util.getAsciiBoard(b2);
        // System.out.println("b2:");
        // System.out.println(board);
        
        // System.out.println("changing b2[2][2] = 0");
        // b2[2][2] = 0;
        // board = util.getAsciiBoard(b1);
        // System.out.println("b1:");
        // System.out.println(board);

        // System.out.println("b2:");
        // board = util.getAsciiBoard(b2);
        // System.out.println(board);
        
        // System.out.println("get empty board b1:");
        // b1 = tb.getEmptyBoard();
        // board = util.getAsciiBoard(b1);
        // System.out.println("b1:");
        // System.out.println(board);

        // System.out.println("##### b2 = deep cloning b1 #####");
        // b2 = tb.cloneBoard(b1);
        // System.out.println("b2:");
        // board = util.getAsciiBoard(b2);
        // System.out.println(board);

        // System.out.println("changing b1[1][1] = 1");
        // b1[1][1] = 1;
        // board = util.getAsciiBoard(b1);
        // System.out.println("b1:");
        // System.out.println(board);
        
        // board = util.getAsciiBoard(b2);
        // System.out.println("b2:");
        // System.out.println(board);

        // System.out.println("changing b2[2][2] = 0");
        // b2[2][2] = 0;
        // board = util.getAsciiBoard(b1);
        // System.out.println("b1:");
        // System.out.println(board);

        // System.out.println("b2:");
        // board = util.getAsciiBoard(b2);
        // System.out.println(board);
        
    }
}
