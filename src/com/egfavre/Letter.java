package com.egfavre;

/**
 * Created by user on 11/19/16.
 */
public class Letter {
    String letter;
    int frequency;

    public Letter(String letter, int frequency) {
        this.letter = letter;
        this.frequency = frequency;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
