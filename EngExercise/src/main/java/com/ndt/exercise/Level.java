/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.ndt.exercise;

/**
 *
 * @author pc
 */
public enum Level {
    EASY("easy"),
    MEDIUM("medium"),
    HARD("hard");
    private String t;

    private Level(String t) {
        this.t = t;
    }

    public String getLevel() {
        return t;
    }

}
