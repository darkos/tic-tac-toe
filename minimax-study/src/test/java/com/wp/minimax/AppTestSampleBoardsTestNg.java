package com.wp.minimax;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;


public class AppTestSampleBoardsTestNg {

    TicTacToe ttt;

    @BeforeTest
    public void setUp() {
        ttt = new TicTacToe();
    }

    @AfterTest
    public void clean() {
        ttt = null;
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
        TestBoards tb = new TestBoards();
        int[][] b1 = tb.getEmptyBoard();
        int[][] b2 = tb.getEmptyBoard();
        boolean areEqual = tb.boardsAreEqual(b1, b2);
        assertTrue(areEqual);
    }

    @Test
    public void boardsAreNotEqualTest() {
        TestBoards tb = new TestBoards();
        int[][] b1 = tb.getEmptyBoard();
        int[][] b2 = tb.getEmptyBoard();
        b2[1][1] = 1;
        boolean areEqual = tb.boardsAreEqual(b1, b2);
        assertFalse(areEqual);
    }

    @Test
    public void testShallowCopyBoard() {
        TestBoards tb = new TestBoards();
        int[][] b1 = tb.getEmptyBoard();
        int[][] b2 = b1.clone();
        boolean areEqual = tb.boardsAreEqual(b1, b2);
        assertTrue(areEqual);
    }


}