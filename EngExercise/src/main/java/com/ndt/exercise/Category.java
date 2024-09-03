/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.ndt.exercise;

/**
 *
 * @author pc
 */
public enum Category {
    NOUN("noun"),
    ADJ("adj"),
    ADV("adv"),
    VERB("verb");
    private String t;

    private Category(String t) {
        this.t = t;
    }

    public String getCategory() {
        return t;
    }
}
