/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndt.exercise;


/**
 *
 * @author pc
 */
public class Choice {

    private int dem = 0;
    private int idChoice = ++dem;
    private String[] contentChoice;
    private String correctAnswer;
    private String explain;

    public Choice() {
    }

    public Choice(String[] contentChoice, String correctAnswer, String explain) {
        this.contentChoice = contentChoice;
        this.correctAnswer = correctAnswer;
        this.explain = explain;
    }

    /**
     * @return the dem
     */
    public int getDem() {
        return dem;
    }

    /**
     * @param dem the dem to set
     */
    public void setDem(int dem) {
        this.dem = dem;
    }

    /**
     * @return the idChoice
     */
    public int getIdChoice() {
        return idChoice;
    }

    /**
     * @param idChoice the idChoice to set
     */
    public void setIdChoice(int idChoice) {
        this.idChoice = idChoice;
    }

    /**
     * @return the correctAnswer
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * @param correctAnswer the correctAnswer to set
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    /**
     * @return the explain
     */
    public String getExplain() {
        return explain;
    }

    /**
     * @param explain the explain to set
     */
    public void setExplain(String explain) {
        this.explain = explain;
    }

    /**
     * @return the contentChoice
     */
    public String[] getContentChoice() {
        return contentChoice;
    }

    /**
     * @param contentChoice the contentChoice to set
     */
    public void setContentChoice(String[] contentChoice) {
        this.contentChoice = contentChoice;
    }

}
