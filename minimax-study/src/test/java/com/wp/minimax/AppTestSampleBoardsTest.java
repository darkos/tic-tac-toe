package com.wp.minimax;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTestSampleBoardsTest {

    TicTacToe ttt;

    @Before
    public void setUp() {
        ttt = new TicTacToe();
    }

    @After
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


}