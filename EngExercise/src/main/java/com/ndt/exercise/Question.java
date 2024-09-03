/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndt.exercise;

/**
 *
 * @author pc
 */
public abstract class Question {

    private int dem = 0;
    private int idQuestion = ++dem;
    private String content;
    Level level;
    Category category;

    public Question() {
    }

    public Question(Category category, Level level, String content) {
        this.category = category;
        this.level = this.level;
        this.content = content;
    }

    public abstract boolean isAnswer(String correctAnswer);

    public void showQuestion() {
        System.out.printf("ID Question: %d\nCategory: %s\nLevel: %s\nContent: %s",
                this.idQuestion, this.category, this.level, this.content);
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
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
     * @return the idQuestion
     */
    public int getIdQuestion() {
        return idQuestion;
    }

    /**
     * @param idQuestion the idQuestion to set
     */
    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

}
