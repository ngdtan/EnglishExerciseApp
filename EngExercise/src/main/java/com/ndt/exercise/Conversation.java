/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndt.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class Conversation extends Question {

    private List<Choice> listChoice = new ArrayList<>();

    public Conversation() {
    }

    public Conversation(Category category, Level level, String content) {
        super(category, level, content);
    }

    @Override
    public boolean isAnswer(String correctAnswer) {
        return true;
    }

    /**
     * @return the listChoice
     */
    public List<Choice> getListChoice() {
        return listChoice;
    }

    /**
     * @param listChoice the listChoice to set
     */
    public void setListChoice(List<Choice> listChoice) {
        this.listChoice = listChoice;
    }

}
