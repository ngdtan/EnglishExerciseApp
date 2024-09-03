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
public class MultiChoice extends Question {

    private List listChoice = new ArrayList<>();

    public MultiChoice() {
    }

    public MultiChoice(Category category, Level level, String content) {
        super(category, level, content);
    }

    @Override
    public boolean isAnswer(String correctAnswer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
