package com.wp.minimax;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.wp.util.AsciiRenderUtil;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;


public class AppTestSampleBoardsTestNg {

    private TicTacToe ttt;
    private TestBoards tb;
    private AsciiRenderUtil util;

    @BeforeTest
    public void setUp() {
        ttt = new TicTacToe();
        tb = new TestBoards();
        util = new AsciiRenderUtil();
    }

    @AfterTest
    public void clean() {
        ttt = null;
        tb = null;
        util = null;
    }

    @Test
    public void sampleBoard1Test() {
        boolean isWinning = ttt.playerIsWinning('x', TestBoards.TB1);
        assertTrue(isWinning);
    }

    @Test
    public void sampleBoard2Test() {
        boolean isWinning = ttt.playerIsWinning('x', TestBoards.TB2);
        assertTrue(isWinning);
    }

    @Test
    public void sampleBoard3Test() {
        boolean isWinning = ttt.playerIsWinning('x', TestBoards.TB3);
        assertTrue(isWinning);
    }

    @Test
    public void sampleBoard4Test() {
        boolean isWinning = ttt.playerIsWinning('x', TestBoards.TB4);
        assertTrue(isWinning);
    }

    @Test
    public void sampleBoard5Test() {
        boolean isWinning = ttt.playerIsWinning('x', TestBoards.TB5);
        assertTrue(isWinning);
    }

    @Test
    public void sampleBoard6Test() {
        boolean isWinning = ttt.playerIsWinning('x', TestBoards.TB6);
        assertTrue(isWinning);
    }

    @Test
    public void sampleBoard7Test() {
        boolean isWinning = ttt.playerIsWinning('x', TestBoards.TB7);
        assertTrue(isWinning);
    }

    @Test
    public void sampleBoard8Test() {
        boolean isWinning = ttt.playerIsWinning('x', TestBoards.TB8);
        assertTrue(isWinning);
    }

    @Test
    public void sampleBoardTest() {
        boolean isWinning = ttt.playerIsWinning('x', TestBoards.TEST_BOARD);
        assertFalse(isWinning);
    }

    @Test
    public void boardsAreEqualTest() {
        int[][] b1 = tb.getEmptyBoard();
        int[][] b2 = tb.getEmptyBoard();
        boolean areEqual = tb.boardsAreEqual(b1, b2);
        assertTrue(areEqual);
    }

    @Test
    public void boardsAreNotEqualTest() {
        int[][] b1 = tb.getEmptyBoard();
        int[][] b2 = tb.getEmptyBoard();
        b2[1][1] = 1;
        boolean areEqual = tb.boardsAreEqual(b1, b2);
        assertFalse(areEqual);
    }

    @Test
    public void shallowCopyBoardTest() {
        int[][] b1 = tb.getEmptyBoard();
        int[][] b2 = b1.clone();
        b2[1][1] = TicTacToeConst.PLAYER_O_INT_VAL;
        boolean areEqual = tb.boardsAreEqual(b1, b2);
        assertTrue(areEqual);
    }

    @Test
    public void deepCopyBoardTest() {
        int[][] b1 = tb.getEmptyBoard();
        int[][] b2 = tb.cloneBoard(b1);
        b2[1][1] = TicTacToeConst.PLAYER_O_INT_VAL;
        boolean areEqual = tb.boardsAreEqual(b1, b2);
        assertFalse(areEqual);
    }

    @Test
    public void boardIsPopulatedTest() {
        assertTrue(util.boardIsPopulated(TestBoards.TB_POPULATED));
    }

    @Test
    public void boardIsNotPopulatedTest() {
        assertFalse(util.boardIsPopulated(TestBoards.TB_NOT_POPULATED));
    }

    @Test
    public void getOpponentTrueTest() {
        char opponent = 'o';
        assertTrue(opponent == util.getOpponent(TicTacToeConst.PLAYER_X_LABEL));
        assertFalse(opponent == util.getOpponent(opponent));
    }


}