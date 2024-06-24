/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritage;

/**
 *
 * @author A-27
 */

/**
 *
 * @author A-27
 */
class WordGuessingGame extends Game {
    private String[] words;
    public WordGuessingGame(int guessLimit, String[] words) {
    super(guessLimit);
    this.words = words;
}

    @Override
    public void play() {
        super.play(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String checkGuess(int guess) {
        return super.checkGuess(guess); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getGuess() {
        return super.getGuess(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    
}

