package com.wp.minimax;

public class Move {

    public Move() {

    }

    private int[] spot;
    private char player;
    private int score;

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the player
     */
    public char getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(char player) {
        this.player = player;
    }

    /**
     * @return the spot
     */
    public int[] getSpot() {
        return spot;
    }

    /**
     * @param spot the spot to set
     */
    public void setSpot(int[] spot) {
        this.spot = spot;
    }

    

    

}