package com.company.hwork1;

public class Model {

    private String firstWord;
    private String secondWord;
    private String resultWord;

    public String getFirstWord() {
        return firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    public void concatenateWords() {
        this.resultWord = firstWord + " " + secondWord;
    }

    public String getResultWord() {
        return resultWord;
    }

}
