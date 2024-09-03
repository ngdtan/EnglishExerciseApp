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
public class Incomplete extends Question {

    private List<Choice> listChoice = new ArrayList<>();

    public Incomplete(String category, String level, String content) {
    }

    public Incomplete(Category category, Level level, String content) {
        super(category, level, content);
    }

    @Override
    public boolean isAnswer(String correctAnswer) {
        return true;
    }

    /**
     * @return the listChoice
     */
    public List getListChoice() {
        return listChoice;
    }

    /**
     * @param listChoice the listChoice to set
     */
    public void setListChoice(List listChoice) {
        this.listChoice = listChoice;
    }

}
